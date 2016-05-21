package Day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sending_sms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Interact with device and app
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", ".ui.ConversationComposer");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//*****************************************
		
		driver.findElementByXPath("//*[@index='0'][@content-desc='Compose Button']").click();
		
		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys("9886113003");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Msg through Appium");
		
		WebElement Send_btn = driver.findElementById("com.android.mms:id/send_button");
		Send_btn.click();
		//android keycode
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		List<WebElement> ele = driver.findElementsById("com.android.mms:id/from");
		String Actual_Result = ele.get(0).getText();
		
		System.out.println(Actual_Result);
	}

}
