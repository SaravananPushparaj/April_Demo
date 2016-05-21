package Day6;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;

public class driver_Start {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Appium_template c1= new Appium_template();
		
		c1.Startserver1();
		Thread.sleep(15000);
		
		String emi = c1.EMI("10000", "5", "12");
		System.out.println(emi);
		
		Thread.sleep(15000);
		c1.Stopserver();

	}

}
