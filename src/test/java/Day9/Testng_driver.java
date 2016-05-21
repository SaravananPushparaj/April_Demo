package Day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_driver {
	

//	@Test(dataProvider="dp_sum",dataProviderClass=Day9.Dataprovide_sum.class)
//	public void Summation(String Num1, String Num2, String Exp_Result)
//	{
//		
//		double Sum=Double.parseDouble(Num1)+Double.parseDouble(Num2);
//		
//		if(Sum==Double.parseDouble(Exp_Result))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		
		
		@Test(dataProvider="dp_sum",dataProviderClass=Day9.Dataprovide_sum.class)
		public void Summation1(String Num1, String Num2, String Exp_Result)
		{
			
			double Sum=Double.parseDouble(Num1)+Double.parseDouble(Num2);
			
			double Exp_Result1 = Double.parseDouble(Exp_Result);
			
			Assert.assertEquals(Sum, Exp_Result1);
			
			
	}

}
