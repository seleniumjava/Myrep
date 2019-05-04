package listenersdemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(listenersdemo.TestngListener.class)
/*
 This is class level implementation of listener. So I have to mention the 
 above line(6) in every class
 Now implement in suite level, so comment line no 6.
 */
public class MyFirstTestCase {
	
	
	@Test(priority=1)
	public void TC1() {
		Assert.assertEquals(4, 4);
	}
	
	@Test(priority=2)
	public void TC2() {
		Assert.assertEquals(3, 6);
	}
	
	@Test(priority=3,dependsOnMethods="TC2")
	public void TC3() {
		Assert.assertEquals(4, 4);
	}

}
