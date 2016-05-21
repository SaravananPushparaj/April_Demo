package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ola {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "kjkj");
		
		capabilities.setCapability("appPackage", "com.olacabs.customer");
		capabilities.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles.size());
		
		
		
//		
//		String context = driver.getContext();
//		System.out.println(context);
//		driver.context(context);
//		
//		WebElement ele = driver.findElementByXPath("//*[@text='Use location?'][@class='android.widget.TextView']");
//		
//		
//		
//		String dialog_text = ele.getText();
//		System.out.println(dialog_text);
		
		//Thread.sleep(10000);
		
		//driver.switchTo().alert().accept();
		
		
		//driver.findElementByXPath("//*[@text='Yes'][@class='android.widget.Button']").click();		
		
		
		
		
		WebDriverWait wait= new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='RIDE NOW'][@index='2'][@class='android.widget.Button']")));
		
		
		//driver.findElementByXPath("//*[@text='Prime'][@index='3'][@class='android.widget.TextView']").click();
		
		//driver.findElementsById("com.olacabs.customer:id/item_icon").get(3).click();
	    driver.findElementByXPath("//*[@text='RIDE NOW'][@index='2'][@class='android.widget.Button']").click();
				
		driver.findElementById("com.olacabs.customer:id/text_mini_header").click();
		
		driver.findElementById("com.olacabs.customer:id/button_ride_cancel").click();
	}

}
