package sh;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class sending_sms {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "gh");
		
		capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@content-desc='Compose Button'][@class='android.widget.TextView']").click();
		
		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys("9686247721");
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Msg through appium \n"+
				"Hello  \n"+
				"Welcome 12");
		
		driver.sendKeyEvent(AndroidKeyCode.BACKSPACE);
		driver.sendKeyEvent(AndroidKeyCode.BACKSPACE);
		
		
		driver.findElementById("com.android.mms:id/send_button").click();
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
		String Actual = driver.findElementsById("com.android.mms:id/from").get(0).getText();
		System.out.println(Actual);
	}

}
