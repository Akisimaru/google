package br.com.etec.google;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class pagina_4 {
private WebDriver driver;
	
	public pagina_4(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina4() throws InterruptedException {
		Faker faker = new Faker();
		String email = faker.name().fullName();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email_create']")));
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email.replace(" ", "") + "@teste.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
	}
}
