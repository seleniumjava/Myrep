package listenersdemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTC {
	
	@Test//(retryAnalyzer=RetryAnalyzer.class)
	public void TC1() {
		Assert.assertEquals(4, 9);
	}
	
	@Test//(retryAnalyzer=RetryAnalyzer.class)
	public void TC2() {
		Assert.assertEquals(true, false);
	}
	
	@Test//(retryAnalyzer=RetryAnalyzer.class)
	public void TC3() {
		Assert.assertEquals(true, true);
	}
	
}
