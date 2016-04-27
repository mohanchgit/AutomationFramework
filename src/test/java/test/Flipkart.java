package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appspec.HomePage;
import appspec.SignUp;
import appspec.electronic.Mobiles;

public class Flipkart {


	@Test
	public void verifyHomePage() {
		try{
			HomePage.launchApp();
		}catch(Exception e){
			System.out.println(e);

		}
	}

	@Parameters({"username","password"})
	@Test
	public void verifyLogin(String username,String password){
		SignUp.userLogin(username,password);

	}
	
   @Test
	public void verifyMobile(){
	   Mobiles.verifyMobile();
	   
   }
	
	
	
}
