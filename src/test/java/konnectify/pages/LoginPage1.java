package konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import konnectify.utils.SeWrappers;

public class LoginPage1 extends SeWrappers {
	
	@FindBy(id=":r5:-form-item")
	public WebElement mail;
	
	@FindBy(id=":r6:-form-item")
	public WebElement pass;
	
	@FindBy(xpath="//p[text()='Log in']")
	public WebElement but2;
	
	
	
	public void email()
	{
		waitForElement(mail,20);
		clickElement(mail);
	}
	
	public void password1(String p)
	{
		waitForElement(pass,20);
		typeText(pass,p);
	}

	
	public void clickButton() 
	{
		waitForElement(but2,20);
		clickElement(but2);
		
	}
	
	public void exit1() throws InterruptedException
	{
		Thread.sleep(5000);
		closeCurrentBrowser();
	}
	
}
