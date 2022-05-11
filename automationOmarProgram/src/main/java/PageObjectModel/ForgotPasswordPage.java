package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage { //locaters
WebDriver driver;
@FindBy(xpath = "(//*[@name='email'])[2]") WebElement Id;
@FindBy(name = "did_submit") WebElement SearchbuttonClick;
@FindBy(xpath = "//*[contains(text),'Please enter your email')]") WebElement Questions; //xpath because it has two names
    public ForgotPasswordPage(WebDriver driver){
	this.driver=driver;                          
	PageFactory.initElements((driver), this);   //our constructor
	
    }
    
    public void idsendkeys() {
    Id.sendKeys("omar@gmail.com");
    }
    public void searchbuttonclick() {  //untill here nothing will run because we are not using anything
    	SearchbuttonClick.click();
    }
    public void Questions() {
   String Questions.getText(){            //when we want to get a text we use this action gettext we already added a locater for it now we add a method 
    }
}
