package com.jodayn.smoke;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Jodayn.Automation.Common;

public class Register extends Common {
	// public WebDriver driver;

	Common common = new Common ();

	@Test

	public void Registration() throws InterruptedException {
		String userName = "Osama";
		String accountPassword = "Osama";
		// to visit https://automationexercise.com
		// Verify that home page is visible successfully
		String homePageIsVisible = driver.getTitle();
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals("Automation Exercise", homePageIsVisible);

		WebElement Signup_Login = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Signup_Login.click();

		// Verify 'New User Signup!' is visible
		WebElement newUserSignup = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));
		System.out.println(newUserSignup.getText());
		AssertJUnit.assertEquals("New User Signup!", newUserSignup.getText());

		WebElement Name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		Name.sendKeys(userName);
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		Email.sendKeys("osama.zwagha+3@gmail.com");
		WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		signupButton.click();

		// Verify that 'ENTER ACCOUNT INFORMATION' is visible
		WebElement accountInformation = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/h2/b"));
		System.out.println(accountInformation.getText());
		AssertJUnit.assertEquals("ENTER ACCOUNT INFORMATION", accountInformation.getText());

		WebElement Title = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		Title.click();

		WebElement Day = driver.findElement(By.xpath("//*[@id=\"days\"]/option[11]"));
		Day.click();

		WebElement Month = driver.findElement(By.xpath("//*[@id=\"months\"]/option[7]"));
		Month.click();

		WebElement Year = driver.findElement(By.xpath("//*[@id=\"years\"]/option[30]"));
		Year.click();

		WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		newsletter.click();

		WebElement offers = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		offers.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstName.sendKeys(userName);

		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lastName.sendKeys("zwagha");

		WebElement Company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		Company.sendKeys("compant");

		WebElement Address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		Address.sendKeys("canada");

		WebElement Address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		Address2.sendKeys("canada");

		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passWord.sendKeys(accountPassword);

		WebElement Country = driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]"));
		Country.click();

		WebElement State = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		State.sendKeys("canada");

		WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		City.sendKeys("torinto");

		WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		Zipcode.sendKeys("00000");

		WebElement mobileNumber = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		mobileNumber.sendKeys("0535175947");

		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
		createAccount.click();

		// Verify that 'ACCOUNT CREATED!' is visible

		WebElement accountCreated = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
		System.out.println(accountCreated.getText());
		AssertJUnit.assertEquals("ACCOUNT CREATED!", accountCreated.getText());

		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		Continue.click();

		// Verify name is visabale
		WebElement accountName = driver
				.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b"));
		System.out.println(accountName.getText());
		AssertJUnit.assertEquals(userName, accountName.getText());
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
