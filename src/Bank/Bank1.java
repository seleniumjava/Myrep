package Bank;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank1 {
	
	
	@Test(priority=1, groups={"Regression"})
	public void MoneyTransfer(){
		System.out.println("Transfer money online");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://demo.borland.com/gmopost/");	
	}

	@Test(priority=4, groups={"Regression"})
	public void StdGen(){
		System.out.println("Generate statement");
	}
	
	@Test(priority=2,groups={"Acceptance"} )//enabled=false
	public void BillPayment(){
		System.out.println("Pay the bill Online");
		Assert.assertEquals(4, 5);
	}
	
	@Test(priority=3, groups={"Regression", "Acceptance"}, dependsOnMethods={"BillPayment"})
	public void ApplyCC(){
		System.out.println("Apply for a CC");
	}
	
	@BeforeMethod
	public void Login(){
		System.out.println("BeforeMethod-----------------------");
	}
	
	@AfterMethod
	public void Logout(){
		System.out.println("AfterMethod--------------------");
	}
	
	@BeforeClass
	public void openBrowser(){
		System.out.println("BeforeClass============");
		
	}
	
	@AfterClass
	public void CloseBrowser(){
		System.out.println("AfterClass============");
	}
	
	@BeforeTest
	public void connectDB(){
		System.out.println("BeforeTest***************");
	
	}
	
	@AfterTest
	public void DisconnectDB(){
		System.out.println("AfterTest****************");
		
	}
	
	@BeforeSuite
	public void OpenSel(){
		System.out.println("BeforeSuite###########################");
	}
	
	@AfterSuite
	public void CloseSel(){
		System.out.println("AfterSuite#######################");
	}
	
	
	
	
}
