package Day5;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class whatsapp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "SM-G350E");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.2");
		
		capabilities.setCapability("appPackage", "com.whatsapp");
		capabilities.setCapability("appActivity", "com.whatsapp.Main");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		
		Thread.sleep(4000);
		
		driver.findElementByXPath("//*[@resource-id='com.whatsapp:id/tab'][@text='CONTACTS']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@resource-id='com.whatsapp:id/contactpicker_row_name'][@text='Raj']").click();
		Thread.sleep(4000);
		driver.findElementById("com.whatsapp:id/entry").sendKeys("Hello April batch");
		driver.findElementById("com.whatsapp:id/send").click();
	}

}
