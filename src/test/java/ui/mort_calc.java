package ui;

import org.testng.annotations.Test;

public class mort_calc extends Base_clss {
	
	@Test
	public void EMI_Calc()
	{
		
		String Expected_Res="222.44";
		
		//Identify Price element and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys("10000");
				//IdentifyYears and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys("5");
				//Identify Interest and enter values
				driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys("12");
				
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

}
