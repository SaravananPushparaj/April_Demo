package Day5;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Zoom_pinch_learning {

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

		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageDisplay").click();
		Thread.sleep(4000);
		
		WebElement image_ele = driver.findElementByXPath("//*[@resource-id='com.davemorrissey.labs.subscaleview.sample:id/imageView'][@index='0']");
		
		driver.zoom(image_ele);
		Thread.sleep(15000);
		
		driver.pinch(image_ele);
		Thread.sleep(15000);
		
		

		
	}

}
