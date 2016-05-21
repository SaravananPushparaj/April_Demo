package sh;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class app_installed {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app = new File("E:\\TechAviator\\office\\Mobile Details\\Native_app\\Done\\Drag and Drop\\com.mobeta.android.demodslv\\com.mobeta.android.demodslv.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
//		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		//driver.installApp("E:\\TechAviator\\office\\Mobile Details\\Native_app\\Done\\Drag and Drop\\com.mobeta.android.demodslv\\com.mobeta.android.demodslv.apk");
		if(driver.isAppInstalled("com.mobeta.android.demodslv")==true)
		{
			
			System.out.println("Yes it is installed");
			driver.removeApp("com.mobeta.android.demodslv");
			System.out.println("Removed again");
			driver.installApp("E:\\TechAviator\\office\\Mobile Details\\Native_app\\Done\\Drag and Drop\\com.mobeta.android.demodslv\\com.mobeta.android.demodslv.apk");
			System.out.println("Installation is succesfful");
						
		}
		else
		{
			System.out.println("Not installed");
		}
		
		
		//driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();

	}

}
