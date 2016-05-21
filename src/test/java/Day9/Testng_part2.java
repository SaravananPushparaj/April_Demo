package Day9;

import org.testng.annotations.Test;

public class Testng_part2 {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Log into app");
	}
	
	@Test(priority=2)
	public void sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(priority=3)
	public void closeapp()
	{
		System.out.println("Close the app");
	}
	


}
