package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagina_6 {
private WebDriver driver;
	
	public pagina_6(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina6() throws InterruptedException {
	driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
	Thread.sleep(5000);
	}
}
