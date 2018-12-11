package in.amazon.mshop.AmazonMobileApp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonMethod;
import base.DriverFactory;
import base.base;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
//import junit.framework.Assert;
import pages.AddToCart;
import pages.HomePage;
//import base.capabilitiesManager;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import pages.LoginPage;
import pages.ResultsPage;
import pages.ShopByCategory;

public class FindAProduct_Test extends base  {

	@Test(priority=1)
	@Description("This step is to skip the login") 

	public void loginTest(){

		LoginPage loginPage = new LoginPage();
		loginPage.click_skip_button();


	}

	@Test(priority=2)
	@Description("This step is to check navigation to shop by category from home page")

	public void homePageTest(){

		HomePage homePage= new HomePage();
		homePage.click_shop_by_category_button();
	}

	@Test(priority=3)
	@Description("This Step is to check availablity of kindle E-book Reader")
	public void checkAvailability() throws Exception{

		ShopByCategory shopbycategory= new ShopByCategory();
		ResultsPage results=new ResultsPage();
		AddToCart addtocart=new AddToCart();

		shopbycategory.click_Kindle_EReader_and_Ebooks();
		shopbycategory.click_Kidle_EReaders();
		results.click_on_kindle_product();
		addtocart.check_availability();
	}

	@AfterMethod

	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			CommonMethod.captureScreenshot(getDriver(),result.getName());
		}
	}}







