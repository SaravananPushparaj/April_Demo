package sh;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class switch_activ {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.findElementByXPath("//*[@class='android.app.ActionBar$Tab'][@index='3']").click();
		
		
		driver.findElementById("com.sec.android.app.clockpackage:id/menu_done").click();
//		driver.rotate(ScreenOrientation.LANDSCAPE);
//		
//		Thread.sleep(10000);
//		
//		driver.rotate(ScreenOrientation.PORTRAIT);
		
driver.startActivity("com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.ClockPackage");
		
		driver.findElementById("com.sec.android.app.clockpackage:id/txtCreateButton").click();
		
		WebElement Linear_Layout4 = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_hour");
		List<WebElement> Textview4 = Linear_Layout4.findElements(By.className("android.widget.EditText"));
		Textview4.get(0).sendKeys("2");
		
		WebElement Linear_Layout3 = driver.findElementById("com.sec.android.app.clockpackage:id/alarm_time_minute");
		List<WebElement> Textview3	 = Linear_Layout3.findElements(By.className("android.widget.EditText"));
		Textview3.get(0).sendKeys("30");
		
		driver.findElementById("com.sec.android.app.clockpackage:id/alarm_ampm_button").click();
		
		driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").click();
		
		
		
		String attribute1 = driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day6").getAttribute("checked");
		System.out.println(attribute1);
		
		
		
		

	}

}
