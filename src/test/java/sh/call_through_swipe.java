package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class call_through_swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@index='3'][@class='android.app.ActionBar$Tab']").click();
		
		Thread.sleep(5000);
		
		driver.scrollTo("Office2");
		
		//driver.scrollToExact("Office2");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int startx=(int)(size.width*0.20);
		int endx=(int)(size.width*0.80);
		
		WebElement contact_ele = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Office2']");
		int starty = contact_ele.getLocation().getY();
		
//		driver.swipe(startx, starty, endx, starty, 2000);
//		
//		System.out.println("Number Dailled");
//		Thread.sleep(7000);
//		
//		driver.findElementById("com.android.phone:id/endButton").click();
//		
//		System.out.println("Call ended");
		
		driver.swipe(endx, starty, startx, starty, 2000);
		
		Thread.sleep(8000);
		
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Msg through appium \n"+
				"Hello  \n"+
				"Welcome 12");
		driver.findElementById("com.android.mms:id/send_button").click();
		
		

	}

}
