package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Wallgreens {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "SRK");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "5.1");
	//	capabilities.setCapability("app", app.getAbsolutePath());
		
		
		capabilities.setCapability("appPackage", "com.usablenet.mobile.walgreen");
		capabilities.setCapability("appActivity", "com.usablenet.mobile.walgreen.AppStart");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(12000);
		
		driver.findElementById("com.usablenet.mobile.walgreen:id/btn_home_shop").click();
		driver.findElementByXPath("//*[@resource-id='com.usablenet.mobile.walgreen:id/category_textview'][@text='Personal Care'][@index='1']").click();
		
		driver.findElementByXPath("//*[@resource-id='com.usablenet.mobile.walgreen:id/category_textview'][@text='Hair Care'][@index='2']").click();

		driver.findElementByXPath("//*[@resource-id='com.usablenet.mobile.walgreen:id/category_textview'][@text='Shampoo'][@index='0']").click();
		
		Thread.sleep(20000);
		System.out.println(driver.getContext());
		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames.size());
		  //You can prints out something like NATIVE_APP , WEBVIEW_1 
		  for (String contextName : contextNames) { 
		  System.out.println(contextName); 
		  }
		
	}

}
