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
	public static WebDriver driver;
	
	@Test
	public void validarPesquisa() throws InterruptedException {
		
		//new Iniciar(driver).iniciar();
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?");
		Thread.sleep(5000);
		
		new pagina_1(driver).pagina1();
		new pagina_2(driver).pagina2();
		new pagina_3(driver).pagina3();
		new pagina_4(driver).pagina4();
		new pagina_5(driver).pagina5();
		new pagina_6(driver).pagina6();
		new pagina_7(driver).pagina7();
		new pagina_8(driver).pagina8();
		Thread.sleep(5000);
		new Cessar(driver).cessar();
		
		
	}
	

}
