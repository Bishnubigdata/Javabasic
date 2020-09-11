package classwork.oops.inheritance;

public class CircleBase {
	
	public float radius = 18.75f;
	public static final float MYPI = 3.1343f;
	
	int x = 25;
	private int _p = 15;
	protected int pr = 30;
	
	public void area() {
		float a = (float) (Math.PI * radius * radius);
		System.out.println("Area of Circle : " + a);
	}
	
	public void printP() {
		System.out.println(_p);
	}

//	public static void main(String[] args) {
//		
//		CircleBase obj = new CircleBase();
//		obj.area();
//	}

}
