package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LoginPage;
import pages.Messangerpage;
import pages.RoomsPage;

public class Verifyreturnbutton {
	
public static void main (String []args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
	    driver.manage().window().maximize();
	    
LoginPage loginPage	= new LoginPage(driver) ;   
loginPage.openmessangerpage();

Messangerpage messangerpage = new Messangerpage(driver);
messangerpage.clickonrooms();

RoomsPage roomsPage = new RoomsPage(driver);
roomsPage.clickonreturnbutton();

String url = driver.getCurrentUrl();
String title = driver.getTitle();



Assert.assertEquals("url","https://www.messenger.com/" );
Assert.assertEquals(title, "Messenger");


//if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
//{
//	System.out.println("PASSED");
//}
//else
//{
//	System.out.println("FAILED");
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
