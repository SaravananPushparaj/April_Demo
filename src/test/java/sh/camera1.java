package sh;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class camera1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.sec.android.app.camera");
		capabilities.setCapability("appActivity", "com.sec.android.app.camera.Camera");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(8000);
		
		WebElement ele = driver.findElementByXPath("//*[@resource-id='com.sec.android.app.camera:id/base_layout'][@index='0']");
		System.out.println(driver.currentActivity());
		
		//driver.rotate(ScreenOrientation.PORTRAIT);
		
		TouchAction action= new TouchAction(driver);
		//action.longPress(70, 50).release().perform();
		action.tap(70, 50).release().perform();
		
		Thread.sleep(4000);
		action.tap(1184, 362).release().perform();
		
		//action.longPress(1180, 178).release().perform();
		
		
		Thread.sleep(4000);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		Thread.sleep(8000);
		WebElement gallery_ele = driver.findElementByXPath("//*[@index='3'][@class='android.widget.TextView']");
		gallery_ele.click();
//		Set<String> contextHandles = driver.getContextHandles();
//		
//		System.out.println(contextHandles.size());
//		for(String element:contextHandles)
//		{
//			System.out.println(element);
//		}
//		
//		driver.sendKeyEvent(AndroidKeyCode.ENTER);
//		
//		Thread.sleep(8000);
//		
//		driver.sendKeyEvent(AndroidKeyCode.BACK);
//		
		
//		
		
		

	}

}
