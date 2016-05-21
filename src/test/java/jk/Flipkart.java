package jk;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Flipkart {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "SRK");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "5.1");
	//	capabilities.setCapability("app", app.getAbsolutePath());
		
		
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(10000);
		driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
		driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView").sendKeys("Reebok shoes");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		Thread.sleep(10000);
		
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 
		int starty =(int) (size.height *0.80);
		int endy =(int) (size.height *0.20);
		
		int startx=(int)(size.width*0.50);
		
		
		System.out.println("start x  :"+ startx+"  starty  is " + starty);
		
		Thread.sleep(5000);
		//***********************************************************************************************
		for(int i=1;i<=10;i++)
		{
		driver.swipe(startx, starty, startx, endy, 1000);
		int size3 = driver.findElementsByXPath("//*[@text='Lancer Running Shoes'][@index='1']").size();
		System.out.println(size3);
		if(size3>0)
		{
			driver.findElementByXPath("//*[@text='Lancer Running Shoes'][@index='1']").click();
			break;
		}
		
	}
		
		Thread.sleep(8000);
		//********************************************************8
		//driver.swipe(startx, driver.scrollTo("Lancer Running Shoes").getLocation().getY(), startx, driver.scrollTo("Lancer Running Shoes").getLocation().getY(), 3000);
		
		for(int j=1;j<=10;j++)
		{
		driver.swipe(startx, starty, startx, endy, 1000);
		 WebElement Linearlayout = driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_swatch_button_layout'][@index='0'][@class='android.widget.LinearLayout']");
		 List<WebElement> ele = Linearlayout.findElements(By.className("android.widget.LinearLayout"));
		 int size2 = ele.size();
		 System.out.println(size2);
//		 for(WebElement element:ele)
//		 {
//			 System.out.println(element.getAttribute("class"));
//		 }
//		System.out.println(displayed);
		
		if(size2 > 0)
		{
			
			ele.get(3).click();
			break;
		}
		}
	
		driver.findElementByXPath("//*[@text='6'][@index='0']").click();
		
		driver.findElementByXPath("//*[@text='+Cart'][@index='2']").click();
		
		driver.findElementById("com.flipkart.android:id/cart_bg_icon").click();
		
		Thread.sleep(8000);
		
		System.out.println(driver.getContext());
		
		System.out.println("Done");
		
		driver.findElementByXPath("//*[@class='android.view.View'][@index='21'][@content-desc='WISHLIST']").click();
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		String Actual = driver.findElementById("com.flipkart.android:id/product_page_wishlist_image").getAttribute("enabled");
		System.out.println(Actual);
		
		
		
		
		
	}	

}

