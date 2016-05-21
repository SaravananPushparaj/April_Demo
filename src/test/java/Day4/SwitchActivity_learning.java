package Day4;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SwitchActivity_learning {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(4000);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(2000);
		driver.findElementById("com.android.contacts:id/create_button").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Name. Editing.']").sendKeys("Archana2");
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Phone number. Double tap to edit.']").sendKeys("9885634211");

		driver.findElementById("com.android.contacts:id/menu_done").click();
		Thread.sleep(4000);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		driver.scrollTo("Archana2");
		
		Thread.sleep(4000);
		boolean Contact1 = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Archana2']").isDisplayed();
		System.out.println(Contact1);
		
		Thread.sleep(4000);
		
		//Switch to alarm
		
		driver.startActivity("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage");
		
		Thread.sleep(2000);
		
		driver.findElementById("com.sec.android.app.clockpackage:id/txtCreateButton").click();
		Thread.sleep(2000);
		
		WebElement LinearLayout = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_hour");
		List<WebElement> Edittext = LinearLayout.findElements(By.className("android.widget.EditText"));
		
		Edittext.get(0).clear();
		Edittext.get(0).sendKeys("9");
		
		Thread.sleep(4000);
		
		WebElement LinearLayout2 = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_minute");
		List<WebElement> Edittext2 = LinearLayout2.findElements(By.className("android.widget.EditText"));
		
		Edittext2.get(0).clear();
		Edittext2.get(0).sendKeys("15");
		
		Thread.sleep(4000);
		
		driver.findElementById("com.sec.android.app.clockpackage:id/alarm_ampm_button").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").click();
		Thread.sleep(4000);
		
		String Alarm_res = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_remaintime").getAttribute("text");
		System.out.println(Alarm_res);
		
		//Switch back to Contacts
		
		driver.startActivity("com.android.contacts", "com.android.contacts.activities.DialtactsActivity");
		
		Thread.sleep(4000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(4000);
		
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		Thread.sleep(2000);
		driver.findElementById("com.android.contacts:id/create_button").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Name. Editing.']").sendKeys("Archana3");
		
		Thread.sleep(2000);
		driver.hideKeyboard();
		
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@text='Phone number. Double tap to edit.']").sendKeys("9885634289");

		driver.findElementById("com.android.contacts:id/menu_done").click();
		Thread.sleep(4000);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		driver.scrollTo("Archana3");
		
		Thread.sleep(4000);
		boolean Contact2 = driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Archana3']").isDisplayed();
		System.out.println(Contact2);
		
		System.out.println("Execution Completed");
		
		
		
		
		
		
		
		
		
	}

}
