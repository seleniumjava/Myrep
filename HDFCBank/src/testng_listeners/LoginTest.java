package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void logintest(){
		System.out.println("AAAAAAAAAAAAA");
		try{
			Assert.assertEquals(3, 9);	
		}catch(Throwable t){
			System.out.println("error: ");
			//report error
			ErrorUtil.addVerificationFailure(t);
			
		}
		
		System.out.println("BBBBBBBBB");
	}

}
