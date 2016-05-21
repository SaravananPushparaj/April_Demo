package ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_clss {
	
	AndroidDriver driver;
	
	@BeforeClass
	@Parameters({"deviceID"})
	
	public void start_app(String deviceID) throws MalformedURLException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		if(deviceID.equalsIgnoreCase("d1"))
		{
			System.out.println("Executing Device1");
			capabilities.setCapability("deviceName", "GT-I9300I");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4.4");
		}
		else if(deviceID.equalsIgnoreCase("d2"))
		{
			System.out.println("Executing Device2");
			capabilities.setCapability("deviceName", "SM-G350E");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4.2");
			
		}
		
		driver= new AndroidDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
	
	}
	

}
