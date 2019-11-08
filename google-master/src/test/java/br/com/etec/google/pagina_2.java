package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina_2 {
private WebDriver driver;
	
	public pagina_2(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina2() throws InterruptedException {
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Add to cart')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		
	}
}
