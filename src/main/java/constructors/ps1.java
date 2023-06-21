package constructors;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps1 extends ps {
	
	
	@Test
	public void childmethod() {
		ps2 p2=new ps2(3);
		dothis();
		int a=5;
		System.out.println(p2.increament());
		System.out.println(p2.decreament());
		System.out.println(p2.multiply3());
	}
	
}
