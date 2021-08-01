package browserr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserInit {

	
	public WebDriver brow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	
	
	@Test
	public void first() {
		browserInit b = new browserInit();
		 WebDriver driver = b.brow();
		 driver.get("https://www.airtel.in");
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
