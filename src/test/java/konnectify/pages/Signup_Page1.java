package konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import konnectify.utils.SeWrappers;

public class Signup_Page1 extends SeWrappers {
	
	@FindBy(xpath="//button[text()='Sign up for free']")
	public WebElement siup;
	
	@FindBy(id=":r0:-form-item")
	public WebElement name;
	
	@FindBy(id=":r1:-form-item")
	public WebElement mail;
	
	@FindBy(id=":r2:-form-item")
	public WebElement pass;
	
	@FindBy(id=":r3:-form-item")
	public WebElement org;
	
	@FindBy(id=":r4:-form-item")
	public WebElement num;
	
	@FindBy(xpath="//p[text()='Sign up for free']")
	public WebElement but1;
	
	
	
	public void signUp()
	{
		waitForElement(siup,40);
		clickElement(siup);
	}
	
	public void fname(String fn)
	{
		waitForElement(name,20);
		typeText(name,fn);
	}

	public void email(String m)
	{
		waitForElement(mail,20);
		typeText(mail,m);
	}
	
	public void password(String p)
	{
		waitForElement(pass,20);
		typeText(pass,p);
	}
	
	public void orgName(String on)
	{
		waitForElement(org,20);
		typeText(org,on);
	}
	
	public void mNum(String mn)
	{
		waitForElement(num,20);
		typeText(num,mn);
	}
	
	
	
	
	public void clickButton() 
	{
		waitForElement(but1,20);
		clickElement(but1);
		
	}
	
	public void exit1() throws InterruptedException
	{
		Thread.sleep(5000);
		closeCurrentBrowser();
	}
	
}
