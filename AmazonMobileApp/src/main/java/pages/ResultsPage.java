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

import base.DriverFactory;
import base.base;

import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends DriverFactory{
	PageObjects results;
	public ResultsPage() {
		super();
		results = new PageObjects();
		PageFactory.initElements(driver, results);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void click_hamburger_button() { 
		results.Hamburgerbtn.click();
	}

	public void click_search_button() { 
		results.SearchBarbtn.click();
	}
	public void click_my_cart_button() { 
		results.MyCartbtn.click();
	}
	public void click_on_kindle_product() { 
		results.KindleProduct.click();
	}

	class PageObjects{
		//Hamburger button
		@FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
		public WebElement Hamburgerbtn;

		//My Cart
		@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart_count")
		public WebElement MyCartbtn;

		//Search Button
		@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_search")
		public WebElement SearchBarbtn;

		//Kindle product list
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View")
		public WebElement KindleProduct;



	}
}




