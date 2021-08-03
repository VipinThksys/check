package myFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import browserr.browserInit;

public class Airtel {
	
	
	
	@Test
	public void first() {
		browserInit b = new browserInit();
		 WebDriver driver = b.brow();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath(".//div[@id='radio-btn-example']//label[1]/input")).click();
		 driver.findElement(By.xpath(".//button[contains(text(),'Home')]")).click();
		 String text =  driver.findElement(By.xpath(".//*[contains(text(),' contact@rahulshettyacademy.com')]")).getText();
		 Assert.assertEquals(text, " contact@rahulshettyacademy.com");
		 driver.close();
	}
	
	@Test
	public void second() {
		browserInit b = new browserInit();
		 WebDriver driver = b.brow();
		 driver.get("https://www.google.co.in");
		 driver.close();
	}
	
	
	
	

}
