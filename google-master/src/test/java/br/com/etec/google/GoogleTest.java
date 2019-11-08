package br.com.etec.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleTest {
	private WebDriver driver;
	@Test
	public void validarPesquisa() throws InterruptedException {
		
		new Iniciar(driver).iniciar();
		Thread.sleep(5000);
		new pagina_1(driver).pagina1();
		Thread.sleep(5000);
		new pagina_2(driver).pagina2();
		Thread.sleep(5000);
		new pagina_3(driver).pagina3();
		Thread.sleep(5000);
		new pagina_4(driver).pagina4();
		Thread.sleep(5000);
		new pagina_5(driver).pagina5();
		Thread.sleep(5000);
		new pagina_6(driver).pagina6();
		Thread.sleep(5000);
		new pagina_7(driver).pagina7();
		Thread.sleep(5000);
		new pagina_8(driver).pagina8();
		Thread.sleep(5000);
		new Cessar(driver).cessar();
		
		
		
		/*
		Faker faker = new Faker();
		String email = faker.name().fullName();
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?");
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")));	
		driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")).click();
		

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Add to cart')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email_create']")));
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email.replace(" ", "") + "@teste.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();


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
		
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='cgv']")));
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")));
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='bankwire']")));
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		
		Thread.sleep(5000);

		
		
		
		
		driver.close();
		*/
	}
	

}
