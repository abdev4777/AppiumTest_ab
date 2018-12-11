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

public class ShopByCategory extends DriverFactory{
	PageObjects shopByCategoryPage;
	public ShopByCategory() {
		super();
		shopByCategoryPage = new PageObjects();
		PageFactory.initElements(driver, shopByCategoryPage);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void click_hamburger_button() { 
		shopByCategoryPage.Hamburgerbtn.click();
	}

	public void click_search_button() { 
		shopByCategoryPage.SearchBarbtn.click();
	}
	public void click_my_cart_button() { 
		shopByCategoryPage.MyCartbtn.click();
	}
	public void click_Kindle_EReader_and_Ebooks() { 
		
		shopByCategoryPage.KindleEReadersandEbooks.click();
	}
	public void click_Kidle_EReaders(){
		shopByCategoryPage.KindleEReaders.click();
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

		//Shop By category button
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]")
		public WebElement EchoAndAlexa;

		//FireTvStick
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]")
		public WebElement FireTvStick;

		//Kindle E-Reader and E-books
		@FindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]")
		public WebElement KindleEReadersandEbooks;

		//Kindle E-Readers
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]")
		public WebElement KindleEReaders;

		//Amazon Prime Video
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View/android.view.View[1]")
		public WebElement AmazonPrimeVideo;


	}
}




