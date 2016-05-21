package sh;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class gmail {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.google.android.gm");
		capabilities.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementById("com.google.android.gm:id/compose_button").click();
		
		driver.findElementById("com.google.android.gm:id/to").sendKeys("saravananpushparaj@gmail.com");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		//driver.sendKeyEvent(AndroidKeyMetastate.META_CAPS_LOCK_ON);
		
		driver.findElementById("com.google.android.gm:id/subject").sendKeys("Test Mail");
		
		
		driver.findElementById("com.google.android.gm:id/composearea_tap_trap_bottom").sendKeys("Welcome App");
		
		driver.findElementById("com.google.android.gm:id/send").click();
		Thread.sleep(10000);
		
		driver.findElementByXPath("//*[@class='android.widget.ImageButton'][@index='0']").click();
		
//		WebElement tool_bar = driver.findElementById("com.google.android.gm:id/mail_toolbar");
//		//tool_bar.findElement(by)
//		List<WebElement> findElements = tool_bar.findElements(By.xpath("//*[@index='0'][@class='android.widget.ImageButton']"));
//		System.out.println(findElements.size());
//		findElements.get(0).click();
		
//		driver.findElementById("com.google.android.gm:id/send").click();
		Thread.sleep(5000);
//		String context = driver.getContext();
//		System.out.println(context);
		//driver.findElementByXPath("//*[@class='android.widget.ImageView'][@index='0'][text='Sent']").click();
		
		WebElement LinearLayout = driver.findElementByXPath("//*[@class='android.widget.LinearLayout'][@index='8']");
		List<WebElement> Imagelayout = LinearLayout.findElements(By.className("android.widget.ImageView"));
		
		System.out.println(Imagelayout.size());
		Imagelayout.get(0).click();
		
		
		Thread.sleep(5000);
		
		WebElement FrameLayout = driver.findElementByXPath("//*[@class='android.widget.FrameLayout'][@resource-id='com.google.android.gm:id/conversation_list_parent_frame'][@index='0']");
		List<WebElement> Viewlayout = FrameLayout.findElements(By.className("android.view.View"));
		
		System.out.println(Viewlayout.size());
		Viewlayout.get(0).click();
		
		
//		driver.findElementById("com.google.android.gm:id/send_date").click();
//		String text = driver.findElementById("com.google.android.gm:id/to_details").getText();
//		
//		System.out.println(text);
//		
//		String Expected_Res="saravananpushparaj@gmail.com";
//		
//		if(text.equals(Expected_Res))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		
//		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
//		
	}

}
