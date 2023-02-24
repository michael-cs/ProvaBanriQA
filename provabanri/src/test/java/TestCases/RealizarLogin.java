package TestCases;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Tasks.LoginTask;

public class RealizarLogin extends TestBase {
	
	private WebDriver driver = this.getDriverManager();
	
	LoginTask loginTask = new LoginTask(driver);
	
	
	//@Test
	public void efetuarLoginSucesso() throws InterruptedException {
		
		loginTask.efetuarLogin();
	}
	

}
