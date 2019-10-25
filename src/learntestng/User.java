package learntestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class User {
	
	@Test(dataProvider="userdata")
	public void userReg(String u,String p,String e) {
		System.out.println(u+"-----"+p+"-----"+e);
		
	}
	
	@DataProvider
	public Object userdata() {
		Object d[][]=new Object[2][3];
		d[0][0]="u1";
		d[0][1]="p1";
		d[0][2]="e1";
		
		d[1][0]="u2";
		d[1][1]="p2";
		d[1][2]="e2";
		
		return d;
	}
	
	

}
