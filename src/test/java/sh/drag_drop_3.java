package sh;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class drag_drop_3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "kjkj");
		
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", ".Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		
		List<WebElement> basic_usage = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		
		int size = basic_usage.size();
		System.out.println(size);
		
		TouchAction action= new TouchAction(driver);
		//from 1 st to 6
		action.longPress(basic_usage.get(0)).moveTo(basic_usage.get(5)).release().perform();
		
		//from 7 to 3
		action.longPress(basic_usage.get(6)).moveTo(basic_usage.get(1)).release().perform();
		
		

	}

}
