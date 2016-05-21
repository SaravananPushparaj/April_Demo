package sh;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Scroll_to {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(2000);
		
		driver.scrollTo("BBNL_Support");
		
//		WebElement View_Layout = driver.findElementByXPath("//*[@class='android.view.View'][@index='3']");
//		List<WebElement> Textview = View_Layout.findElements(By.xpath("//*[@class='android.widget.TextView'][text='Rajesh']"));
//		WebElement ele = Textview.get(0);
		
		WebElement ele = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='BBNL_Support'][@index='1']");
		
//		int x = ele.getLocation().getX();
//		System.out.println("x is "+x);
//		int y = ele.getLocation().getY();
//		System.out.println("y is "+y);
//		
//		int x1=(int)(x*0.20);
//		int x2=(int)(x*0.80);
//		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int x1= (int)(size.width*0.20);
		int x2= (int)(size.width*0.80);
		System.out.println("X1 is  " +x1);
		int y = ele.getLocation().getY();
	System.out.println("y is "+y);
//		
		int y1=(int)(y*0.30);
		
//		TouchAction action= new TouchAction(driver);
//		action.longPress(ele).moveTo(x1, y).moveTo(x2, y).release().perform();
		
		System.out.println("Searched");
		
		//driver.swipe(x1, y, x2, y, 2000);
		//driver.swipe(x2, y, x1, y, 2000);
		System.out.println("success");
		
	}

}
