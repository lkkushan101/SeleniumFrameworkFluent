package PageClasses;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	    WebDriver driver;

	    By user99GuruName = By.name("uid");

	    By password99Guru = By.name("password");

	    By titleText =By.className("barone");

	    By login = By.name("btnLogin");

	    private LoginPage(WebDriver driver){

	        this.driver = driver;

	    }
	    
	    public static LoginPage using(WebDriver driver) {
	     
	    	return new LoginPage(driver);
	    }

	    public LoginPage launch() {
	        this.driver.get("http://demo.guru99.com/V4/");
	        return this;
	    }

	    //Set user name in textbox

	    public LoginPage setUserName(String strUserName){

	        this.driver.findElement(user99GuruName).sendKeys(strUserName);
	        return this;

	    }

	    //Set password in password textbox

	    public LoginPage setPassword(String strPassword){

	         this.driver.findElement(password99Guru).sendKeys(strPassword);
	         return this;

	    }

	    //Click on login button

	    public LoginPage clickLogin(){

	            this.driver.findElement(login).click();
	            return this;

	    }

	    //Get the title of Login Page

	    public LoginPage getLoginTitle(){

	     this.driver.findElement(titleText).getText();
	     return this;

	    }

	  
	  

}
