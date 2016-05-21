package Day6;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class multitouch_learning {

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
		
		Thread.sleep(5000);
		
		WebElement Image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");

		
		Thread.sleep(5000);
		int x=Image.getLocation().getX()+Image.getSize().getWidth()/2;
		int y= Image.getLocation().getY()+Image.getSize().getHeight()/2;
				
		//Zoom out
		TouchAction finger1= new TouchAction(driver);
		finger1.press(Image, x, y-20).moveTo(Image,x,y-50);
		
		TouchAction finger2= new TouchAction(driver);
		finger2.press(Image, x, y+20).moveTo(Image, x, y+50);
		
		
		
		MultiTouchAction action= new MultiTouchAction(driver);
		action.add(finger1).add(finger2).perform();
		System.out.println("Zoom Done");
		Thread.sleep(10000);
		
		
		
		//zoom in or pinch
		
//		TouchAction finger3= new TouchAction(driver);
//		finger3.press(Image, x, y-20).moveTo(Image, x, y-10);
//		
//		TouchAction finger4= new TouchAction(driver);
//		finger4.press(Image, x, y+20).moveTo(Image, x, y+10);
//		
//		
//		MultiTouchAction action2= new MultiTouchAction(driver);
//		action2.add(finger3).add(finger4).perform();
//		
//		System.out.println("Pinch Done");
//		Thread.sleep(10000);
//		
		
		
		
		
		
	}

}
