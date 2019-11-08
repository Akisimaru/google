package br.com.etec.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class pagina_5 {
private WebDriver driver;
	
	public pagina_5(WebDriver driver) {
		this.driver = driver;
	}
	public void pagina5() throws InterruptedException {
		Faker faker = new Faker();
		String email = faker.name().fullName();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='id_gender1']")));
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(faker.name().firstName());
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(faker.name().lastName());
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(email.replace(" ", "") + "@teste.com");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(faker.address().streetAddress());
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(faker.address().cityName());
		driver.findElement(By.xpath("//select[@id='id_state']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Florida')]")).click();
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("19868320");
		driver.findElement(By.xpath("//span[contains(text(),'Register')]//i[@class='icon-chevron-right right']")).click();
		
	}
}
