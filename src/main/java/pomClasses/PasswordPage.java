package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {

	@FindBy(id = "txt_accesspin")private WebElement PWDField;
	@FindBy(id = "lnk_submitaccesspin")private WebElement SubmitButton;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword()
	{
		PWDField.sendKeys("9890");
	}
	
	public void ClickOnSubmitButton()
	{
		SubmitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
