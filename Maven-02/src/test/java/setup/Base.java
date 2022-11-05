package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openchromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	
	public static WebDriver firefoxbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\geckodriver-v0.32.0-win32//grckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	

	
	public static WebDriver operabrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\operadriver_win32 (1)//opera.exe");
		WebDriver driver = new OperaDriver();
		return driver;
	}
	
	
	
	
	
	
	
	

}
