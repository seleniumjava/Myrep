package learnassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void userReg() {
		String title1="xxxx";
		String title2="xxxxyy";
		System.out.println("AAAAA");
		//Assert.assertEquals(title1, title2);
		//Assert.assertFalse(title1.equals(title2));
		//Assert.assertTrue(title1.equals(title2), "Title is same");
		sa.assertEquals(title1, title2);
		System.out.println("BBBBBB");
		sa.assertAll();
		
	}

}
