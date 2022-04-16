package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;


public class UserRegistrationTest extends TestBase {
	
	HomePage homeObject ;


	//===========================with valid E-Mail==========================
	
	
	@Test(priority = 1)
	public void UserCanFindRegistrationForm()
	{
		homeObject=new HomePage (driver);
		homeObject.openRigstrationPage();
		homeObject.enterYourEmail();
		homeObject.createAccount();
		
String successMessage=driver.findElement(By.xpath("//h3[normalize-space()='Your personal information']")).getText();
driver.findElement(By.xpath("//h3[normalize-space()='Your personal information']")).isDisplayed();
	Assert.assertEquals(successMessage, "YOUR PERSONAL INFORMATION");
	
	System.out.println("You are direceted to the registration Form ");

	}
	
	
	//=========================with invalid E-Mail===============================
	
	
	@Test (priority = 2)
	public void UserCanNotFindRegistrationForm()
	{
	
		homeObject=new HomePage (driver);
		homeObject.openRigstrationPage();
		homeObject.enterYourInvalidEmail();
		homeObject.createAccount2();
		String errorMessage= driver.findElement(By.cssSelector("div[class='alert alert-danger'] ol li")).
				getText();
		driver.findElement(By.cssSelector("div[class='alert alert-danger'] ol li")).isDisplayed();
		Assert.assertEquals(errorMessage, "Invalid email address.");
		System.out.println("User can not be direceted to the registration Form as the entered E-Mail is invalid");
		}
	

}
