package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagina_8 {
private WebDriver driver;
	
	public pagina_8(WebDriver driver) {
		this.driver = driver;
	}

	public void pagina8() throws InterruptedException {
	driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
	Thread.sleep(5000);
	}
}
