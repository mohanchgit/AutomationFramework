package appspec;

import org.openqa.selenium.By;

public class SignUp extends HomePage{
	
	private static By signup=By.linkText("Signup");
	private static By usernametb=By.cssSelector(".fk-input.login-form-input.user-email");
	private static By passwordtb=By.cssSelector(".fk-input.login-form-input.user-pwd");
	private static By loginbutton=By.cssSelector(".submit-btn.login-btn.btn");
	
	public static boolean userLogin(String username,String password){
		try{
		driver.findElement(signup).click();
		driver.findElement(usernametb).sendKeys(username);
		driver.findElement(passwordtb).sendKeys(password);
		driver.findElement(loginbutton).click();
		return true;
		}catch(Exception e){
			return false;
		}
		
		
		
	}

}
