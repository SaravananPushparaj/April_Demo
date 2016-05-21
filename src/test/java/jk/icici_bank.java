package jk;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

public class icici_bank {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 

		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300I");
		 
		 capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.csam.icici.bank.imobile");
		 capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.csam.icici.bank.imobile.IMOBILE");

		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		 System.out.println(driver.getContext());
			
			Set<String> contextNames = driver.getContextHandles();
			System.out.println(contextNames.size());
			  //You can prints out something like NATIVE_APP , WEBVIEW_1 
			  for (String contextName : contextNames) { 
			  System.out.println(contextName);
			  if (contextName.contains("WEBVIEW")){
		            driver.context(contextName);
		          }
			  }
			  
			  
	}

}
