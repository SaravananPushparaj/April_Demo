package kl;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class frame_handling {

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
		
		Thread.sleep(5000);
		driver.get("http://propertiesindia.com/");	
		
		Thread.sleep(10000);

		WebElement iframe = driver.findElementByCssSelector("iframe[src='search/about.php']");
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
		driver.findElementByCssSelector("input[name='bar_category'][value='S']").click();
		
		Thread.sleep(10000);
		
	}

}
