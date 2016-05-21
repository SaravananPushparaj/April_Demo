package ui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppVsExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities Capabilities= new DesiredCapabilities();
		
		
		Capabilities.setCapability("deviceName", "SM-G350E");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "4.4.2");
		
		
		Capabilities.setCapability("appPackage", "com.boondoggle.mortcalc");
		Capabilities.setCapability("appActivity", "com.boondoggle.mortcalc.MortCalc");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		//Interact with Excel
		ExcelReadWrite xl= new ExcelReadWrite("D:\\EMI_Data1.xls");
		HSSFSheet Sheet1 = xl.Setsheet("Sheet1");
		int rowcount = xl.getrowcount(Sheet1);
		
		for(int i=1;i<=rowcount;i++)
		{
			String Amount = xl.Readvalue(Sheet1, i, "Amount");
			String Interest = xl.Readvalue(Sheet1, i, "Interest");
			String Tenure = xl.Readvalue(Sheet1, i, "Tenure");
			
			 Tenure = Tenure.replace(".0", "");
			String Exp_result = xl.Readvalue(Sheet1, i, "Exp_Result");	
						
			//interacting with application
			driver.findElementById("com.boondoggle.mortcalc:id/var_amount").clear();
			driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys(Amount);
			
			driver.findElementById("com.boondoggle.mortcalc:id/var_years").clear();
			driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys(Tenure);
			
			driver.findElementById("com.boondoggle.mortcalc:id/var_interest").clear();
			driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys(Interest);
			
			driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
			
			String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
			String Actual_result = Output.replace("$", "");
			
			xl.writecell(Sheet1, i, "Actual_Result", Actual_result);
			
			if(Exp_result.equals(Actual_result))
			{
				xl.writecell(Sheet1, i, "Status", "Pass");
			}
			else
			{
				xl.writecell(Sheet1, i, "Status", "Fail");
			}
		}
		
		xl.save_excel("D:\\EMI_Data1.xls");
		
		

	}

}
