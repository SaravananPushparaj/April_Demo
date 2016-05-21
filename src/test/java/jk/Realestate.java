package jk;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Realestate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Andriod");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", "com.edmund.mortgageCalculator.MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("10000");
		

	}

}
