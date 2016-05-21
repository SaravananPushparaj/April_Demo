package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class swipevertical {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "flipboard.app");
		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flipboard.app:id/home_feed_cover_item_image")));
		System.out.println(until.isDisplayed());
		
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		
//		int starty=(int)(size.height*0.80);
//		int endy=(int)(size.height*0.20);
//		
//		System.out.println("Starty "+starty+ "Endy  "+endy);
//		
//		int startx=(int)(size.width/2);
//		System.out.println("Startx  "+startx);
		
		
		
		
		for(int i=1;i<=4;i++)
		{
		driver.swipe(407, 1115, 407, 473, 1000);
		}
		
		Thread.sleep(10000);
		
		for(int j=1;j<=4;j++)
		{
		driver.swipe(426, 436, 426, 961, 1000);
		}
		
		
		
		
		
	}

}
