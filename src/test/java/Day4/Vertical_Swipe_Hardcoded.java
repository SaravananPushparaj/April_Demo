package Day4;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vertical_Swipe_Hardcoded {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "flipboard.app");
		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//explicit wait
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flipboard.app:id/home_feed_cover_item_image")));
		System.out.println(until.isDisplayed());
		
		
		driver.swipe(365, 1088, 340, 220, 1000);
		Thread.sleep(4000);
		driver.swipe(365, 1088, 340, 220, 1000);
		Thread.sleep(4000);
		driver.swipe(365, 1088, 340, 220, 1000);
		Thread.sleep(4000);
		driver.swipe(365, 1088, 340, 220, 1000);
		Thread.sleep(4000);
		driver.swipe(362, 190, 400, 1150, 1000);
		Thread.sleep(4000);

	}

}
