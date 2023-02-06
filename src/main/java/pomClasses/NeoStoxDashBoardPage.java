package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage {
	
	
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement PopUpOkButton;
	@FindBy(id = "lbl_username")private WebElement UserName;
	@FindBy(id = "lnk_logout")private WebElement LogOutButton;
	
	public NeoStoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void HandlingPopUp()
	{
		PopUpOkButton.click();
		
	}
	
	public void ValidatingUserName()
	{
		String expectedUserName="Hi suyog vaidya";
		String actualUserName=UserName.getText();
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("tc is passed");
		}
	}
	
	public void LogOutFromNeoStox()
	{
		LogOutButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
