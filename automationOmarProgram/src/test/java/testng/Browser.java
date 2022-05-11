package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement ids=driver.findElement(By.name("email"));
	  ids.sendKeys("omar@fraijat");
	  WebElement password=driver.findElement(By.name("pass")); 
	  password.sendKeys("omarf");
	  WebElement login=driver.findElement(By.name("login"));
	  login.click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
