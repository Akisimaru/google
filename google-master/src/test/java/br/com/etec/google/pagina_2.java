package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagina_2 {
private WebDriver driver;
	
	public pagina_2(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina2() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	Thread.sleep(5000);
	}
}
