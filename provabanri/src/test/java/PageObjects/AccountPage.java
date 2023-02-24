package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Framework.Browser.Waits;
import Framework.Utils.FileOperation;

public class AccountPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	public WebElement getTransferButton() {
		
		return driver.findElement(By.xpath("//*[@id='btn-TRANSFERÊNCIA']"));
	}
	
	public WebElement getExtratoButton() {
		return driver.findElement(By.id("btn-EXTRATO"));
		
	}
	
	public String getAccountNumber() {
		
		return driver.findElement(By.xpath("//p[@id=\"textAccountNumber\"]/span")).getText();
		
		
	}
	
	public WebElement getExitAccountButton() {
		
		return driver.findElement(By.xpath("//*[@class='home__ContainerLink-sc-1auj767-2 cCGrzy']"));
	}
	
	public WebElement getAccountPageLabel() {
		
		return driver.findElement(By.xpath("//p[@id=\"textAccountNumber\"]/span"));
	}
	
	public WebElement getAccountWelcomeLogo() {
			
	   return wait.visibilityOfElement(By.className("home__LetterName-sc-1auj767-6 fwtPPI"));
					
	}
			


}
