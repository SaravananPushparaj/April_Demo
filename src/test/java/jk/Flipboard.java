package jk;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Flipboard {

	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "GT-I9300I");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability("appPackage", "flipboard.app");
		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElements(By.id("flipboard.app:id/coverStoryContainer")).get(0).click();
		
	
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		clickLayout(0);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		clickLayout(1);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
		clickLayout(2);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
		clickLayout(3);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.swipe(420, 1264, 420, 758, 1000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
}
	
	
	
	public static void clickLayout(int x){
		
		
		WebElement flipboard =driver.findElement(By.id("flipboard.app:id/tilesContainer"));
		List<WebElement> frameLayout = flipboard.findElements(By.className("android.widget.FrameLayout"));
		frameLayout.get(x).click();
		
		
		
	}

	}


