	package jk;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class realestate4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Process process;
		String Start_Server="D:\\Android\\Appium\\node.exe  D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js ";
		
		Runtime runtime = Runtime.getRuntime();
		process=runtime.exec(Start_Server);
		
		if(process!=null)
		{
			System.out.println("Appium started");
		}
		else
		{
			System.out.println("Appium did NOT initailize");
		}
		
		//Thread.sleep(3000);
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", ".MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		String Expected_Res="222.44";
		
		driver.findElementByXPath("//*[@package='com.edmund.mortgageCalculator'][@index='1']").sendKeys("10000");
		driver.findElementByXPath("//*[@index='3']").sendKeys("12");
		driver.findElementByXPath("//*[@index='5']").sendKeys("5");
		driver.findElementByXPath("//*[@index='7']").click();
		
		String Result_txt = driver.findElementByXPath("//android.widget.EditText[@index='9']").getText();
		System.out.println(Result_txt);
		
		String Actual_Result = Result_txt.substring(0, 6);
		System.out.println(Actual_Result);
		
		if(Actual_Result.equals(Expected_Res))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();
		
		if(process!=null)
		{
			process.destroy();
			System.out.println("Appium is Stopped");
		}

	}

}
