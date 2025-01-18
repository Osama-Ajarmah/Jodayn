package Jodayn.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Common extends Base implements osama {

	public static void commonData() {

		System.out.println("print this");
	}

	

	
	@Override
	public int Osos(int x, int y) {
		Base b = new Base();
System.out.println (b.Osos(2, 0));
		return 0;
	}

	
	public void deleteAccount() {
		WebElement deleteAccount = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		deleteAccount.click();

		// Verify account is deleted
		WebElement accountIsDeleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
		System.out.println(accountIsDeleted.getText());
		Assert.assertEquals(accountIsDeleted.getText(), "ACCOUNT DELETED!");
		
	}
}
