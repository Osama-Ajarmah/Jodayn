package com.jodayn.smoke;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import io.qameta.allure.*;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Jodayn.Automation.Common;

public class Login extends Common {
	Common common = new Common ();

	@Test

	public void LogIn() throws InterruptedException {
        

		// to visit https://automationexercise.com
		// Verify that home page is visible successfully
		String homePageIsVisible = driver.getTitle();
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals("Automation Exercise", homePageIsVisible);

		WebElement Signup_Login = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Signup_Login.click();

		// Verify 'New User Signup!' is visible
		WebElement logInToYourAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
		System.out.println(logInToYourAccount.getText());
		AssertJUnit.assertEquals(logInToYourAccount.getText(), "Login to your account");

		WebElement logInEmail = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));	
		logInEmail.sendKeys("osama.zwagha+3@gmail.com");
		
		WebElement logInPassword = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));	
		logInPassword.sendKeys("Osama");
		
		
		WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));	
		logInButton.click();
		
		// Verify name is visabale
		WebElement accountName = driver
				.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b"));
		System.out.println(accountName.getText());
		AssertJUnit.assertEquals(accountName.getText(), "Osama");
		
		//common.deleteAccount();
		
        /*
		WebElement deleteAccount = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		deleteAccount.click();

		// Verify account is deleted
		WebElement accountIsDeleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
		System.out.println(accountIsDeleted.getText());
		Assert.assertEquals(accountIsDeleted.getText(), "ACCOUNT DELETED!");
		*/
		
	}
}
