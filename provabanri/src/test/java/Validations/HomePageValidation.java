package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.LoginPage;

public class HomePageValidation {

	private WebDriver driver;
	private LoginPage loginPage;
	private Waits wait;
	
	public HomePageValidation(WebDriver driver) {
		
		this.driver = driver;
		loginPage= new LoginPage(this.driver);
		wait = new Waits(this.driver);
		
	}
	
    public void validationLoginPage() {
		
		try {
			
			wait.loadElement(loginPage.getHomeText());
			Assertions.assertTrue(loginPage.getHomeText().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de login com sucesso", Screenshot.capture(driver));
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}
	
	
}
