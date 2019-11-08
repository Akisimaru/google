package br.com.etec.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;


public class Iniciar {
	private static WebDriver driver;
	
	public Iniciar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void iniciar() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?");
	
	}
	
	public static void paginaUm() throws InterruptedException{
		driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")).click();
		Thread.sleep(5000);
		}
}
