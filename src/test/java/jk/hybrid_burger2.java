package jk;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hybrid_burger2 {

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
		  
		  Thread.sleep(25000);
		  
//		  WebDriverWait wait2= new WebDriverWait(driver, 60);
//			//WebElement until2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-comp-1023']/div[4]/span[1]")));
//			WebElement until2 = wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'COuntry')]/span"))));
//			 System.out.println(until2.isDisplayed());
//			 
//	  
//			 Set<String> contextNames2 = driver.getContextHandles();
//		        for (String contextName : contextNames2) {
//		          System.out.println(contextName);
//		          if (contextName.contains("WEBVIEW")){
//		            driver.context(contextName);
//		          }
		   //     }
			 
		   //     Thread.sleep(8000);
		       // driver.findElementByXPath("//*[@index='18'][@content-desc='CONFIRM COUNTRY'][@class='android.view.View']").click();

			Set<String> contextNames3 = driver.getContextHandles();
			System.out.println(contextNames3.size());
			  //You can prints out something like NATIVE_APP , WEBVIEW_1 
			  for (String contextName : contextNames3) { 
			  System.out.println(contextName);
			  if (contextName.contains("WEBVIEW")){
		            driver.context(contextName);
		          }
			  }
		        driver.findElement(By.xpath("//span[@class='x-button-label'][contains(text(),'Confirm COuntry')]")).click();
		       
	}
	
	}


