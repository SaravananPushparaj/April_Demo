package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Realestate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//launch the app
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", "com.edmund.mortgageCalculator.MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		String Expected_Res="222.44";
		//Identify the amount, Interest, Tenure and click on calculate
		driver.findElementById("com.edmund.mortgageCalculator:id/loan_amount_field").sendKeys("10000");
		driver.findElementById("com.edmund.mortgageCalculator:id/interest_rate_field").sendKeys("12");
		driver.findElementById("com.edmund.mortgageCalculator:id/loan_term_field").sendKeys("5");
		
		driver.findElementById("com.edmund.mortgageCalculator:id/calculate").click();
		
		//output from the app
		
		String Result_txt = driver.findElementById("com.edmund.mortgageCalculator:id/monthly_payment_field").getAttribute("text");
		System.out.println(Result_txt);
		
		String Result = Result_txt.replace(". Double tap to edit.", "");
		System.out.println(Result);
		
		//wrapper class
		double Output=Double.parseDouble(Result);
		System.out.println("Coverted to double  " +Output);
		
		DecimalFormat df= new DecimalFormat(".00");
		String Actual_Res = df.format(Output);
		
		System.out.println(Actual_Res);
		
		//validate
		
		if(Actual_Res.equals(Expected_Res))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		driver.quit();
		
	}

}
