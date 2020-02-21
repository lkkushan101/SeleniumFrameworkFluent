package TestCase;
import PageClasses.LoginPage;
import PageClasses.HomePage;
import Utility.JSONReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
	
  
  @Test
  public void  Test () throws FileNotFoundException, IOException, ParseException
  {
	      
		 	System.setProperty("webdriver.chrome.driver","C:\\chromedriver76\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			LoginPage.using(driver).launch().setUserName(JSONReader.ReadJSONFile("User_Name", "./Data/data.json")).setPassword(JSONReader.ReadJSONFile("Password", "./Data/data.json")).clickLogin();
     		Assert.assertTrue(HomePage.using(driver).getHomePageDashboardUserName());
     		driver.close();
  }
  

}
