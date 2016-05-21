package Demo;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Testcase1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//******************************************************
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//***************************************************************
		//String Expected_Res="222.44";
		for(int i=1;i<=3;i++)
		{
		System.out.println("---------"+i +"  iteration-----------");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		String Amount = sc.next();
		
		System.out.println("Enter the Year");
		String Years = sc.next();
		
		System.out.println("Enter the Interst");
		String interest = sc.next();
		
		System.out.println("Enter the Expected Result");
		String Expected_Res = sc.next();
		
		
		//Identify Price element and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys(Amount);
		//IdentifyYears and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys(Years);
		//Identify Interest and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys(interest);
		
		//Identify  element and click on the btn
		driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
		
		//get the output
		String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
		System.out.println(Output);
		
		String Actual_Res = Output.replace("$", "");
		System.out.println(Actual_Res);
		
		//Validate
		if(Actual_Res.equals(Expected_Res))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		}
		//close
		driver.quit();
		
	}

}
