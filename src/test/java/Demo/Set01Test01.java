/**
 * 
 */
package Demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author TechAviator
 *
 */
public class Set01Test01 {
	
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	 String baseUrl = "https://search.yahoo.com/";
	 String expCnt = "100000";
	
	 driver.get(baseUrl);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	 driver.findElement(By.id("yschsp")).clear();
	 driver.findElement(By.id("yschsp")).sendKeys("Selenium");
	 driver.findElement(By.cssSelector("input.sbb")).click();
	 
	 String var = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		System.out.println(var);
		
	//	Extract Number from alphanumeric value
		StringBuffer strBuff = new StringBuffer();
		char c;

		for (int i = 0; i < var.length() ; i++) {
		    c = var.charAt(i);

		    if (Character.isDigit(c)) {
		        strBuff.append(c);
		    }
		}
		
		System.out.println(strBuff);
		
		//Validating the results
		
		if (Integer.parseInt(strBuff.toString()) > Integer.parseInt(expCnt)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	    driver.quit();
	    
	  }
	
}
	  

	


