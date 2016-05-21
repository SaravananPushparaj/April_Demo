package jk;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class whatsapp1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//File appDir = new File("E:\\TechAviator\\office\\Mobile Details\\Native_app\\Drag and Drop\\com.mobeta.android.demodslv");
//		
//		File appDir = new File("E:\\TechAviator\\office\\Mobile Details\\Native_app\\Whatsapp");
//		File app = new File(appDir, "com.whatsapp-v2.12.183-450573-Android-2.1.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "Moto E");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
	//	capabilities.setCapability("app", app.getAbsolutePath());
		
		
		capabilities.setCapability("appPackage", "com.whatsapp");
		capabilities.setCapability("appActivity", "com.whatsapp.Conversation");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
//		WebElement frameLayout = driver.findElement(By.id("android:id/action_bar_container"));
//		List<WebElement> textView = frameLayout.findElements(By.className("android.widget.TextView"));
//		System.out.println(textView.size());
//		textView.get(1).click();
//		
//		driver.findElement(By.id("android:id/search_src_text")).sendKeys("Way2Automation");
//		
//		TouchAction action = new TouchAction((MobileDriver)driver);
//		action.tap(276, 224).perform();
//		
//		
//		driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Hello");
//		driver.findElement(By.id("com.whatsapp:id/send")).click();
//		
//		driver.findElement(By.id("com.whatsapp:id/camera_btn")).click();
//		driver.findElement(By.id("com.whatsapp:id/shutter")).click();
//		
//		driver.findElement(By.id("com.whatsapp:id/caption")).sendKeys("New Image");
//	
//		driver.sendKeyEvent(AndroidKeyCode.ENTER);
//		driver.findElement(By.id("com.whatsapp:id/ok")).click();
		
		

	}

}
