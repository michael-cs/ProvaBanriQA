package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Framework.Browser.Waits;

public class TransferPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public TransferPage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	public WebElement getAccountNumberInput() {
		
		return driver.findElement(By.xpath("//*[@type='accountNumber']"));
	}
	
	public WebElement getAccountDigitInput() {
		
		return driver.findElement(By.xpath("//*[@type='digit']"));		
	}
	
	public WebElement getTransferValueInput() {
		
		return driver.findElement(By.xpath("//*[@type='transferValue']"));		
	}
	
	public WebElement getTransferDescription() {
		
		return driver.findElement(By.xpath("//*[@type='description']"));
	}
	
	public WebElement getTransferButton() {
		
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
	
	public WebElement getExitTransferButton() {
		
		return driver.findElement(By.id("btnExit"));
	}
	
	public WebElement getTransferPageLabel() {
		
		return driver.findElement(By.xpath("//*[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
	}

}
