package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Messangerpage;
import pages.RoomsPage;
import setup.Base;

public class Verifytestclass extends Base
{
	private	WebDriver driver;
private	LoginPage loginPage;
private	Messangerpage messangerpage;
private	RoomsPage roomsPage;

    @Parameters("browser")
	@BeforeTest
	public void openbrowser(String browsername)
	{
     if(browsername.equals("chrome"))
     {
	driver = openchromebrowser();

     }
     
     if(browsername.equals("firefox"))
     {
	driver=firefoxbrowser();

     }
     
     if(browsername.equals("opera"))
     {
		driver = operabrowser();
     }
     
 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
    }
     
	@BeforeClass
	public void pomclassobjects()
	{    loginPage	= new LoginPage(driver) ; 
		 messangerpage = new Messangerpage(driver);
		 roomsPage = new RoomsPage(driver);
	}
	
	@BeforeMethod
	public void opentheappprocess() {
		System.out.println("BEFOREMETHOD");
		driver.get("http://www.facebook.com/");      
    loginPage.openmessangerpage();
	messangerpage.clickonrooms();

	 }
						
	@Test
	public void verifycontacttohelpbutton()
	{
		System.out.println("TEST1");
		roomsPage.clickoncontacttohelp();

		
		String url = driver.getCurrentUrl();
		//String title = driver.getTitle();
		
		
		
		
		Assert.assertEquals(url,"https://www.messenger.com/help" );
	
	}

	@Test
	public void verifyreturnbutton()
	{
		System.out.println("TEST2");
		roomsPage.clickonreturnbutton();

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}			
			
	}
	

	@AfterMethod
	public void logoutfromapp() {
		System.out.println("AFTERMETHOD");
		System.out.println("LOGOUT");
	}
	
	@AfterClass
	public void objectsrefremove()
	{
		   loginPage	= null ; 
			messangerpage = null ;
			roomsPage = null ;
		}
	
	
	@AfterTest
	public void closebrowser()
	{
      driver.close();
      driver = null;
      System.gc();
	}
	
	
	
	

}
