package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipboard2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "kjkj");
		
		capabilities.setCapability("appPackage", "flipboard.app");
		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
				
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flipboard.app:id/home_feed_cover_item_text")));
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int startx= (int) (size.width);
		int endx= (int) (size.width);
		
		
		int starty=size.height/2;
		
		
		System.out.println("Starty  "+starty);
		System.out.println("Startx  "+startx +"Endx  "+endx);
		
		Thread.sleep(5000);
		
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		
		
		Thread.sleep(5000);
		
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		

	}

}
