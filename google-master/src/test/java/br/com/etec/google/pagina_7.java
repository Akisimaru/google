package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagina_7 {
private WebDriver driver;
	
	public pagina_7(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina7() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='cgv']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
	Thread.sleep(5000);
	}
}
