package kl;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class addcart {

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
		
		driver.get("http://books.rediff.com/");
		
		driver.findElementByName("srch").sendKeys("Modi");
		driver.findElementByClassName("srchbtn_n").click();
		
		Thread.sleep(10000);
		
		List<WebElement> all_links = driver.findElementsByTagName("a");
		System.out.println(all_links.size());
		
//		for(WebElement element:all_links)
//		{
//			System.out.println(element.getText());
//			String Linktext = element.getText();
//			
//			if(Linktext.contains("Gamechanger"))
//			{
//				element.click();
//				break;
//			}
//		}
		
		for(int i=0; i<=all_links.size();i++)
		{
			System.out.println(all_links.get(i).getText());
			String Linktext = all_links.get(i).getText();
			if(Linktext.contains("Gamechanger"))
				{
				all_links.get(i).click();;
					break;
				}
			
		}
		Thread.sleep(5000);
		driver.findElementByClassName("buynowbtn").click();
		
		Thread.sleep(5000);
		String Actual_result = driver.findElementByCssSelector("#currentcartdiv > div.cart_prd_row > div.prddetail > span:nth-child(1)").getText();
		System.out.println(Actual_result);
		driver.quit();
	}

}
