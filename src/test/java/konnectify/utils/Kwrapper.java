package konnectify.utils;

import org.openqa.selenium.support.PageFactory;

import konnectify.pages.LoginPage1;
import konnectify.pages.LoginPage2;
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
	
	//Account login with Invalid and Valid data
	public void Login1(String m, String p) throws InterruptedException
	{
	LoginPage1 log = PageFactory.initElements(driver, LoginPage1.class);
	
	
	log.email(m);
	log.password1(p);
	log.clickButton();
	log.captureScreenshot("Login_Invalid_Data");
	log.exit1();
		
	}	
	
	
	public void Login2(String m, String p) throws InterruptedException
	{
	LoginPage2 log = PageFactory.initElements(driver, LoginPage2.class);
	
	
	log.email(m);
	log.password1(p);
	log.clickButton();
	log.captureScreenshot("Login_Valid_Data");
	log.exit1();
		
	}	
	
	
}
