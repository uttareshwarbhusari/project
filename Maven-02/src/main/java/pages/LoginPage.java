package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passward;
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement login;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messanger;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		
public void sendusername()
{
	username.sendKeys("uttareshwar");
}	
public void sendpassward()
{
	passward.sendKeys("bhusari");
}
public void clickonlogin()
{
	login.click();
}
public void openmessangerpage()
{
	messanger.click();
}

























}
