package testpar;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest extends bseclass{
	
	
	
	
  @Test
  public void f() throws MalformedURLException {

//		
//		DesiredCapabilities capabilities1= new DesiredCapabilities();
//		
//		capabilities1.setCapability("deviceName", "GT-I9300I");
//		capabilities1.setCapability("platformName", "Android");
//		capabilities1.setCapability("platformVersion", "4.4.4");
		
//		capabilities1.setCapability("deviceName", "Moto E");
//		capabilities1.setCapability("platformName", "Android");
//		capabilities1.setCapability("platformVersion", "5.1");
//		
//		capabilities1.setCapability("appPackage", "com.boondoggle.mortcalc");
//		capabilities1.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
//		
//		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities1);
		
		//***************************************************************
		String Expected_Res="222.44";
	
		
		//Identify Price element and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys("20000");
		//IdentifyYears and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys("2");
		//Identify Interest and enter values
		driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys("10");
		
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

  	
  @AfterClass
  public void afterClass() {
  }

}
