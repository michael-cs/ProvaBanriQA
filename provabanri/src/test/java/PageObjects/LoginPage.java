package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class LoginPage {

	private WebDriver driver;
	private Waits wait;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	
	public WebElement getUserEmailInput() {
		   
		return driver.findElement(By.name("email"));

	}
	   
	public WebElement getPasswordInput() {
		   
	    return driver.findElement(By.name("password"));
		   
	}
	
	public WebElement getLoginButton() {
		   
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
	
	public WebElement getRegistrarButton() {
		return driver.findElement(By.xpath("//*[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
	}
	
	public WebElement getHomeText() {
		   
		return wait.visibilityOfElement(By.xpath("//*[@type='submit']"));
	}	
		
	
}
