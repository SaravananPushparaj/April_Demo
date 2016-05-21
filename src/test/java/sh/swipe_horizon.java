package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

public class swipe_horizon {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "flipboard.app");
		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(8000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		
		int startx=(int)(size.width*0.80);
		int endx=(int)(size.width*0.20);
		
		System.out.println("Startx "+startx+ "Endx  "+endx);
		
		int starty=(int)(size.height/2);
		System.out.println("Starty "+starty);
		
		
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.swipe(startx, starty, endx, starty, 1000);
		
		Thread.sleep(6000);
		
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		driver.swipe(endx, starty, startx, starty, 1000);
		
		
		

	}

}
