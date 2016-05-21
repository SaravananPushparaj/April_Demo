package Day2;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drag_and_drop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Interact with device and app
				DesiredCapabilities capabilities= new DesiredCapabilities();
				
				capabilities.setCapability("deviceName", "GT-I9300I");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "4.4.4");
				
				capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
				capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
				
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
				
				driver.findElementById("com.mobeta.android.demodslv:id/activity_title").click();
				
				//Thread.sleep(3000);
				List<WebElement> drag_ele = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
				System.out.println(drag_ele.size());
				System.out.println("list collected");
				
				//Touch action
				TouchAction action=new TouchAction(driver);
				//action.longPress(drag_ele.get(0)).moveTo(drag_ele.get(5)).release().perform();
				
				action.longPress(drag_ele.get(4)).moveTo(drag_ele.get(0)).release().perform();
				System.out.println("run cmpleted");
				

	}

}
