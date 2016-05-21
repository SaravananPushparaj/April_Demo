package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class khanacademy {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "org.khanacademy.android");
		capabilities.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		
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

		  

	}

}
