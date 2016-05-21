package Demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://search.yahoo.com/");
		driver.findElement(By.id("yschsp")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().window().maximize();
		String str=driver.findElement(By.xpath("//span[contains(text(), 'results')]")).getText();
		System.out.println(str);
		
		
		String output = str.replace(" results", "");
		System.out.println(output);
		String result = output.replace(",", "");
		System.out.println(result);
		int actual=Integer.parseInt(result);
		if(actual>100000)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
    
        
        
		}
		
		

	}


