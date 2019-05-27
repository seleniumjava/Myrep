package listenersdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MySecondTestCase {
	@Test(priority=1)
	public void TC21() {
		Assert.assertEquals(4, 4);
	}
	
	@Test(priority=2)
	public void TC22() {
		Assert.assertEquals(3, 6);
	}
	
	@Test(priority=3,dependsOnMethods="TC22")
	public void TC23() {
		Assert.assertEquals(4, 4);
	}
}
