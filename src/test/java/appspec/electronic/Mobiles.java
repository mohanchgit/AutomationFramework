package appspec.electronic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appspec.HomePage;

public class Mobiles extends HomePage{

	private static By electronics=By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[1]/a/span"); 
	private static By mobiles=By.xpath(".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[1]/a");

	public static void verifyMobile(){

		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(electronics);
		action.moveToElement(ele).build().perform();

		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(mobiles)).findElement(mobiles).click();


	}


}
