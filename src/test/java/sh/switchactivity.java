package sh;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class switchactivity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("com.android.contacts:id/create_button").click();
		
	
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Name. Editing.']").sendKeys("Archana1");
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Phone number. Double tap to edit.']").sendKeys("9980098301");
		
		//driver.hideKeyboard();
		
		driver.findElementById("com.android.contacts:id/menu_done").click();
		
		Thread.sleep(5000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		Thread.sleep(5000);
		
		driver.scrollTo("Archana");
		
		driver.startActivity("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage");
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		driver.findElementById("com.sec.android.app.clockpackage:id/txtCreateButton").click();
		
		WebElement Linear_Layout = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_hour");
		List<WebElement> Textview = Linear_Layout.findElements(By.className("android.widget.EditText"));
		Textview.get(0).sendKeys("2");
		
		WebElement Linear_Layout2 = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_minute");
		List<WebElement> Textview2	 = Linear_Layout2.findElements(By.className("android.widget.EditText"));
		Textview2.get(0).sendKeys("30");
		
		driver.findElementById("com.sec.android.app.clockpackage:id/alarm_ampm_button").click();
		
		driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").click();
		
		
		
		String attribute = driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").getAttribute("checked");
		System.out.println(attribute);
		
		

	}

}
