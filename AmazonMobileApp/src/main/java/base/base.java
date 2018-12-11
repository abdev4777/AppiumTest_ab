package base;

import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
//import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.LoginPage;



public class base {
	private final static String APP_PACKAGE_NAME = "in.amazon.mShop.android.shopping";
	private final static String APP_ACTIVITY_NAME = "com.amazon.mShop.splashscreen.StartupActivity";
	private final static String Device_Name= "Honor Play";
	protected static AndroidDriver androidDriver=null;

	@BeforeClass
	public void setup(){
		initDriver();
	}

	public AndroidDriver getDriver() {

		return androidDriver;
	}

	public void initDriver(){
		System.out.println("inside init method");
		DesiredCapabilities capabilities = DesiredCapabilities.android(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Device_Name);
		capabilities.setCapability("browserName", "");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
		
		//AndroidDriver driver = null;
		try {
			androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}







