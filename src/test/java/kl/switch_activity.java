package kl;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class switch_activity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities= new DesiredCapabilities();

		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(4000);
		
		driver.findElementById("com.android.contacts:id/create_button").click();
		
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Name. Editing.']").sendKeys("Archana2");
		
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Phone number. Double tap to edit.']").sendKeys("9980098302");
		
		driver.findElementById("com.android.contacts:id/menu_done").click();
		
		Thread.sleep(3000);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
//		Thread.sleep(2000);
		
		driver.scrollTo("Archana2");
		
		boolean contact1 = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Archana2']").isDisplayed();
		System.out.println(contact1);
		
		Thread.sleep(5000);
		driver.startActivity("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage");
		
		driver.findElementById("com.sec.android.app.clockpackage:id/txtCreateButton").click();
		
		WebElement Linear_layout = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_hour");
		Linear_layout.findElements(By.className("android.widget.EditText")).get(0).clear();
		Linear_layout.findElements(By.className("android.widget.EditText")).get(0).sendKeys("5");
		
		Thread.sleep(2000);
		
		WebElement Linear_layout2 = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_minute");
		Linear_layout2.findElements(By.className("android.widget.EditText")).get(0).clear();
		Linear_layout2.findElements(By.className("android.widget.EditText")).get(0).sendKeys("35");
		
		Thread.sleep(3000);
		driver.findElementById("com.sec.android.app.clockpackage:id/alarm_ampm_button").click();
		
		Thread.sleep(3000);
		driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").click();
		
		String Actual = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_remaintime").getAttribute("text");
		System.out.println(Actual);
		
		driver.startActivity("com.android.contacts", "com.android.contacts.activities.DialtactsActivity");
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(4000);
		
		driver.findElementById("com.android.contacts:id/create_button").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Name. Editing.']").sendKeys("Archana3");
		
		driver.hideKeyboard();
		
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Phone number. Double tap to edit.']").sendKeys("9980098301");
		
		driver.findElementById("com.android.contacts:id/menu_done").click();
		
		Thread.sleep(3000);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
//		Thread.sleep(5000);
		
		driver.scrollTo("Archana3");
		
		Thread.sleep(5000);
		
		boolean contact2 = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Archana3']").isDisplayed();
		System.out.println(contact2);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		
	}

}
