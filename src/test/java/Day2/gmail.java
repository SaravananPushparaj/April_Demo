package Day2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class gmail {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.google.android.gm");
		capabilities.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		driver.findElementById("com.google.android.gm:id/compose_button").click();
		
		driver.findElementById("com.google.android.gm:id/to").sendKeys("saravananpushparaj@gmail.com");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		driver.findElementById("com.google.android.gm:id/subject").sendKeys("April Batch");
		
		driver.findElementById("com.google.android.gm:id/body").sendKeys("Welcome to Techaviator");
		
		driver.findElementById("com.google.android.gm:id/send").click();
		
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@class='android.widget.ImageButton'][@content-desc='Navigate up']").click();
		
		Thread.sleep(8000);
		
		driver.findElementByXPath("//*[@text='Sent'][@resource-id='com.google.android.gm:id/name']").click();
		
		Thread.sleep(15000);
		WebElement ListView = driver.findElementById("com.google.android.gm:id/conversation_list_parent_frame");
		Thread.sleep(8000);
		
				
		List<WebElement> FrameLayout = ListView.findElements(By.className("android.widget.FrameLayout"));
		System.out.println(FrameLayout.size());
		FrameLayout.get(0).click();
		
		Thread.sleep(4000);
		
		driver.findElementById("com.google.android.gm:id/send_date").click();
		
		
		String Actual_Res = driver.findElementById("com.google.android.gm:id/to_details").getText();
		System.out.println(Actual_Res);
	}

}
