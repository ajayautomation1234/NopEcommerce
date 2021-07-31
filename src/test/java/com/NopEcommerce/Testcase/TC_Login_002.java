package com.NopEcommerce.Testcase;

import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Login_page;

public class TC_Login_002 extends Basepage{
	
	
	
	@Test
	public void login_feature()
	{
		Login_page l=new Login_page();
		l.login_link.click();
		l.username.sendKeys("ajayam1234@gmail.com");
		l.password.sendKeys("ajay1234");
		l.loginbuton.click();
		l.logout.click();
	}

}
