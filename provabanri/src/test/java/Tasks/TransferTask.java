package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;

import PageObjects.AccountPage;
import PageObjects.TransferPage;
import Validations.AccountPageValidation;
import Validations.TransferPageValidation;

public class TransferTask {

	private WebDriver driver;
	private AccountPage accountPage;
	private AccountPageValidation accountPageValidation;
	private TransferPage transferPage;
	private TransferPageValidation transferPageValidation;
	
	
	public TransferTask(WebDriver driver) {
		
		this.driver = driver;
		accountPage = new AccountPage(this.driver);
		accountPageValidation = new AccountPageValidation(this.driver);
		transferPage = new TransferPage(this.driver);
		
	}
	
	public void transferValue() throws InterruptedException {
		//String numeroConta2 = FileOperation.getProperty("NumeroConta2").substring(0, -2);
		//String digitoConta2 = FileOperation.getProperty("NumeroConta2").substring(-1);
		
		
		accountPageValidation.validationAccountVisible();
		accountPage.getTransferButton().click();
		transferPageValidation.trasferFormValidation();
		transferPage.getAccountNumberInput().sendKeys("12");
		transferPage.getAccountDigitInput().sendKeys("5");
		transferPage.getTransferDescription().sendKeys("Transferencia teste");
		Thread.sleep(5000);
		
		
		
	}
	
	
}
