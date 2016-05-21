package ui;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hybrid_burger2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		File app= new File("D:\\Testing\\Burger_King\\bk-mobile-native.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300I");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);
		
		Set<String> contextHandles1 = driver.getContextHandles();
		for(String contextname1:contextHandles1)
		{
			System.out.println(contextname1);
			
			if(contextname1.contains("NATIVE"))
			{
			driver.context(contextname1);			
			}
		}
		
		//**********************************************************************************
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement yes_btn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
		System.out.println(yes_btn.isDisplayed());
		
		driver.findElementById("android:id/button1").click();
		
		Set<String> contextHandles2 = driver.getContextHandles();
		
		for(String contextname2:contextHandles2)
		{
			System.out.println(contextname2);
			
			if(contextname2.contains("WEBVIEW"))
			{
			driver.context(contextname2);
			}
			
		}
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		WebElement Conf_btn = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Confirm')]")));
		System.out.println(Conf_btn.isDisplayed());
		
		
	//***************************************************************************	
		
		
		for(String contextname2:contextHandles2)
		{
			System.out.println(contextname2);
			
			if(contextname2.contains("NATIVE"))
			{
			driver.context(contextname2);
			}
			
		}
			
		WebDriverWait wait2 = new WebDriverWait(driver, 90);
		WebElement Conf_btn2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@index='18'][@content-desc='CONFIRM COUNTRY'][@class='android.view.View']")));
		System.out.println(Conf_btn2.isDisplayed());
				
		driver.findElementByXPath("//*[@index='18'][@content-desc='CONFIRM COUNTRY'][@class='android.view.View']").click();
	//**********************************************************************************
		for(String contextname2:contextHandles2)
		{
			System.out.println(contextname2);
			
			if(contextname2.contains("WEBVIEW"))
			{
			driver.context(contextname2);
			}
			
		}
		
		Thread.sleep(9000);
		
		driver.findElementByName("zip").sendKeys("27012");
		
		//********************************************************************
		
		for(String contextname2:contextHandles2)
		{
			System.out.println(contextname2);
			
			if(contextname2.contains("NATIVE"))
			{
			driver.context(contextname2);
			}
			
		}
		
		Thread.sleep(15000);
		driver.findElementByXPath("//*[@index='17'][@content-desc='GET STARTED'][@class='android.view.View']").click();		

		//**************************************************************************
		for(String contextname2:contextHandles2)
		{
			System.out.println(contextname2);
			
			if(contextname2.contains("WEBVIEW"))
			{
			driver.context(contextname2);
			}
			
		}
		Thread.sleep(8000);
		WebElement Register_ele = driver.findElementByClassName("intro-slide-register");
		boolean displayed = Register_ele.isDisplayed();
		
		if(displayed==true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
