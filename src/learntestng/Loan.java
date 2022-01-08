package learntestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Loan {
  
  @Test
  public void HL() {
	  System.out.println("HL");
	  Reporter.log("HL");
  }
  
  @Test
  public void PL() {
	  System.out.println("PL");
	  Reporter.log("PL");
  }
  
  @Test
  public void CL() {
	  System.out.println("CL");
	  Reporter.log("CL");
  }
  
  @Test
  public void google() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		String t1=driver.getTitle();
		System.out.println("Title of the page :"+t1);
		Thread.sleep(3000);
		driver.close();
  }
	
  @BeforeClass
  public void openbrowser() {
	  System.out.println("Open FF");
  }

  @AfterClass
  public void closeBrowser() {
	  System.out.println("driver.quit()");
  }

}
