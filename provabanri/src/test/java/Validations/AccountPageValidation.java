package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.AccountPage;

public class AccountPageValidation {

	private WebDriver driver;
	private AccountPage accountPage;
	private Waits wait;
	
	public AccountPageValidation(WebDriver driver) {
		
		this.driver = driver;
		accountPage= new AccountPage(this.driver);
		wait = new Waits(this.driver);
	}
	public void validationAccountVisible() {
		
		try {
			wait.visibilityOfElement(By.xpath("//p[@id=\"textAccountNumber\"]/span"));
			Assertions.assertTrue(accountPage.getAccountPageLabel().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina da conta com sucesso", Screenshot.captureBase64(driver));
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
}