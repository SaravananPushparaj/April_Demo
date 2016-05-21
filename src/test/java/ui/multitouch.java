package ui;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class multitouch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
File app= new File("D:\\Testing\\com.davemorrissey.labs.subscaleview.sample.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("app", app.getAbsolutePath());
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);

		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		Thread.sleep(4000);
		
		//WebElement image_ele = driver.findElementByXPath("//*[@resource-id='com.davemorrissey.labs.subscaleview.sample:id/imageView'][@index='0']");
		
//		int x= driver.manage().window().getSize().getWidth()/2;
//		int y= driver.manage().window().getSize().getHeight()/2;
//		
//		System.out.println("x is "+x+ "y is "+ y);
		
		WebElement Image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		int x= (Image.getLocation().getX())+(Image.getSize().getWidth()/2);
		int y= (Image.getLocation().getY())+(Image.getSize().getHeight()/2);
		Thread.sleep(4000);
		
		TouchAction finger1 = new TouchAction(driver);
		finger1.press(x, y-20).moveTo(x, y-100).release();
		
		TouchAction finger2 = new TouchAction(driver);
		finger2.press(x, y-20).moveTo(x, y+100).release();
		
		MultiTouchAction action= new MultiTouchAction(driver);
		action.add(finger1).add(finger2).perform();
		
		Thread.sleep(10000);
		
		//pinch
		
		TouchAction finger3 = new TouchAction(driver);
		finger3.press(x, y-100).moveTo(x, y-20).release();
		
		TouchAction finger4 = new TouchAction(driver);
		finger4.press(x, y-100).moveTo(x, y+20).release();
		
		MultiTouchAction action2= new MultiTouchAction(driver);
		action2.add(finger3).add(finger4).perform();
		
		Thread.sleep(8000);
		System.out.println("done");
		
		
		
		
	}

}
