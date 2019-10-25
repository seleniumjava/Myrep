package learntestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MoneyTransfer {
	  @BeforeClass
	  public void openbrowser() {
		  System.out.println("Open FF");
	  }

	  @AfterClass
	  public void closeBrowser() {
		  System.out.println("driver.quit()");
	  }
	  
	@BeforeMethod
	public void login() {
		System.out.println("Login to HDFC");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from HDFC");
	}
	
	@Test(priority=1,groups= {"p1"})
	public void NEFT() {
		System.out.println("NEFT MT");
	}
	
	@Test(priority=2,groups= {"p1"})
	public void IMPS() {
		System.out.println("IMPS MT");
	}
	
	@Test(priority=5,groups= {"p2"})
	public void RTGS() {
		System.out.println("RTGS MT");
		Assert.assertEquals(2, 1);
	}
	
	@Test(priority=4,groups= {"p2"},dependsOnMethods="RTGS")
	public void Gpay() {
		System.out.println("Gpay MT");
	}
	
	@Test(priority=3,enabled=false)
	public void IMT() {
		System.out.println("International MT");
	}
	
}
