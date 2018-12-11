package base;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CommonMethod extends DriverFactory{ 
	//MobileDriver<MobileElement> driver;
	private JavascriptExecutor js;


	public CommonMethod(){
		super();
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void scrollDown() throws Exception {

		//The viewing size of the device
		Dimension size = driver.manage().window().getSize();

		//Starting y location set to 80% of the height (near bottom)
		int starty = (int) (size.height * 0.80);
		//Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.20);
		//x position set to mid-screen horizontally
		int startx = size.width / 2;

		new TouchActions(driver)
		.down(startx, starty)
		.move(startx, endy)
		.release()
		.build()
		.perform();

	}
	public static void captureScreenshot(AndroidDriver driver, String screenshotName) {
		try{
			TakesScreenshot ts= (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
			System.out.println("screenshot taken");
		}
		catch(Exception e){
			System.out.println("Exception while taking screenshot");
		}}



}



