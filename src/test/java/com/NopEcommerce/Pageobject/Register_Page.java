package com.NopEcommerce.Pageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NopEcommerce.Basepage.Basepage;

public class Register_Page extends Basepage{
	@FindBy(xpath="//a[contains(text(),'Register')]")
	@CacheLookup
    public WebElement register_link;
	
	@FindBy(id="gender-male")
	@CacheLookup
	public  WebElement Gender;
	
	@FindBy(id="FirstName")
	@CacheLookup
	 public WebElement firstname;
	
	@FindBy(id="LastName")
	@CacheLookup
	public WebElement lastname;
	
	@FindBy(name="DateOfBirthDay")
	@CacheLookup
	public  WebElement day;
	
	@FindBy(name="DateOfBirthMonth")
	@CacheLookup
	public WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	@CacheLookup
	public WebElement year;
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement email;
	
	@FindBy(id="Company")
	@CacheLookup
	public WebElement company;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement pasword;
	
	@FindBy(id="ConfirmPassword")
	@CacheLookup
	public WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	@CacheLookup
	public WebElement register_button;
	
	@FindBy(css="div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.registration-result-page div.page-body > div.result")//div[contains(text(),'Your registration completed')]
	@CacheLookup
	public WebElement Your_registration_completed;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	public WebElement  logout;
	
	
	public Register_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	

	public void get_register()
	{
		 register_link.click();
	}
	

}
