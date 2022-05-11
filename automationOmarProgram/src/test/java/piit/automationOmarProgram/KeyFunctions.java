package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyFunctions {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	WebElement searchoffeild=driver.findElement(By.id("twotabsearchtextbox"));
	searchoffeild.sendKeys("computer");
	//keywoed by using action class
	Actions ob=new Actions(driver);
	ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //to control the cursor to go down to what u want it is like scrolling down
	                                       //it is like pressing ctrl and then a combined together
	                                       //it like going down until you reach what u want and then we used ctrl up to like lift your finger up 
	                                       //from the scroll area or like ordering it ti stop so this is the formula of using key functions for
	                                      //using ctrl down and up
	Thread.sleep(6000);
	ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //this is the order for copying antg youwant
	searchoffeild.clear(); //we call the function again to use the clear feild
	Thread.sleep(6000);
	searchoffeild.click();
	ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
