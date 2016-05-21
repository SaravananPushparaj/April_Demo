package Day6;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_template {
	
	
	public void Startserver1() throws ExecuteException, IOException
	{
		CommandLine command= new CommandLine("C:\\Program Files\\nodejs\\node.exe");
		
		command.addArgument("D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js");
		
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		
		command.addArgument("--port");
		command.addArgument("4723");
		
		DefaultExecuteResultHandler ResultHandler=new DefaultExecuteResultHandler();
		DefaultExecutor executor=new DefaultExecutor();
		
		
		executor.execute(command, ResultHandler);
		
	}
	
	public String EMI(String Amount, String Tenure,String Interest) throws MalformedURLException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//Identify Price element and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys(Amount);
				//IdentifyYears and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys(Tenure);
				//Identify Interest and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys(Interest);
				
				//Identify  element and click on the btn
				driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
				
				//get the output
				String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
				System.out.println(Output);
				
				String Actual_Res = Output.replace("$", "");
				System.out.println(Actual_Res);
				
				return Actual_Res;
				
	}
	
	
	public void Stopserver() throws ExecuteException, IOException
	{
		CommandLine command2= new CommandLine("cmd");
		
		command2.addArgument("/c");
		command2.addArgument("taskkill");
		command2.addArgument("/F");
		command2.addArgument("/IM");
		command2.addArgument("node.exe");
		
		DefaultExecuteResultHandler ResultHandler2=new DefaultExecuteResultHandler();
		DefaultExecutor executor2=new DefaultExecutor();
		
		
		executor2.execute(command2, ResultHandler2);
	}

}
