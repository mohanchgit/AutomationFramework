package appspec;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import confi.Configuration;

public class HomePage {
	
	public static WebDriver driver=null;

	public static void launchApp() throws IOException{

		String browser1=Configuration.verifyConfi();
		if(browser1.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();


		}else if(browser1.equalsIgnoreCase("chrome")){


			System.setProperty("webdriver.chrome.driver","E:\\May\\driverslib\\chromedriver.exe");
			driver=new ChromeDriver();

		}else{
			System.setProperty("webdriver.ie.driver", "E:\\May\\driverslib\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}

		driver.get("http://flipkart.com");
		driver.manage().window().maximize();


	}

}
