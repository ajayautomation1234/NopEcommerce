package com.NopEcommerce.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NopEcommerce.Basepage.Basepage;

public class Login_page extends Basepage{

	@FindBy(xpath="//a[contains(text(),'Log in')]")
	@CacheLookup
	public WebElement login_link;
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement username;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	@CacheLookup
	public WebElement loginbuton;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	public WebElement  logout;
	
	
	
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
