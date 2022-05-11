package testng;

import org.testng.annotations.Test;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SIGNIN { //in this class we are combining two classes together
	WebDriver driver; //home class and signin class we dont have to create new methods
  @Test               //first we create object for the class,for the home class we created
  public void f() throws InterruptedException {
	Home ob=new Home(driver);
	ob.Email();
	ob.Passwordsfeild();
	Thread.sleep(6000);        //here we called the method from home class
	ob.Forgotpass();           //we're adding 3 classes together after forgotpass we need to fill the space
	                          // so we are calling the method from ForgotPasswordClass
	ForgotPasswordPage Id=new ForgotPasswordPage(driver);
	Id.idsendkeys();
	Id.searchbuttonclick();
	
  }
  @Test
  public void textverification() throws InterruptedException {
	 driver.navigate().back();
	 Thread.sleep(6000);
	 ForgotPasswordPage Id=new ForgotPasswordPage(driver);
     String Question=Id.Questions();
     SoftAssert softit=new SoftAssert();
   Softit.assertEquals("Please enter your email or mobile number to search for your account." );
	System.out.println("this is after assertion");
	Softit.assertAll();
	
	
	
  }
  @BeforeClass
  public void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\omarf\\eclipse-workspace\\automationOmarProgram\\Drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");
driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
