package kl;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ola {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.olacabs.customer");
		capabilities.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
			
		//driver.findElementById("android:id/button1").click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.olacabs.customer:id/button_ride_now")));
		
		System.out.println(until.isDisplayed());
		
		WebElement Image = driver.findElementByXPath("//*[@class='android.view.View'][@index='9']");
		
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		
//		int x=(int)(size.width*0.50);
//		int y=(int)(size.height*0.50);
		
		driver.zoom(Image);
		
		Thread.sleep(18000);
		
//		driver.findElementsByXPath("//*[@resource-id='com.olacabs.customer:id/item_icon']").get(3).click();
//		Thread.sleep(5000);
//		
//		driver.findElementById("com.olacabs.customer:id/button_ride_now").click();
//		//driver.findElementByXPath("//*[@index='2'][@resource-id='com.olacabs.customer:id/other_panel']").click();
//		
//		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
	

	}

}
