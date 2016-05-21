package sh;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class app_installed_2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("app", app.getAbsolutePath());
		
//		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
//		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(8000);
		if(driver.isAppInstalled("com.mobeta.android.demodslv")==true)
		{
			System.out.println("Installed");
			driver.removeApp("com.mobeta.android.demodslv");
			System.out.println("app removed");
//			driver.installApp("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
//			System.out.println("Again app instlled");
		}
		

	}

}
