package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	    WebDriver driver;

	    By homePageUserName = By.xpath("//table//tr[@class='heading3']");
   

	    private HomePage(WebDriver driver){

	        this.driver = driver;

	    }
	    
	    public static HomePage using(WebDriver driver) {
		     
	    	return new HomePage(driver);
	    }



	    //Get the User name from Home Page

	        public boolean getHomePageDashboardUserName(){

	             return this.driver.findElement(homePageUserName).getText().toString().contains("Manger Id : mgr123");
	          

	        }
}
