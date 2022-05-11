package piit.automationOmarProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement dragable=driver.findElement(By.linkText("Droppable"));
		dragable.click();
		driver.switchTo().frame(0);
		/*WebElement dropable=driver.findElement(By.id("draggable")); //these too items are in a frame so selenium can't handle this...
		WebElement dragable1=driver.findElement(By.id("droppable"));//we have to use this code (driver.switchto().frame(0) and the way to know that
		                                                            //it is a zero is to go in the inspection feild and to count from there..
		                                                            //to know that it is a frame u have to check the inspection box again you will
		                                                            // find html pr the word frame inside..
		Actions ob=new Actions(driver);
		ob.dragAndDrop(dropable, dragable1).build().perform();
		                               //actions : i frame is web page inside a web page, selenium deosn't know how to handle the frame automatically*/
		//driver.switchTo.frame(0);
		//Actions ob=new Actions(driver);
		//ob.DragAndDrop(dfsfsfgrgd).build.perform
		
         
         
		
		
	}

}
