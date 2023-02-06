package testngTestClasses;

import org.testng.annotations.Test;

import pomClasses.NeoStoxDashBoardPage;
import pomClasses.NeoStoxHomePage;
import pomClasses.NeoStoxSignInPage;
import pomClasses.PasswordPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NeoStoxTestClass {
 WebDriver driver;
 NeoStoxHomePage home;
 NeoStoxSignInPage signIn;
 PasswordPage Pass;
 NeoStoxDashBoardPage dash;
	@BeforeClass
	  public void LaunchingBrowser() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
	  }
	
	 @BeforeMethod
	  public void LogInToNeoStox() 
	 {
		 home= new NeoStoxHomePage(driver) ;
		 home.ClickOnSignInButton();
		 Pass=new PasswordPage(driver);
		 signIn.EnteringMobNum();
		 signIn.ClickingOnSignInButton();
		 Pass=new PasswordPage(driver);
		 Pass.EnterPassword();
		 Pass.ClickOnSubmitButton();
		 dash=new NeoStoxDashBoardPage(driver);
		 dash.HandlingPopUp();
	  }
  @Test
  public void ValidatingUserName() 
  {
	  dash.ValidatingUserName();
  }
 

  @AfterMethod
  public void LoggingOutFromNeoStox() 
  {
	  dash.LogOutFromNeoStox();
  }

  

  @AfterClass
  public void ClosingBrowser()
  {
	  driver.close();
  }

}
