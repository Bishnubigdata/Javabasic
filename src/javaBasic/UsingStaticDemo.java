package classwork.oops;

public class UsingStaticDemo {
	
	public float f  = 20.0f;
	public static int x = 10;
	
	public static final float PI = 3.14f;
	public static final float PI_VALUE = 3.14f;
	public static void main(String[] args) {
		UsingStaticDemo obj = new UsingStaticDemo();
		System.out.println(obj.f);
		obj.printF();
		System.out.println(x);
		statMethod();
		
		System.out.println(PI);
		
	}

	public void printF() {
		System.out.println(" f : " + f);
	}
	
	public static void statMethod() {
		System.out.println(" x : " + x);
	}
}
