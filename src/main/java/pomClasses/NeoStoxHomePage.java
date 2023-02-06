package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage {
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement SignInButton;
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignInButton()
	{
		SignInButton.click();
	}

}
