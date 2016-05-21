package Day5;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Screenshot_learning {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(4000);
		
		TakesScreenshot screenshot= (TakesScreenshot)(driver);
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\Testing\\April.png"));
		
		

	}

}
