package learntestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestAssert {
	
	//@Test//Hard Assertion
	public void assert1() {
		Assert.assertEquals(3, 3);
		System.out.println("AAAAAA");
		Assert.assertEquals(true,true);
		System.out.println("BBBBBB");
		Assert.assertTrue(10>3, "Error msg is:________");
		System.out.println("cccc");
		Assert.assertFalse(10<3,"Error*******>>");
		System.out.println("DDDDD");
		
	}
	
	@Test//Soft Assertion
	public void assert2() {
		SoftAssert s=new SoftAssert();
		s.assertEquals(3, 4);
		System.out.println("AAAAAA");
		s.assertEquals(true,false);
		System.out.println("BBBBBB");
		s.assertTrue(10>3, "Error msg is:________");
		System.out.println("cccc");
		s.assertFalse(10<3,"Error*******>>");
		System.out.println("DDDDD");
		s.assertAll();
		
	}

}
