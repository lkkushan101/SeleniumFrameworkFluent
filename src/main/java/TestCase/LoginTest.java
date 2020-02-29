package TestCase;
import PageClasses.LoginPage;
import PageClasses.HomePage;
import Utility.ConstantVariables;
import Utility.JSONReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {
	public static WebDriver driver  = null;
@BeforeClass
public void setup()
{
	      driver = BaseClass.initilize();
 }
	 
  @Test
  public void  Test () throws FileNotFoundException, IOException, ParseException
  {
	  		BaseClass.openurl(ConstantVariables.URl);
	      

			LoginPage.using(driver).launch().setUserName(JSONReader.ReadJSONFile("User_Name", "./Data/data.json")).setPassword(JSONReader.ReadJSONFile("Password", "./Data/data.json")).clickLogin();
     		Assert.assertTrue(HomePage.using(driver).getHomePageDashboardUserName());
     		driver.close();
  }
  

}
