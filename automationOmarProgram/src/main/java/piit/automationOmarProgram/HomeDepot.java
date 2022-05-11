package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement ClickonMyAccount=driver.findElement(By.id("headerMyAccount"));
		ClickonMyAccount.click();
		Thread.sleep(6000);
		WebElement ClickonRegister=driver.findElement(By.linkText("Register"));
		ClickonRegister.click();
	}

}
