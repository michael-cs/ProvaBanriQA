package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ExtratoPage {
	
	private WebDriver driver;
	
	
	public ExtratoPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getExtratoValue() {
		
		return driver.findElement(By.id("textBalanceAvailable"));
	}
	
	public WebElement getExtratoPageLabel() {
		
		return driver.findElement(By.className("bank-statement__LabelText-sc-7n8vh8-10 UPwdn"));
	}
	
}
