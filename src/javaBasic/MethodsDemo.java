package classwork.oops;

public class MethodsDemo {
	
	float radius = 7.5f;
	int side = 10;
	
	public void areaofCircle() {
		double a = Math.PI * radius * radius;
		System.out.println("Area of circle : " + a);
	}
	
	public int areaOfSquare() {
		int a = side * side;
		return a;
	}

	
	public void areaOfRectangle(int l, int w) {
		int a = l * w;
		System.out.println("area of Rectangle : " + a);
	}
	
	public int areaOfRect(int l, int w) {
		int a = l * w;
		return a;
	}

	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.areaofCircle();
		
		int area = obj.areaOfSquare();
		System.out.println("Area of Square : " + area);

		obj.areaOfRectangle(10, 15);
		
		int l1 = 20;
		int w1 = 15;
		area = obj.areaOfRect(l1, w1);
		System.out.println("Area of Rect1 : " + area);
		area = obj.areaOfRect(50, 30);
		System.out.println("Area of Rect2 : " + area);
		obj.radius = 20.75f;
		obj.areaofCircle();
	}

}
