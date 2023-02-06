package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage {
	
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNumField;
	@FindBy(id = "lnk_signup1")private WebElement SignInButton;
	
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnteringMobNum()
	{
		MobileNumField.sendKeys("8459313029");
	}
	
	public void ClickingOnSignInButton()
	{
		SignInButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
