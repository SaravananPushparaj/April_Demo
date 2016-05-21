package Day5;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ola {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.olacabs.customer");
		capabilities.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		
		Thread.sleep(4000);
		
		//alert- NOT implemented in native apps
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		driver.findElementById("android:id/button1").click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@resource-id='com.olacabs.customer:id/button_ride_now'][@text='RIDE NOW']")));
		System.out.println(until.isDisplayed());
		
		driver.findElementByXPath("//*[@resource-id='com.olacabs.customer:id/button_ride_now'][@text='RIDE NOW']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@resource-id='com.olacabs.customer:id/other_panel'][@index='2']").click();
		Thread.sleep(4000);
		String Actual = driver.findElementById("com.olacabs.customer:id/button_ride_conform").getAttribute("text");
		System.out.println(Actual);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
	}

}
