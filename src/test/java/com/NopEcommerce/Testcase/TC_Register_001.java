package com.NopEcommerce.Testcase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Register_Page;

public class TC_Register_001 extends Basepage{
	Register_Page r;
	
	
	
	@Test()
	public void register()
	{
		 r=new Register_Page();
		 
		 r.get_register();
		
		 r.Gender.click();
	     
	     r.firstname.sendKeys("kumar");
	     
	     r.lastname.sendKeys("AM");
	     
	     Select s=new Select(r.day);
	 	 s.selectByIndex(5);
	 	  
	 	 Select s1=new Select(r.month);
		 s1.selectByVisibleText("April");
		 
		 Select s2=new Select(r.year);
		 s2.selectByValue("1994");
	 	 
		r.email.sendKeys("ajayam111111@gmail.com");
	 	  
		r.company.sendKeys("software");
		
		r.pasword.sendKeys("ajay1234");
		r.ConfirmPassword.sendKeys("ajay1234");
		r.register_button.click();
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfAllElements(r.Your_registration_completed));
		
		String atualtext= r.Your_registration_completed.getText();
		
	    Assert.assertEquals(atualtext, "Your registration completed");
	    
	    System.out.println("successfull registered account--- ");
	    
        r.logout.click();
	     
	}
	
	
	
	
	}
		
	   
	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


