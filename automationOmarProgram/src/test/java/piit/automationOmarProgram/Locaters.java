package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
static WebDriver driver; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement Searchfieldtxt=driver.findElement(By.name("field-keywords"));   //to write in the search field we use send keys always we changed the
		                                                                           // order to click first and then it does the thing we searched.
		Searchfieldtxt.sendKeys("computer");
	    WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
	   WebElement linktx= driver.findElement(By.linkText("Registry"));
	    linktx.click(); 
	  WebElement linktx1= driver.findElement(By.linkText("Books"));
		linktx1.click();
	  WebElement nametxt=  driver.findElement(By.name("url"));
	   nametxt.click();
	     WebElement Linktxt= driver.findElement(By.linkText("Customer Service"));
	       Linktxt.click();
	     
	      
	     
	     
	     //xpath
	     
	       
	 
	}

}
