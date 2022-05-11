package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLIGHTS {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
	   WebElement departure=driver.findElement(By.id("d1-btn"));
	   departure.click();
	   WebElement departuredate=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
	   departuredate.click();
	   WebElement arrivaldate=driver.findElement(By.xpath("//*[@aria-label='May 26, 2022']"));
	   arrivaldate.click();
	   WebElement pressdone=driver.findElement(By.id("data-stid=\"apply-date-picker\""));
	   pressdone.click();
	}

}
