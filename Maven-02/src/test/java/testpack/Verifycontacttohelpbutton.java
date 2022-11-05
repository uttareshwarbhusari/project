package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LoginPage;
import pages.Messangerpage;
import pages.RoomsPage;

public class Verifycontacttohelpbutton {
	
	
	public static void main (String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			driver.get("http://www.facebook.com/");    
	LoginPage loginPage	= new LoginPage(driver) ;   
	loginPage.openmessangerpage();

	Messangerpage messangerpage = new Messangerpage(driver);
	messangerpage.clickonrooms();

	RoomsPage roomsPage = new RoomsPage(driver);
	roomsPage.clickoncontacttohelp();

	
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	Assert.assertEquals(url, "https://www.messenger.com/help");
   Assert.assertEquals(title, "Messenger Help Centre");	
	
	}	

}
