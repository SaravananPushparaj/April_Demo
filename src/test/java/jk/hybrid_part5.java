package jk;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class hybrid_part5 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File app = new File("C:\\Users\\TechAviator\\Downloads\\selendroid-test-app-0.9.0.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 //capabilities.setCapability("automationName","Selendroid");

		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300I");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 
//			capabilities.setCapability("appPackage", "com.emn8.mobilem8.nativeapp.bknz-1.apk");
//			capabilities.setCapability("appActivity", "com.emn8.mobilem8.nativeapp.bknz-1.BKNativeMobileApp");

		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


	}

}
