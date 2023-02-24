package Validations;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.TransferPage;


public class TransferPageValidation {

	private WebDriver driver;
	private TransferPage transferPage;
	private Waits wait;
	
	public TransferPageValidation(WebDriver driver) {
		this.driver = driver;
		transferPage = new TransferPage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void trasferFormValidation() {
		
        try {
			
			wait.visibilityOfElement(By.xpath("//*[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
			Assertions.assertTrue(transferPage.getTransferPageLabel().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de transferências com sucesso", Screenshot.capture(driver));
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

		
	}
	
}
