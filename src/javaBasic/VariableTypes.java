package classwork;

public class VariableTypes {
	
	int i = 15;
	int x = 20;
	
	static int s = 40;

	public static void main(String[] args) {
		int a = 5; //Local variables
		
		System.out.println(a); 
		//System.out.println(b); 
		System.out.println(s); // static
		s = 50;
	//	System.out.println(i); //instance variables not allowed directly
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.i);
		VariableTypes obj2 = new VariableTypes();
		System.out.println(obj2.i);
		obj2.i = 100;
		System.out.println(obj2.i);
		System.out.println(obj.i);
		obj.i = 150;
		System.out.println(obj.i);
		s = 100;
		obj.myMethod();
		obj2.myMethod();
		//myMethod();
		statMEthod();
		
	}
	
	public void myMethod() {
		int b = 10; //Local variable
		//System.out.println(a);
		System.out.println(i);	
		System.out.println(x);	
		System.out.println(" s = " + s);
		
	}

	public static void statMEthod() {
		System.out.println(" s = " + s);
	}
	
	public void add2(int y, int z) {
		System.out.println(y+z);
	}
}
