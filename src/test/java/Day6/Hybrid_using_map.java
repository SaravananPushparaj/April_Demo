package Day6;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hybrid_using_map {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\Burger_King\\bk-mobile-native.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300I");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Hcl Go Lifes");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(10000);
		
		driver.findElementById("android:id/button1").click();
		
		//get the context
		
		Set<String> contextHandles = driver.getContextHandles();
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		///get into Web view
		for(String contextname:contextHandles)
		{
			System.out.println(contextname);
			if(contextname.contains("WEBVIEW"))
			{
				hashMap.put("webview", contextname);
				driver.context(contextname);
			}
			else
			{
				hashMap.put("native", contextname);
				driver.context(contextname);
			}
		}
		
		
		WebDriverWait wait= new WebDriverWait(driver, 75);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Confirm')]")));
		
		System.out.println(until.isDisplayed());
		
		//Click event is in Native
		
		driver.context(hashMap.get("native"));
		System.out.println(hashMap.get("native"));
		
		WebDriverWait wait2= new WebDriverWait(driver, 75);
		WebElement until2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@content-desc='CONFIRM COUNTRY'][@index='18'][@class='android.view.View']")));
		
		System.out.println(until2.isDisplayed());
		
		driver.findElementByXPath("//*[@content-desc='CONFIRM COUNTRY'][@index='18'][@class='android.view.View']").click();
		//Zip code is web view
		driver.context(hashMap.get("webview"));
		
		Thread.sleep(15000);
		driver.findElementByName("zip").sendKeys("27012");
		//Native
		//get started is native
		driver.context(hashMap.get("native"));
		
		Thread.sleep(15000);
		
		driver.findElementByXPath("//*[@content-desc='GET STARTED'][@index='17'][@class='android.view.View']").click();
		
		//Register is web view
		driver.context(hashMap.get("webview"));
		
		Thread.sleep(15000);
		
		boolean displayed = driver.findElementByClassName("intro-slide-register").isDisplayed();

		if(displayed==true)
		{
			System.out.println("pass");
		}
		else
			
		{
			System.out.println("Fail");
		}

	}


	}


