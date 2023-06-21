package constructors;

public class ps2 extends ps3 {
	
	int a;
	public ps2(int i) {
		super(i);
		this.a=i;
		
	}
	public int increament() {
		a +=1;
		return a;
	}
	public int decreament() {
		a -=1;
		return a;
	}

}
