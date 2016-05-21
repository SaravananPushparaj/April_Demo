package sh;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class swipe_with_element {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "kjkj");
		
		capabilities.setCapability("appPackage", "com.fortysevendeg.android.swipelistview");
		capabilities.setCapability("appActivity", "com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
				
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.fortysevendeg.android.swipelistview:id/example_row_tv_title")));
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int x1= (int)(size.width*0.20);
		int x2= (int)(size.width*0.20);
		System.out.println("X1 is  " +x1);
		TouchAction action = new TouchAction(driver);
		
		WebElement ele1 = driver.findElementByXPath("//*[@text='Adapt Sound'][@class='android.widget.TextView']");
		
//		int x1 = ele1.getLocation().getX();
//		System.out.println(x1 );
		int y1 = ele1.getLocation().getY();
		System.out.println("Y1 is  " +y1);
		action.longPress(ele1).moveTo(x1,y1).release().perform();
		
	
		
		

	}

}
