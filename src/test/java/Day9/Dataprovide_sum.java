package Day9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

public class Dataprovide_sum {
	
	@DataProvider(name="dp_sum")
	public static Iterator<String[]> getdata() throws IOException
	{
		
		ExcelReadWrite xl= new ExcelReadWrite("D:\\Sum1.xls");
		
		HSSFSheet Sheet1 = xl.Setsheet("Sheet1");
		
		int RowCount = xl.getrowcount(Sheet1);
		
		List<String []> arr_list= new ArrayList<String []>();
		
		for(int i=1;i<=RowCount;i++)
		{
			
			String [] arr= new String[3];
			
			arr[0]=xl.Readvalue(Sheet1, i, "Num1");
			arr[1]=xl.Readvalue(Sheet1, i, "Num2");
			arr[2]=xl.Readvalue(Sheet1, i, "Exp_Result");
			
			arr_list.add(arr);
			
			
		}
		
		return arr_list.iterator();
		
	}
	

}
