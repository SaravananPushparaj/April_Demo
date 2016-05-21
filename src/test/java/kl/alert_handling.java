package kl;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class alert_handling {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.get("http://indiaproperties.com/");
		
		driver.findElementById("btnPropSearch").click();
		
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(10000);
		alert.accept();
		
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		

	}

}
