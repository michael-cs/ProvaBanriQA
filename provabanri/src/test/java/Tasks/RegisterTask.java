package Tasks;


import org.openqa.selenium.WebDriver;



import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import PageObjects.AccountPage;
import Validations.AccountPageValidation;
import Validations.HomePageValidation;
import Validations.RegisterValidation;


public class RegisterTask {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePageValidation loginValidation;
	private RegisterPage registerPage;
	private RegisterValidation registerFormValidation;
	private FakersGeneration fakers;
	private AccountPage accountPage;
	private AccountPageValidation accountPageValidation;
	
	

	
	
	
	public RegisterTask(WebDriver driver) {
	
		this.driver = driver;
		fakers = new FakersGeneration();
		loginPage = new LoginPage(this.driver);
		loginValidation = new HomePageValidation(this.driver);
		registerPage = new RegisterPage(this.driver);
		registerFormValidation = new RegisterValidation(this.driver);
		accountPage = new AccountPage(this.driver);
		accountPageValidation = new AccountPageValidation(this.driver);		
		
		
		
		
	}
	
	public void registerAccount() throws InterruptedException {
		
		String conta1_email = fakers.getEmail();
		String conta1_name = fakers.getName();
		String conta1_password = fakers.getPassword();
		
		FileOperation.setProperties("form", "EmailConta1", conta1_email);
		FileOperation.setProperties("form", "NomeConta1", conta1_name);
		FileOperation.setProperties("form", "SenhaConta1", conta1_password);
		
		String conta2_email = fakers.getEmail();
		String conta2_name = fakers.getName();
		String conta2_password = fakers.getPassword();
		
		FileOperation.setProperties("form", "EmailConta2", conta2_email);
		FileOperation.setProperties("form", "NomeConta2", conta2_name);
		FileOperation.setProperties("form", "SenhaConta2", conta2_password);
		

		
		
		loginValidation.validationLoginPage();
		loginPage.getRegistrarButton().click();		
		registerFormValidation.validationRegisterFormVisible();
		registerPage.getRegistroEmailInput().sendKeys(conta1_email);	
		registerPage.getRegistroNameInput().sendKeys(conta1_name);
		registerPage.getRegistroPasswordInput().sendKeys(conta1_password);
		registerPage.getRegistroPasswordConfirmationInput().sendKeys(conta1_password);
		registerPage.getCreateAccountWithValueButton().click();
		registerPage.getRegistroButton().click();
		registerFormValidation.validationRegisterPopUpVisible();
		registerPage.getRegistroCloseButton().click();
		loginValidation.validationLoginPage();
		loginPage.getUserEmailInput().sendKeys(conta1_email);
		loginPage.getPasswordInput().sendKeys(conta1_password);	
		loginPage.getLoginButton().click();
		accountPageValidation.validationAccountVisible();
		accountPage.getAccountNumber();	
		FileOperation.setProperties("form", "NumeroConta1", (accountPage.getAccountNumber()));
		accountPage.getExitAccountButton().click();
		loginValidation.validationLoginPage();
		loginPage.getRegistrarButton().click();		
		registerFormValidation.validationRegisterFormVisible();
		registerPage.getRegistroEmailInput().sendKeys(conta2_email);	
		registerPage.getRegistroNameInput().sendKeys(conta2_name);
		registerPage.getRegistroPasswordInput().sendKeys(conta2_password);
		registerPage.getRegistroPasswordConfirmationInput().sendKeys(conta2_password);
		registerPage.getRegistroButton().click();
		registerFormValidation.validationRegisterPopUpVisible();
		registerPage.getRegistroCloseButton().click();
		loginValidation.validationLoginPage();
		loginPage.getUserEmailInput().sendKeys(conta2_email);
		loginPage.getPasswordInput().sendKeys(conta2_password);	
		loginPage.getLoginButton().click();
		accountPageValidation.validationAccountVisible();
		accountPage.getAccountNumber();	
	    FileOperation.setProperties("form", "NumeroConta2", (accountPage.getAccountNumber()));
	    accountPage.getExitAccountButton().click();
		
		
		
	
		
	}
	

	

}
