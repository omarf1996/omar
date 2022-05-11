package piit.automationOmarProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowWork {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver); //to open multiple windows we have to use the actions class and keys
		WebElement newreleases=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleases.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator(); //to handle multiple windiws or to control more than a window
		String parent= iterators.next();
		String secondwindow= iterators.next(); //we have ti use string
		driver.switchTo().window(secondwindow); //to switch between windows and getting the value
		
		WebElement products=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(6000);
		products.click(); 
		
		
		
		
	}

}
