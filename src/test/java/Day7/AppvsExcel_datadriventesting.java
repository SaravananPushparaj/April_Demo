package Day7;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.remote.DesiredCapabilities;

import Day6.ExcelReadWrite;

public class AppvsExcel_datadriventesting {

	public static void main(String[] args) throws IOException {
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
				
				//Interactinng with excel
				ExcelReadWrite xl= new ExcelReadWrite("D:\\EMI_Data1.xls");
				
				HSSFSheet Sheet1 = xl.Setsheet("Sheet1");
				
				int Rowcount = xl.getrowcount(Sheet1);
				
				for(int i=1;i<=Rowcount;i++)
				{
					String Amount = xl.Readvalue(Sheet1, i, "Amount");
					String Interest = xl.Readvalue(Sheet1, i, "Interest");
					String Tenure	 = xl.Readvalue(Sheet1, i, "Tenure");
					Tenure=Tenure.replace(".0", "");
					//System.out.println(Tenure);
					String Exp_Result = xl.Readvalue(Sheet1, i, "Exp_Result");
					
					//interact with app
					
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
							
					String Actual_Res = Output.replace("$", "");
					
					xl.writecell(Sheet1, i, "Actual_Result", Actual_Res);
					
					if(Exp_Result.equals(Actual_Res))
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
