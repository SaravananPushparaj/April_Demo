package Day4;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Flipkart_app {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(10000);
		
		driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
		Thread.sleep(4000);
		
		driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView").sendKeys("Reebok shoes");
		Thread.sleep(4000);
		
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		Thread.sleep(4000);
	
		//Vertical swipe
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int starty= (int)(size.height*0.80);
		int endy= (int)(size.height*0.20);
		
		int startx= (int)(size.width*0.50);
		
		for(int i=1; i<=25;i++)
		{
		driver.swipe(startx, starty, startx, endy, 1000);
		
		List<WebElement> ele = driver.findElementsByXPath("//*[@resource-id='com.flipkart.android:id/product_list_product_item_main_text'][@text='Reebok Ride Quick']");
		System.out.println(ele.size());
		
		int size2 = ele.size();
		if(size2>0)
		{
			//ele.get(0).click();
			driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_list_product_item_main_text'][@text='Reebok Ride Quick']").click();
			break;
		}
		
		}
		
		//select the size
		Thread.sleep(8000);
		for(int j=1;j<=10;j++)
		{
		
		driver.swipe(startx, starty, startx, endy, 1000);
		
		WebElement Linearlayout2 = driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_swatch_button_layout'][@index='0']");
		List<WebElement> ele2 = Linearlayout2.findElements(By.className("android.widget.LinearLayout"));
		int size3 = ele2.size();
		System.out.println(size3);
		
		if(size3>0)
		{
			
			ele2.get(2).click();
			break;
			
		}
		
		}
		
		System.out.println("Size selected");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_swatch_item_text'][@text='6']").click();
		Thread.sleep(4000);
		
		driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/product_page_bottom_bar_cart_button'][@text='+Cart']").click();
		Thread.sleep(4000);
		
		driver.findElementById("com.flipkart.android:id/cart_icon").click();
		Thread.sleep(10000);
		
		boolean Webview1 = driver.findElementByXPath("//*[@class='android.webkit.WebView'][@index='0']").isDisplayed();
		System.out.println(Webview1);
		
		
		

	}

}
