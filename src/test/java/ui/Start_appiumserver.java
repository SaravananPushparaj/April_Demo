package ui;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Start_appiumserver {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//****************************************
		//Server initialization through code
		Process process;
		String Start_Server="C:\\Program Files\\nodejs\\node.exe D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js";
		
		Runtime runtime = Runtime.getRuntime();
		process=runtime.exec(Start_Server);
		
		if(process!=null)
		{
			System.out.println("Appium started");
		}
		else
		{
			System.out.println("Appium did NOT initailize");
		}
		
		Thread.sleep(10000);
		DesiredCapabilities Capabilities= new DesiredCapabilities();
		Capabilities.setCapability("deviceName", "SM-G350E");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "4.4.2");
		
		Capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		Capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

		driver.findElementsById("com.mobeta.android.demodslv:id/activity_title").get(0).click();
		
		List<WebElement> element = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(element.size());
		
		new TouchAction((MobileDriver)driver).longPress(element.get(0)).moveTo(element.get(3)).release().perform();
		
		if(process!=null)
		{
			process.destroy();
			System.out.println("Appium is Stopped");
		}

	}

}
