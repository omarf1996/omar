package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATERS2 { //xpath
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		Thread.sleep(6000);
		searchtoclick.click();
		WebElement searchfeildicon= driver.findElement(By.xpath("//input[@aria-label='Search']")); // //input[@choose='choose'] code for relative path
	                                                                      	 //to write in the search field we use send keys always we changed the
                                                                             // order to click first and then it does the thing we searched.
		searchfeildicon.sendKeys("desktop"); //what to write in the searchfeild only use it in it
		
		//xpath text function.. (//a[text()='New Releases'])[1] this is the function we use , we use number one to specify only one line of what we want 
		//only used for a text line and we have number one in the bracets because we need to specify which line we want 
		
		
		//contains ()
		// (//a[contains(text(),'New Releases')])[1] 
		//*contains(@aria-label='')]
		
	}

}
