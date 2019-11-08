package br.com.etec.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina_1 {
private WebDriver driver;
	
	public pagina_1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pagina1() throws InterruptedException{
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")));
	driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")).click();
	Thread.sleep(5000);
	}
}
