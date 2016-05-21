package ui;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class startserver {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		CommandLine command = new CommandLine("D:\\Android\\Appium\\node.exe");
		
		//command.addArgument("D:\\Android\\Appium\\node.exe");
		command.addArgument("D:\\Android\\Appium\\node_modules\\appium\\bin\\appium.js");
		
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		
		command.addArgument("--port");
		command.addArgument("4723");
		
		DefaultExecuteResultHandler ResultHandler= new DefaultExecuteResultHandler();
		DefaultExecutor executor=new DefaultExecutor();
		
		executor.execute(command, ResultHandler);
		
		Thread.sleep(12000);
		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "com.edmund.mortgageCalculator");
		capabilities.setCapability("appActivity", ".MortgageCalculator");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.findElementByXPath("//*[@index='1']").sendKeys("10000");
//		driver.findElementByXPath("//*[@class='android.widget.EditText'][@index='3']").sendKeys("12");
//		driver.findElementByXPath("//android.widget.EditText[@index='5']").sendKeys("5");
//		
//		driver.findElementByXPath("//*[@index='7']").click();
//		
//		String Result_txt = driver.findElementByXPath("//*[@index='9']").getText();
//		System.out.println(Result_txt);
//		
//		String Actual_Result = Result_txt.substring(0, 6);
//		
//		System.out.println(Actual_Result);
		
		CommandLine command2 = new CommandLine("cmd");
		
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
