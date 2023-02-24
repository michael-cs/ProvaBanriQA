package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;


import PageObjects.AccountPage;
import PageObjects.LoginPage;
import Validations.AccountPageValidation;
import Validations.HomePageValidation;

public class LoginTask {

	private WebDriver driver;
	private LoginPage loginPage;
	private HomePageValidation loginValidation;
	private AccountPage accountPage;
	private AccountPageValidation accountPageValidation;
	
	
	public LoginTask(WebDriver driver) {
		
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		loginValidation = new HomePageValidation(this.driver);
		accountPage = new AccountPage(this.driver);
		accountPageValidation = new AccountPageValidation(this.driver);
		
		
		
		
	}
	
	public void efetuarLogin() throws InterruptedException {
		
		
		String emailConta1 = FileOperation.getProperty("EmailConta1");
		String senhaConta1 = FileOperation.getProperty("SenhaConta1");	
		
		loginValidation.validationLoginPage();
		loginPage.getUserEmailInput().sendKeys(emailConta1);
		loginPage.getPasswordInput().sendKeys(senhaConta1);
		loginPage.getLoginButton().click();
		accountPageValidation.validationAccountVisible();
		
		
		
		
		
	}
	
}
