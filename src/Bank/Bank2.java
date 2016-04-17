package Bank;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank2 {
	@BeforeSuite
	public void OpenSel(){
		System.out.println("BeforeSuite%%%%%%%%%%%%");
	}
	
	@AfterSuite
	public void CloseSel(){
		System.out.println("AfterSuite%%%%%%%%%%%%%%");
	}
	
	@BeforeMethod
	public void xyz(){
		System.out.println("Beforetest method in Bank2");
		throw new SkipException("Skipping the test ");
	}
	
	@Test
	public void ApplyHL(){
		System.out.println("Apply for Home Loan");
	}
	
	@Test
	public void ApplyPL(){
		System.out.println("Apply for Personal Loan");
	}

}
