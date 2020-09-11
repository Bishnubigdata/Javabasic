package classwork.oops;

public class MethodOverloadingDemo {
	
	
	public void area(float radius) {
		float a = (float) (Math.PI * radius * radius);
		System.out.println("Area of Circle : " + a);
	}
	
	public void area(int length, int width) {
		int a = length * width;
		System.out.println("Area of Rectangle : " + a);
	}
	
	public int area(int side) {
		int a = side * side;
		return a;
	}
	
	public void area(float s1, float s2, float s3) {
		float a = s1 * s2 * s3;
		System.out.println("Area of Triangle : " + a);
	}
	
	

	
	

	public static void main(String[] args) {
		
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.area(8.75f);
		obj.area(20, 50);
		System.out.println("Are of square :" + obj.area(25));
		obj.area(3.5f, 4.5f, 6.5f);
		obj.area(9.75f);
	}

}
