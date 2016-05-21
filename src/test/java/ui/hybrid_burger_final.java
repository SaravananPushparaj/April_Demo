package ui;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hybrid_burger_final {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		File app = new File("C:\\Users\\TechAviator\\Downloads\\Burger_King\\bk-mobile-native.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 //capabilities.setCapability("automationName","Selendroid");

		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300I");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 
//			capabilities.setCapability("appPackage", "com.emn8.mobilem8.nativeapp.bknz-1.apk");
//			capabilities.setCapability("appActivity", "com.emn8.mobilem8.nativeapp.bknz-1.BKNativeMobileApp");

		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		WebDriverWait wait= new WebDriverWait(driver, 60);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
		 System.out.println(until.isDisplayed());
		 
		 driver.findElementById("android:id/button1").click();
		 		 
		System.out.println(driver.getContext());
		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames.size());
		  //You can prints out something like NATIVE_APP , WEBVIEW_1 
		  for (String contextName : contextNames) { 
		  System.out.println(contextName);
		  if (contextName.contains("NATIVE")){
	            driver.context(contextName);
	          }
		  }
		  
		
		  
		  WebDriverWait wait2= new WebDriverWait(driver, 120);
			WebElement until2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@index='18'][@content-desc='CONFIRM COUNTRY'][@class='android.view.View']")));
			
			 System.out.println(until2.isDisplayed());
	  
			 driver.findElementByXPath("//*[@index='18'][@content-desc='CONFIRM COUNTRY'][@class='android.view.View']").click();
			 
			  Thread.sleep(18000);
			 Set<String> contextNames2 = driver.getContextHandles();
		        for (String contextName : contextNames2) {
		          System.out.println(contextName);
		          if (contextName.contains("WEBVIEW")){
		            driver.context(contextName);
		          }
		        }
		        
		        
//		        Thread.sleep(2000);
//		        WebElement ele = driver.findElement(By.xpath("//input[@name='country'][@class='x-input-text']"));
//		       
//
//		        
		        
		         
		         
		    
	        
			 
		        Thread.sleep(18000);
		        

		        
		      
		        
		        driver.context("WEBVIEW");	
		        
		        Thread.sleep(8000);
		        driver.findElementByName("zip").sendKeys("27412");
		        
		        Set<String> contextNames3 = driver.getContextHandles();
		        for (String contextName : contextNames3) {
		          System.out.println(contextName);
		          if (contextName.contains("NATIVE")){
		            driver.context(contextName);
		          }
		        }
	
		        Thread.sleep(8000);
	        driver.findElement(By.xpath("//*[@class='android.view.View'][@index='17'][@content-desc='GET STARTED']")).click();
		        
		        System.out.println("Done");
//		        
		       

	}

}
