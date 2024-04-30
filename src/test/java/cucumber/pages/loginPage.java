package cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.base.ScenarioHooks;
import cucumber.utiles.propertiesUtils;
import cucumber.base.BroweserInitialization;

public class loginPage extends BroweserInitialization{
	
	
	@FindBy(id = "react-aria-1")
	private WebElement user_name;

	@FindBy(xpath = "//input[@id='react-aria-3']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='login-continue-button']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//button[@id='withpassword-sign-in-button']")
	private WebElement siginInButton;
	
	@FindBy(xpath="//button[@id='withpassword-sign-in-button']") 
	private WebElement selectopt;
 
	public loginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterUrl()
	{
		getDriver().get(propertiesUtils.getProperties("application.url"));
	}
	
	public void enterUsername(String useranme)
	{
		user_name.sendKeys(useranme);
	}
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
	public void clickSubmit()
	{
		siginInButton.click();
	}

}
