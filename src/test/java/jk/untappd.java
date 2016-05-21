package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class untappd {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.untappdllc.app");
		capabilities.setCapability("appActivity", "com.untappdllc.app.MainActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
		Thread.sleep(20000);
		System.out.println(driver.getContext());
		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames.size());
		  //You can prints out something like NATIVE_APP , WEBVIEW_1 
		  for (String contextName : contextNames) { 
		  System.out.println(contextName);
//		  if (contextName.contains("WEBVIEW")){
//	            driver.context(contextName);
//	          }
		  }
		  
		  driver.findElementByXPath("//*[@class='android.view.View'][@index='3']").click();
		  
		  Set<String> contextNames2 = driver.getContextHandles();
			System.out.println(contextNames2.size());
			  //You can prints out something like NATIVE_APP , WEBVIEW_1 
			  for (String contextName : contextNames2) { 
//			  System.out.println(contextName);
//			  if (contextName.contains("WEBVIEW")){
//		            driver.context(contextName);
//		          }
			  }

//		  driver.findElementById("username").sendKeys("Hi");
//		  driver.findElementByClassName("pass").sendKeys("p");
//		  
//		  driver.findElementByXPath("//input[@type='submit']").click();

	}

}
