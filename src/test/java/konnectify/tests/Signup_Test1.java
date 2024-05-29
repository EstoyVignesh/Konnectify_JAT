package konnectify.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import konnectify.utils.Kwrapper;
import konnectify.utils.Reports;
import konnectify.utils.SeWrappers;



public class Signup_Test1 extends SeWrappers
{
	Kwrapper k = new Kwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser","url"})
	@Test
	public void signupTest(String browserName, String url)
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect Data");
			launchCrossBrowser(browserName,url);
			
			k.Signup1("Vi@gnesh Pa1anisamy","124vky#@gmail.com","@vickyKofy123","None","abcdefg!");	
	      }
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
		
		
	
}
	
/*	@Test
	 
	public void signup2() throws InterruptedException
	{		
		k.Signup1("Vi@gnesh Pa1anisamy","124vky#@gmail.com","@vickyKofy123","None","abcdefg!");
	}
	
	*/
	
}

