package Day9;

import org.testng.annotations.Test;

public class Testng_part3 {
	
	@Test
	public void login()
	{
		int Result=4/0;
		System.out.println("Log into app");
	}
	
	@Test(dependsOnMethods={"login"})
	public void sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(dependsOnMethods={"login"})
	public void closeapp()
	{
		System.out.println("Close the app");
	}
	


}
