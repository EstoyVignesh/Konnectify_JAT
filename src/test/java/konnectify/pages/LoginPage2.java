package konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import konnectify.utils.SeWrappers;

public class LoginPage2 extends SeWrappers {
	
	@FindBy(name="email")
	public WebElement mail;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(xpath="//p[text()='Log in']")
	public WebElement but2;
	
	
	
	public void email(String m)
	{
		waitForElement(mail,20);
		clickElement(mail);
		typeText(mail,m);
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
		String konnectify = null;
		if(but2.getText()==konnectify)
		{
			System.out.println("Konnectify home page is not displayed");
		}
		else
		{
			System.out.println("Konnectify home page is displayed");
		}
		
	}
	
	public void exit1() throws InterruptedException
	{
		Thread.sleep(5000);
		closeCurrentBrowser();
	}
	
}
