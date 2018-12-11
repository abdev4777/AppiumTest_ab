package base;
import java.net.URL;
import java.sql.Driver;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class dryrun{
	//@Parameters({"DEVICE_NAME", "DEVICE_ID", "DEVICE_URL", "PLATFORM" })
	//@BeforeTest/
	@Test
	public void dryru() throws Exception{
System.out.println("143");
		DesiredCapabilities capabilities =new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","8.1");
		capabilities.setCapability("deviceName", "Honor Play");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		AppiumDriver  driver= new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(3000);
		//return capabilities;
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		
	}

}
