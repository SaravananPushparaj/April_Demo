package Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_learning {
	
	public static void main(String[] args) {
		
		
		List<String> arrlist= new ArrayList<String>();
		
		arrlist.add("Mangoes");
		arrlist.add("banana");
		arrlist.add("apple");
		arrlist.add("grapes");
		arrlist.add("Mangoes");
		
		
		//For each
		
//		for(String x:arrlist)
//		{
//			System.out.println(x);
//			
//		}
		
		//Normal for loop
		
//		for(int i=0;i<arrlist.size();i++)
//		{
//			System.out.println(arrlist.get(i));
//		}
		
		
		//Iterator
		
		Iterator<String> itr = arrlist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
