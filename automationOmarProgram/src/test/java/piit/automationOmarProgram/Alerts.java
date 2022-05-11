package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement Alert=driver.findElement(By.name("alert"));
		Alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept(); // we use switch to test the alert notification that pops out when we run our code
		WebElement prompting=driver.findElement(By.name("prompt"));
		prompting.click();
		driver.switchTo().alert().sendKeys("tested"); //here we use this one to test when we click on prompt and we use sendkeys to write inside always
		driver.switchTo().alert().dismiss(); // to cancel the notification we got ... that's it 
		//this is the class to test alerts..
		
		
	}
}
