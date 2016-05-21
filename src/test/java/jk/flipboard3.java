//bpackage jk;
//
//import io.appium.java_client.android.AndroidDriver;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class flipboard3 {
//
//	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//		// TODO Auto-generated method stub
//DesiredCapabilities capabilities= new DesiredCapabilities();
//		
//		capabilities.setCapability("deviceName", "GT-I9300I");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "4.4.4");
//		
//		capabilities.setCapability("appPackage", "flipboard.app");
//		capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
//		
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);	
//
//		//driver.findElementById("flipboard.app:id/home_feed_cover_item_text").click();
//		
//		 Dimension size = driver.manage().window().getSize();
//		 System.out.println(size);
//		 
//		int startx =(int) (size.width *0.80);
//		int endx =(int) (size.width *0.20);
//		
//		int starty=size.height/2;
//		int endy=size.height/2;
//		
//		System.out.println("start x  :"+ startx+"  starty  is " + starty);
//		
//		Thread.sleep(5000);
//		
//		
//		
//		driver.swipe(startx, starty, endx, starty, 500);
//		Thread.sleep(5000);
//		driver.swipe(startx, starty, endx, starty, 500);
//		Thread.sleep(5000);
//		driver.swipe(startx, starty, endx, starty, 500);
//		Thread.sleep(5000);
//		driver.swipe(startx, starty, endx, starty, 500);
//		
//		Thread.sleep(5000);
//		driver.swipe(endx, starty, startx, starty, 500);
//		Thread.sleep(5000);
//		
//		driver.swipe(endx, starty, startx, starty, 500);
//		Thread.sleep(5000);
//		driver.swipe(endx, starty, startx, starty, 500);
//		Thread.sleep(5000);
//		driver.swipe(endx, starty, startx, starty, 500);
//		Thread.sleep(5000);
//		
//		
//
//	}
//
//}
