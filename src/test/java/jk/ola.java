package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ola {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.olacabs.customer");
		capabilities.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
		

	}

}
