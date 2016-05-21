package Day3;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Veritcal_Swipe {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
		
		//take size
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int starty=(int)(size.height*0.80);
		int endy=(int)(size.height*0.20);
		
		System.out.println("Starty is "+starty+ "Endx is "+endy);
		
		int startx=(int)(size.width*0.50);
		System.out.println("Startx is "+startx);
		
		
		Thread.sleep(8000);
		//Horizontal swipe Right to Left
		driver.swipe(startx, starty, startx, endy, 1000);
		
		Thread.sleep(4000);
		driver.swipe(startx, starty, startx, endy, 1000);
		Thread.sleep(4000);
		driver.swipe(startx, starty, startx, endy, 1000);
		Thread.sleep(4000);
		driver.swipe(startx, starty, startx, endy, 1000);
		Thread.sleep(8000);
		

	}

}
