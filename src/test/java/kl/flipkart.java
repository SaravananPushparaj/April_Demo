package kl;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class flipkart {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(8000);
		
		driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
		
		driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView").sendKeys("Reebok shoes");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int starty=(int)(size.height*0.80);
		int endy=(int)(size.height*0.20);
		
		int startx=(int)(size.width*0.50);
		
		Thread.sleep(8000);
		for(int i=1; i<=10;i++)
		{
			driver.swipe(startx, starty, startx, endy, 1000);
			
			int size2 = driver.findElementsByXPath("//*[@class='android.widget.TextView'][@text='Reebok Ride Quick']").size();
			if(size2>0)
			{
				driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Reebok Ride Quick']").click();
				break;
			}
		}
		Thread.sleep(8000);
		
		
		for(int j=1; j<=10;j++)
		{
			driver.swipe(startx, starty, startx, endy, 1000);
			
			WebElement Linearlayout = driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_swatch_button_layout'][@class='android.widget.LinearLayout'][@index='0']");
			 List<WebElement> ele = Linearlayout.findElements(By.className("android.widget.LinearLayout"));
			 int size3 = ele.size();
			if(size3>0)
			{
				ele.get(3).click();
				break;
			}
		}
		
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_swatch_item_text'][@text='6']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_bottom_bar_cart_button'][@text='+Cart']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/cart_icon'][@index='2']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//*[@class='android.view.View'][@content-desc='CHECKOUT']").click();
		Thread.sleep(4000);
		
	}

}
