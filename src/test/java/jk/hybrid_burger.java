package jk;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class hybrid_burger {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\Drag_drop\\Hybrid App_v1.0_apkpure.com .apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "SRK");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "5.1");
	//	capabilities.setCapability("app", app.getAbsolutePath());
		
		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "com.spellthem.webpages");
//		capabilities.setCapability("appActivity", "com.spellthem.webpages.MainActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(20000);
				
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames.size());
		  //You can prints out something like NATIVE_APP , WEBVIEW_1 
		  for (String contextName : contextNames) { 
		  System.out.println(contextName); 
		  }
		
		  driver.findElementById("com.spellthem.webpages:id/action_settings").click();
		  driver.findElementByXPath("//*[@class='android.view.View'][@index='1']").sendKeys("www.google.com");
		  driver.findElementById("com.spellthem.webpages:id/go").click();
		  Thread.sleep(20000);
		  
		  Set<String> contextNames1 = driver.getContextHandles();
			System.out.println(contextNames1.size());
			  //You can prints out something like NATIVE_APP , WEBVIEW_1 
			  for (String contextName : contextNames1) { 
			  System.out.println(contextName);
			  if (contextName.contains("WEBVIEW")){
		            driver.context(contextName);
		          }
			  }
			 
		  driver.findElementByXPath("//*[@class='android.widget.Spinner'][@index='0']").sendKeys("Appium");
		  driver.findElementByXPath("//*[@class='android.widget.Button'][@index='2']").click();
		  
		  Thread.sleep(15000);
		  
		  
		  

	}

}
