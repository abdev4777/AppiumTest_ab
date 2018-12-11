package base;
import org.testng.log4testng.Logger;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class DriverFactory extends base {
	//Logger log = Logger.getLogger("devpinoyLogger");
	protected AndroidDriver driver;
	public DriverFactory(){

		this.driver = super.getDriver();

	}
}	
