package piit.automationOmarProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChromeBrowsers {
    static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
		String ur= driver.getCurrentUrl();
		System.out.println(ur);          //to get current url
		String windowhandle=driver.getWindowHandle();     
		System.out.println(windowhandle);
		
		
	}

}
