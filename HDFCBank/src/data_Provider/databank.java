package data_Provider;

import org.testng.annotations.DataProvider;

public class databank {
	
	@DataProvider(name="number1")
	public static Object[][] value1(){
		Object[][] data=new Object[2][3];
		data[0][0]=10;
		data[0][1]=20;
		data[0][2]=30;
		
		data[1][0]=100;
		data[1][1]=200;
		data[1][2]=300;
		
		return data;
	}
	
	@DataProvider(name="number2")
	public static Object[][] value2(){
		Object[][] data=new Object[2][3];
		data[0][0]=10;
		data[0][1]=2;
		data[0][2]=3;
		
		data[1][0]=10;
		data[1][1]=8;
		data[1][2]=9;
		
		return data;
	}

}
