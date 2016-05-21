package ui;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;

public class driver_stsrt_stop {

	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Base_Class c1= new Base_Class();
		
		c1.Startserver1();
		Thread.sleep(12000);
		
		String emi = c1.EMI("10000", "12", "5");
		System.out.println(emi);
		
		Thread.sleep(10000);
		c1.StopServer1();

	}

}
