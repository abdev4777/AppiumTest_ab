package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import io.appium.java_client.pagefactory.*;
import base.DriverFactory;
import base.base;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

public class LoginPage extends DriverFactory{
	PageObjects loginPage;
	//private static Logger Log = Logger.getLogger(Log.class.getName());
	public LoginPage() {
		super();
		loginPage = new PageObjects();
		PageFactory.initElements(driver, loginPage);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void check_Header(){
		loginPage.Header.getText();
	}
	public void click_skip_button() { 
		
		loginPage.SkipSignInbtn.click();
	}
	public void click_sign_in_to_account_button() { 
		loginPage.signinToAccountbtn.click();
	}
	public void click_already_a_customer() { 
		loginPage.AlreadyACustomerbtn.click();
	}
	public void click_new_user_button() { 
		loginPage.NewUserbtn.click();
	}
	
	class PageObjects{
		@FindBy(id= "in.amazon.mShop.android.shopping:id/sso_splash_logo")
		public WebElement Header;
		//Sign in to your account
		@FindBy(id = "in.amazon.mShop.android.shopping:id/signin_to_yourAccount")
		public WebElement signinToAccountbtn;

		//Skip Sign In Button
		@FindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")
		public WebElement SkipSignInbtn;

		//Already a Customer
		@FindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
		public WebElement AlreadyACustomerbtn;

		//New User
		@FindBy(id="in.amazon.mShop.android.shopping:id/new_user")
		public WebElement NewUserbtn;
	}
}




