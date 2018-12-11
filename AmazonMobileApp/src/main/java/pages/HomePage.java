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
//import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.*;
import base.CommonMethod;
import base.DriverFactory;
import base.base;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverFactory{
	PageObjects homePage;
	public HomePage() {
		super();
		homePage = new PageObjects();
		PageFactory.initElements(driver, homePage);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void click_hamburger_button() { 
		homePage.Hamburgerbtn.click();
	}
	public void click_shop_by_category_button() { 
		homePage.ShopByCategorybtn.click();
    	
		
	}
	public void click_search_button() { 
		homePage.SearchBarbtn.click();
	}
	public void click_my_cart_button() { 
		homePage.MyCartbtn.click();
	}

	class PageObjects{
		//Hamburger button
		@FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
		public WebElement Hamburgerbtn;

		//Shop By category button
		@FindBy(id="in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
		public WebElement ShopByCategorybtn;

		//Search Button
		@FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
		public WebElement SearchBarbtn;

		//My Cart
		@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart_count")
		public WebElement MyCartbtn;
	}
}




