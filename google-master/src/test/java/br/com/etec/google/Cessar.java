package br.com.etec.google;

import org.openqa.selenium.WebDriver;

public class Cessar {
private WebDriver driver;
	
	public Cessar(WebDriver driver) {
		this.driver = driver;
	}
	public void cessar() throws InterruptedException {
	driver.close();
	}
}
