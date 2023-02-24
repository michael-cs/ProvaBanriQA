package TestCases;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.RegisterTask;
import Tasks.LoginTask;



public class RegistrarConta extends TestBase {
	
	private WebDriver driver = this.getDriverManager();
	
	RegisterTask registerContasTask = new RegisterTask(this.driver);
	
	
	
	//@Test
	public void efetuarRegistroSucesso() {
		try {
			
			Report.createTest("Realizar Cadastro de Conta com Sucesso", ReportType.GROUP);
			//Report.createStep("Registrar Conta com Saldo");
			registerContasTask.registerAccount();
			//Report.createStep("Registrar Conta sem Saldo");
			//registerSemSaldoTask.registerAccountNoValue();

		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
		
	}
	

}
