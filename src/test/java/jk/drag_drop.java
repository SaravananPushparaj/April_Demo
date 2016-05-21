package jk;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class drag_drop {
	
	public static void main(String[] args) throws MalformedURLException {
		
		File app = new File("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
		//File app = new File(appDir, "com.mobeta.android.demodslv.apk");
		
		DesiredCapabilities Capabilities= new DesiredCapabilities();
//		Capabilities.setCapability("deviceName", "Karbonn A34 Lite");
//		Capabilities.setCapability("platformName", "Android");
//		Capabilities.setCapability("platformVersion", "4.2.2");
//		//Capabilities.setCapability("app", app.getAbsolutePath());
		
		Capabilities.setCapability("deviceName", "Moto E");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "5.1");
		Capabilities.setCapability("app", app.getAbsolutePath());
		
//		Capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
//		Capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

		driver.findElementsById("com.mobeta.android.demodslv:id/activity_title").get(0).click();
		
		List<WebElement> element = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(element.size());
		
		new TouchAction((MobileDriver)driver).longPress(element.get(0)).moveTo(element.get(3)).release().perform();

	}

}
