package Day3;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Call_through_Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(4000);
		
		driver.scrollTo("Office2");
		
		Thread.sleep(3000);
		
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int startx= (int)(size.width*0.20);
		int endx= (int)(size.width*0.80);
		
		WebElement Call_ele = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Office2']");
		int starty = Call_ele.getLocation().getY();
		
		Thread.sleep(5000);
		
		driver.swipe(startx, starty, endx, starty, 1000);
		

	}

}
