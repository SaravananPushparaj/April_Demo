package jk;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class drag_and_drop2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Process process;	
//		String Start_Server="C:\\Program Files\\nodejs\\node.exe  D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js ";
//		
//		Runtime runtime = Runtime.getRuntime();
//		process=runtime.exec(Start_Server);
//		
//		if(process!=null)
//		{
//			System.out.println("Appium started");
//		}
//		else
//		{
//			System.out.println("Appium did NOT initailize");
//		}
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//driver.scrollTo("Single-choice mode");
		
		driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
//		List<WebElement> drag_elements = driver.findElementsByXPath("//*[@index='0'][@class='android.widget.TextView']");
//		System.out.println(drag_elements.size());
		
//		for(WebElement element:drag_elements)
//		{
//			System.out.println(element.getText());
//		}
		
//		for(int i=0; i<drag_elements.size();i++)
//		{
//			System.out.println(drag_elements.get(i).getText());
//		}
		
		//driver.scrollTo("Mark Turner");
		List<WebElement> element = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(element.size());
		
		TouchAction action = new TouchAction(driver);
		
		action.longPress(element.get(1)).moveTo(element.get(8)).release().perform();
		
		action.longPress(element.get(4)).moveTo(element.get(1)).release().perform();
		
		
		
	}

}
