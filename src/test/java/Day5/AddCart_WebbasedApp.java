package Day5;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddCart_WebbasedApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);
		
		driver.get("http://books.rediff.com/");
		
		driver.findElementByName("srch").sendKeys("Modi");
		driver.findElementByClassName("srchbtn_n").click();
		
		Thread.sleep(15000);
		
		List<WebElement> all_links = driver.findElementsByTagName("a");
		System.out.println(all_links.size());
		
		//For each loop
		//Datatye variable_name: array
//		for(WebElement element:all_links)
//		{
//			System.out.println(element.getText());
//			String text = element.getText();
//			
//			if(text.contains("Gamechanger"))
//			{
//				element.click();
//				break;
//			}
//			
//		}
		
		for(int i=0;i<=all_links.size();i++)
		{
			System.out.println(all_links.get(i).getText());
			String text = all_links.get(i).getText();
			
			if(text.contains("Gamechanger"))
				{
					all_links.get(i).click();
					break;
				}
		}
		
		Thread.sleep(5000);
		driver.findElementByClassName("buynowbtn").click();
		Thread.sleep(5000);
		String Actual = driver.findElementByCssSelector("#currentcartdiv > div.cart_prd_row > div.prddetail > span:nth-child(1)").getText();
		
		if(Actual.contains("Gamechanger"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		

	}

}
