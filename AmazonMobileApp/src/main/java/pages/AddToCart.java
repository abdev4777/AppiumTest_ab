package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.*;
import base.CommonMethod;
import base.DriverFactory;
import base.base;

import org.openqa.selenium.support.PageFactory;

public class AddToCart extends DriverFactory{
	PageObjects addtocart;
	
	public AddToCart() {
		super();
		addtocart = new PageObjects();
		PageFactory.initElements(driver, addtocart);
	}
	public void click_hamburger_button() { 
		addtocart.Hamburgerbtn.click();
	}

	public void click_search_button() { 
		addtocart.SearchBarbtn.click();
	}
	public void click_my_cart_button() { 
		addtocart.MyCartbtn.click();
	}
	
    public void check_availability() {
    
    	if(addtocart.CheckAvailability.getText() != "In stock")
    	{
    		System.out.println("Kindle is in stock");
    	}
    	else
    	{
    		System.out.println("kindle is not in stock");
    	}
    	
    	 
			
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

		//check product availability 
		@FindBy(id="availability")
		public WebElement CheckAvailability;
		
		@FindBy(id="add-to-cart-button")
		public WebElement AddToCart;
		
	}
	}





