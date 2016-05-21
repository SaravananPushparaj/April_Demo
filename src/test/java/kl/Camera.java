package kl;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Camera {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.sec.android.app.camera");
		capabilities.setCapability("appActivity", "com.sec.android.app.camera.Camera");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
//		MultiTouchAction maction= new MultiTouchAction(driver);
//		Thread.sleep(4000);
//		
//		
//	
//		driver.sendKeyEvent(AndroidKeyMetastate.META_CAPS_LOCK_ON);
//		
		Thread.sleep(5000);
		
		int x=driver.manage().window().getSize().getWidth()/2;
		int y=driver.manage().window().getSize().getHeight()/2;
		
		driver.zoom(x, y);
		Thread.sleep(15000);
		
//		driver.pinch(300, 200);
//		Thread.sleep(8000);
		
		TouchAction action= new TouchAction(driver);		
		action.tap(70, 50).perform();
		
		Thread.sleep(4000);
		action.tap(1184,359).perform();
		Thread.sleep(4000);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Gallery'][@index='3']").click();
		
		System.out.println("Done");
		
		

	}

}
