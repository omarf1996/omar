package PageObjectModel;
import org.openqa.selenium.WebDriver; //class is page object model
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home {
	WebDriver driver;
	@FindBy(name="email") WebElement Ids;  //this is our locaters
	@FindBy(name="pass") WebElement Passwords;
	@FindBy(linkText="Forgot password?") WebElement forgot;
	//we have to do a constructor for the class
	 // name of const must be equal to the name of the class
	
	     //home is the constructor
	public Home(WebDriver driver){
		this.driver=driver;                           // why we used this: referring to global variable
		PageFactory.initElements((driver), this);
	//2.this is our constructor
		                                               //to differentiate between global and local
		
		
		                                                 //in selenium to initialize elements
		                                                 //page line is to put the two arguments inside in order to initialize
		                                                  //to get the started for upcoming classes we have to use the same
		                                                   //page factory and copy it the only thing we will change is the name of 
		                                                      //the class or the constructor
		
		
	}
	public  void Email() {                                 //we have to create a method for each action
		Ids.sendKeys("john");
		
	
	}
	public void Passwordsfeild() {                           //3.this is the methods we have to use
	Passwords.sendKeys("silver");}
	
	public void Forgotpass() {
	forgot.click();	
	
	//locating elements
	//page factory const   * our steps for starting the class
	//methods for each elements
		
		
		
		
		
	}
	
	 
		 
	
}   

