package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagina_3 {
private WebDriver driver;
	
	public pagina_3(WebDriver driver) {
		this.driver = driver;
	}

	public void pagina3() throws InterruptedException{
	driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
	Thread.sleep(5000);
	}
}
