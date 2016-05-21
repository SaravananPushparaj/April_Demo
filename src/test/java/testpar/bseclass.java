package testpar;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class bseclass {
	AndroidDriver driver;
	
	@BeforeClass
	@Parameters({"deviceID"})
	public void startTime(String device_id) throws IOException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		if(device_id.equalsIgnoreCase("d1")){
	System.out.println("hi");
			capabilities.setCapability("deviceName","491f18f4");
			capabilities.setCapability("platformVersion", "4.4.4");
			capabilities.setCapability("platformName", "ANDROID");

		}else if(device_id.equalsIgnoreCase("d2")){
			System.out.println("hello");
			capabilities.setCapability("deviceName","42030213ccdfa100");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("platformName", "ANDROID");
		}
		
				 driver = new AndroidDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		     
	}

}
