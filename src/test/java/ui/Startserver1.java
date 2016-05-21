package ui;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Startserver1 {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		CommandLine command = new CommandLine("C:\\Program Files\\nodejs\\node.exe");
		command.addArgument("D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js");
		
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		
		command.addArgument("--port");
		command.addArgument("4723");
		
		DefaultExecuteResultHandler ResultHandler= new DefaultExecuteResultHandler();
		DefaultExecutor executor=new DefaultExecutor();
		
		executor.execute(command, ResultHandler);
		Thread.sleep(12000);
		//**********************************************************************
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//Identify the Price txtbox and enter the values
				driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys("10000");
				//Identify the Years txtbox and enter the values
				driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys("5");
				//Identify the Interest txtbox and enter the values
				driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys("12");
				
				//Identify the Calculate btn and click
				driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
				
				//Identify the result and get the output
				String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
				System.out.println(Output);
				
				String Actual_Res = Output.replace("$", "");
				System.out.println(Actual_Res);
				
				
				//************************************************
				Thread.sleep(12000);
				CommandLine command2= new CommandLine("cmd");
				
				command2.addArgument("/c");
				command2.addArgument("taskkill");
				command2.addArgument("/F");
				command2.addArgument("/IM");
				command2.addArgument("node.exe");
				
				DefaultExecuteResultHandler ResultHandler2= new DefaultExecuteResultHandler();
				DefaultExecutor executor2=new DefaultExecutor();
				
				executor2.execute(command2, ResultHandler2);
		
	}

}
