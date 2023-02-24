package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	private WebDriver driver;
	private Waits wait;
	
	
	public WebElement getRegistroEmailInput() {
		
		return driver.findElement(By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[2]/input"));
	}
	
	public WebElement getRegistroNameInput() {
		
		return driver.findElement(By.name("name"));
	}
	
	public WebElement getRegistroPasswordInput() {
		
		return driver.findElement(By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[4]/div/input"));
	}

	public WebElement getRegistroPasswordConfirmationInput() {
		
		return driver.findElement(By.name("passwordConfirmation"));
	}
	
	public WebElement getCreateAccountWithValueButton() {
		
		return driver.findElement(By.id("toggleAddBalance"));
	}
	
	public WebElement getRegistroButton() {
		
		return driver.findElement(By.xpath("//*[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
	}
	
	public WebElement getRegistroCloseButton() {
		
		return driver.findElement(By.xpath("//*[@id='btnCloseModal']"));
	}
	
	public WebElement getFormularioRegistro() {
		   
		return wait.visibilityOfElement(By.xpath("//*[@class='card__register']"));
	}

}
