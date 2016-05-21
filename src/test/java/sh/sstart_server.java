package sh;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sstart_server {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	
		CommandLine command = new CommandLine(
				"D:\\Android\\Appium\\node.exe");
		command.addArgument(
				"D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js",
				false);
		command.addArgument("--address", false);
		command.addArgument("127.0.0.1");
		command.addArgument("--port", false);
		command.addArgument("4723");
		//command.addArgument("--full-reset", false);
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		
			executor.setExitValue(1);
			executor.execute(command, resultHandler);
			Thread.sleep(5000);
			System.out.println("Appium server started.");
			
			Thread.sleep(10000);
			
			DesiredCapabilities capabilities= new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "GT-I9300I");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4.4");
			
			
			capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
			capabilities.setCapability("appActivity", "com.edmund.mortgageCalculator.MortgageCalculator");
			
			
			AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
			//Identify the amount, Interest, Tenure and click on calculate
			driver.findElementById("com.edmund.mortgageCalculator:id/loan_amount_field").sendKeys("10000");
			driver.findElementById("com.edmund.mortgageCalculator:id/interest_rate_field").sendKeys("12");
			driver.findElementById("com.edmund.mortgageCalculator:id/loan_term_field").sendKeys("5");
			
			driver.findElementById("com.edmund.mortgageCalculator:id/calculate").click();
			
//			String[] command1 = { "C:/usr/bin/killall", "-KILL", "node" };
//			
//			Runtime.getRuntime().exec(command1);
//			System.out.println("Appium server stopped.");
			
		//	CommandLine command = new CommandLine("cmd");
//			command.addArgument("/c");
//			command.addArgument("taskkill");
//			command.addArgument("/F");
//			command.addArgument("/IM");
//			command.addArgument("node.exe");
////
//			DefaultExecuteResultHandler resultHandler1 = new DefaultExecuteResultHandler();
//			DefaultExecutor executor1 = new DefaultExecutor();
//			executor1.setExitValue(1);
//			System.out.println("success");
			
			
			

	}

}
