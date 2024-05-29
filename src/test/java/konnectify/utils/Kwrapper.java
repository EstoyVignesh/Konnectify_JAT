package konnectify.utils;

import org.openqa.selenium.support.PageFactory;




import konnectify.pages.Signup_Page1;

public class Kwrapper extends SeWrappers
{
	
		
	// Account Creation with Invalid Data
	public void Signup1(String fn, String m, String p, String on, String mn) throws InterruptedException 
	{
	Signup_Page1 sign = PageFactory.initElements(driver, Signup_Page1.class);
	
	sign.signUp();
	sign.fname(fn);
	sign.email(m);
	sign.password(p);
	sign.orgName(on);
	sign.mNum(mn);
	sign.clickButton();
	sign.captureScreenshot("Signup_Invalid_Data");
	sign.exit1();
	
	
	
	

	
    }
	
	

	
	
	
	
}
