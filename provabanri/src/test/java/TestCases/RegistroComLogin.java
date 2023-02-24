package TestCases;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.RegisterTask;
import Tasks.TransferTask;
import Tasks.LoginTask;



public class RegistroComLogin extends TestBase {
	
	private WebDriver driver = this.getDriverManager();
	
	RegisterTask registerContasTask = new RegisterTask(this.driver);
	LoginTask loginTask = new LoginTask(this.driver);
	TransferTask  transferTask = new TransferTask(this.driver);
	
	
	
	@Test
	public void efetuarRegistroELogin() {
		try {
			
			Report.createTest("Realizar Cadastro de Conta com Sucesso", ReportType.GROUP);
			Report.createStep("Registrar Contas");
			registerContasTask.registerAccount();
			Report.createStep("Logar na Conta de Origem da Transferencia");
			loginTask.efetuarLogin();
			Report.createStep("Realizar Transferencia");
			transferTask.transferValue();
			


		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
		
	}
	

}
