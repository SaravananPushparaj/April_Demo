package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class wunderlist {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.wunderkinder.wunderlistandroid");
		capabilities.setCapability("appActivity", "com.wunderkinder.wunderlistandroid.activity.WLStartViewFragmentActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementById("com.wunderkinder.wunderlistandroid:id/LoginButton").click();
		
		driver.findElementById("com.wunderkinder.wunderlistandroid:id/login_email_edittext").sendKeys("saravananpushparaj@gmail.com");
		driver.findElementById("com.wunderkinder.wunderlistandroid:id/login_password_edittext").sendKeys("google9$");
		driver.findElementById("com.wunderkinder.wunderlistandroid:id/login_button").click();

	}

}
