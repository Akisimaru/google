package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina_7 {
private WebDriver driver;
	
	public pagina_7(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina7() throws InterruptedException {

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='cgv']")));
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();

	}
}
