package kl;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Isappinstalled {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("app", app.getAbsolutePath());
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		if(driver.isAppInstalled("com.mobeta.android.demodslv"))
		{
			System.out.println("App installed successfully");
			
			driver.removeApp("com.mobeta.android.demodslv");
			System.out.println("App removed again");
			
			driver.installApp("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
			System.out.println("Installed again");
		}
		else
		{
			System.out.println("NOT installed");
		}

	}

}
