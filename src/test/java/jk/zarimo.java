package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class zarimo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "SRK");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "5.1");
	//	capabilities.setCapability("app", app.getAbsolutePath());
		
		
		capabilities.setCapability("appPackage", "com.techzone.android.zarimotest");
		capabilities.setCapability("appActivity", "com.techzone.android.zarimotest.MainActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(10000);
		
		Set<String> contextNames2 = driver.getContextHandles();
		System.out.println(contextNames2.size());
		  //You can prints out something like NATIVE_APP , WEBVIEW_1 
		  for (String contextName : contextNames2) { 
		  System.out.println(contextName);
//		  if (contextName.contains("WEBVIEW")){
//	            driver.context(contextName);
//	          }
		  }

	}

}
