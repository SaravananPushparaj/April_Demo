package sh;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class whatapp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto E");
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
		
		capabilities.setCapability("appPackage", "com.whatsapp");
		capabilities.setCapability("appActivity", "com.whatsapp.Main");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(10000);
		//driver.findElementByXPath("//*[@resource-id='com.whatsapp:id/tab'][@text='CONTACTS']").click();
		
		driver.findElementByXPath("//*[@class='android.widget.RelativeLayout'][@index='2']").click();
		
		WebElement Frame_layout = driver.findElementByXPath("//*[@class='android.widget.RelativeLayout'][@index='2']");
		
		//WebElement image_layout = Frame_layout.findElements(By.id("com.whatsapp:id/image")).get(0);
		
		TouchAction Action=new TouchAction(driver);
		
		Action.longPress(Frame_layout).perform();
		
			
		driver.findElementById("com.whatsapp:id/conversation_call_btn").click();
		
		//driver.switchTo().alert().accept();
		
		driver.findElementById("android:id/button1").click();
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
	}

}
