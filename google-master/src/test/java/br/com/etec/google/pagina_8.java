package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina_8 {
private WebDriver driver;
	
	public pagina_8(WebDriver driver) {
		this.driver = driver;
	}

	public void pagina8() throws InterruptedException {

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='bankwire']")));
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		
	}
}
