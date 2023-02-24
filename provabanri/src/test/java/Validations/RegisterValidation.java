package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.RegisterPage;

public class RegisterValidation {
	
	private WebDriver driver;
	private RegisterPage registerPage;
	private Waits wait;
	
	public RegisterValidation(WebDriver driver) {
		
		this.driver = driver;
		registerPage = new RegisterPage(this.driver);
		wait = new Waits(this.driver);
		
	}
	
	public void validationRegisterFormVisible() {
		
		try {
			
			wait.loadElement(registerPage.getRegistroPasswordConfirmationInput());
			Assertions.assertTrue(registerPage.getRegistroPasswordConfirmationInput().isDisplayed());
			Report.log(Status.PASS, "Acessou o formulario de registro com sucesso", Screenshot.capture(driver));
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}
	public void validationRegisterPopUpVisible() {
		try {
			
			wait.loadElement(registerPage.getRegistroCloseButton());
			Assertions.assertTrue(registerPage.getRegistroCloseButton().isDisplayed());
			Report.log(Status.PASS, "Cadastro de conta concluído com sucesso.", Screenshot.capture(driver));
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}


}
