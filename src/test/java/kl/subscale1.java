package kl;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class subscale1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\com.davemorrissey.labs.subscaleview.sample.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("app", app.getAbsolutePath());
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageDisplay").click();
		
		Thread.sleep(5000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int x=(int)(size.width*0.50);
		int y=(int)(size.height*0.50);
		
		System.out.println("x  is "+x+"y is  "+y);
		
		WebElement image_ele = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
//		driver.zoom(image_ele);
//		System.out.println("Zoom is succesfull");
//		Thread.sleep(15000);
//		
//		
//		driver.pinch(image_ele);
//		System.out.println("Pinch is succesfull");
//		Thread.sleep(15000);
		
		driver.zoom(x, y);
		System.out.println("Zoom is succesfull");
		Thread.sleep(18000);
//		
		
		
		driver.pinch(x, y);
		System.out.println("Pinch is succesfull");
		Thread.sleep(18000);
 
	}

}
