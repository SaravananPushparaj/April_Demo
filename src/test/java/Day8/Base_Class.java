package Day8;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Class {
	public AppiumDriver driver;
	
	@BeforeClass
	@Parameters({"deviceID"})
	
	public void Initialize_app(String deviceID) throws ExecuteException, IOException, InterruptedException
	{
CommandLine command= new CommandLine("D:\\batch_file_execution\\hub.bat");
			
			
		DefaultExecuteResultHandler ResultHandler=new DefaultExecuteResultHandler();
		DefaultExecutor executor=new DefaultExecutor();
		executor.execute(command, ResultHandler);
		
		Thread.sleep(18000);
		
		
		CommandLine command1= new CommandLine("D:\\batch_file_execution\\d1.bat");
					
		DefaultExecuteResultHandler ResultHandler1=new DefaultExecuteResultHandler();
		DefaultExecutor executor1=new DefaultExecutor();
		executor1.execute(command1, ResultHandler1);
		
		Thread.sleep(18000);
		
		
		CommandLine command2= new CommandLine("D:\\batch_file_execution\\d2.bat");
		
		DefaultExecuteResultHandler ResultHandler2=new DefaultExecuteResultHandler();
		DefaultExecutor executor2=new DefaultExecutor();
		executor2.execute(command2, ResultHandler2);
		
		Thread.sleep(18000);
		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		if(deviceID.equalsIgnoreCase("d1"))
		{
			System.out.println("Executing in Device1");
			capabilities.setCapability("deviceName", "GT-I9300I");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4.4");
		}
		else if(deviceID.equalsIgnoreCase("d2"))
		{
			System.out.println("Executing in Device2");
			capabilities.setCapability("deviceName", "SM-G350E");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4.2");
			
		}
		
		driver= new AndroidDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

}
