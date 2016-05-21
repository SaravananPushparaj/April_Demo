package jk;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

import org.openqa.selenium.remote.DesiredCapabilities;

public class realestate3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", ".MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		String Expected_Res="222.44";
		
		driver.findElementById("loan_amount_field").sendKeys("10000");
		driver.findElementById("interest_rate_field").sendKeys("12");
		driver.findElementById("loan_term_field").sendKeys("5");
		
		driver.findElementById("calculate").click();
		
		String Result_txt = driver.findElementById("monthly_payment_field").getAttribute("text");
		System.out.println(Result_txt);
		
		String Result = Result_txt.substring(0, 6);
		System.out.println(Result);
		
//		String Result = Result_txt.split(" ")[0];
//		System.out.println(Result);
		
//		String Result = Result_txt.replace(". Double tap to edit.", "");
//		System.out.println(Result);
//		
//		double Output= Double.parseDouble(Result);
//		System.out.println("Converted to double " +Output);
//		
//		DecimalFormat df= new DecimalFormat(".00");
//		String Actual_Res  = df.format(Output);
//		System.out.println(Actual_Res);
		
			
		if(Result.equals(Expected_Res))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}
