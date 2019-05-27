package data_Provider;

import org.testng.annotations.Test;

public class math {
	
	@Test(dataProviderClass=databank.class,dataProvider="number1")
	public void add(int n1, int n2, int n3){
		int sum=n1+n2+n3;
		System.out.println(sum);
	}
	
	@Test(dataProviderClass=databank.class,dataProvider="number1")
	public void mult(int n1, int n2, int n3){
		int mult=n1*n2*n3;
		System.out.println(mult);
	}
	
	@Test(dataProviderClass=databank.class,dataProvider="number2")
	public void multip(int n1, int n2, int n3){
		int mult=n1*n2*n3;
		System.out.println(mult);
	}

}
