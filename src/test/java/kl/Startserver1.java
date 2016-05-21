package kl;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Startserver1 {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		CommandLine command=new CommandLine("D:\\Android\\Appium\\node.exe");
		
		command.addArgument("D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js");
		command.addArgument("--address",false);
		command.addArgument("127.0.0.1");
		command.addArgument("--port",false);
		command.addArgument("4723");
		
		DefaultExecuteResultHandler resultHandler=new DefaultExecuteResultHandler();
		DefaultExecutor executor= new DefaultExecutor();
		
		executor.execute(command, resultHandler);
		
		Thread.sleep(12000);
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", "com.edmund.mortgageCalculator.MortgageCalculator");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
		//Identify the amount, Interest, Tenure and click on calculate
		driver.findElementById("com.edmund.mortgageCalculator:id/loan_amount_field").sendKeys("10000");
//		driver.findElementById("com.edmund.mortgageCalculator:id/interest_rate_field").sendKeys("12");
//		driver.findElementById("com.edmund.mortgageCalculator:id/loan_term_field").sendKeys("5");
//		
//		driver.findElementById("com.edmund.mortgageCalculator:id/calculate").click();
//		
//		Thread.sleep(12000);
		
		CommandLine command1=new CommandLine("cmd");
		command1.addArgument("/c");
		command1.addArgument("taskkill");
		command1.addArgument("/F");
		command1.addArgument("/IM");
		command1.addArgument("node.exe");
		
		DefaultExecuteResultHandler resultHandler2=new DefaultExecuteResultHandler();
		DefaultExecutor executor2= new DefaultExecutor();
		
		executor2.execute(command1, resultHandler2);
		
		

	}

}
