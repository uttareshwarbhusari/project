package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	private WebDriver driver ; 
	private 	Actions act;
	@FindBy (xpath="//a[text()=' Return to messenger.com ']")
	private WebElement returnbutton;
	
	@FindBy (xpath="//a[text()=' Visit our help center ']")
	private WebElement contacttohelp;
	
	
public	RoomsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	this.driver = driver;
	new Actions(driver);
	
}
	

public void clickonreturnbutton()
{
	returnbutton.click();
	
}
	
	

public void clickoncontacttohelp()
{
	contacttohelp.click();
}
		
	
	
	
	
	
	
	
	
	
	
	

}
