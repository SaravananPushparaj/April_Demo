package Day1;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Realestate_xpath_way {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", ".MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@index='1']").sendKeys("10000");
		driver.findElementByXPath("//*[@class='android.widget.EditText'][@index='3']").sendKeys("12");
		driver.findElementByXPath("//android.widget.EditText[@index='5']").sendKeys("5");
		
		driver.findElementByXPath("//*[@index='7']").click();
		
		String Result_txt = driver.findElementByXPath("//*[@index='9']").getText();
		System.out.println(Result_txt);
		
		String Actual_Result = Result_txt.substring(0, 6);
		
		System.out.println(Actual_Result);
		
		

	}

}
