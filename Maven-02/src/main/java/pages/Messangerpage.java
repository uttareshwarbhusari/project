package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messangerpage {
	
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy (xpath="//a[text()='Features']")
	private WebElement feautures;
	
	@FindBy (xpath="//a[text()='Desktop app']")
	private WebElement desktpapp;
	
	
	public Messangerpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonrooms()
	{
		rooms.click();
	}
	
	
	public void clickonfeutures()
	{
		feautures.click();
	}
	public void clickondesktopapp()
	{
		desktpapp.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
