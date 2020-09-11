package classwork.oops;

public class ConstructorDemo {
	
	float radius;
	int side;
	int length;
	
	public ConstructorDemo() {
		radius = 0;
		side = 0;
		length = 0;
	}
	
	public ConstructorDemo(float r, int s){
		
		radius = r;
		side = s;
	}
	
	public ConstructorDemo(float r, int s, int l){
		
		radius = r;
		side = s;
		length = l;
	}
	
	public void areaOfCirlce() {
		System.out.println("Area of Circle: " + (Math.PI * radius * radius ));
	}

	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo(25.75f, 15);
		System.out.println(obj.radius);
		System.out.println(obj.side);
		System.out.println(obj.length);
		obj.areaOfCirlce();
		System.out.println("________________________");
		ConstructorDemo obj2 = new ConstructorDemo(175.25f, 255);
		System.out.println(obj2.radius);
		System.out.println(obj2.side);
		System.out.println(obj2.length);
		obj2.areaOfCirlce();
		System.out.println("________________________");
		ConstructorDemo obj3 = new ConstructorDemo();
		System.out.println(obj3.radius);
		System.out.println(obj3.side);
		System.out.println(obj3.length);
		obj3.areaOfCirlce();
		System.out.println("________________________");
		ConstructorDemo obj4 = new ConstructorDemo(78.5f, 7, 9);
		System.out.println(obj4.radius);
		System.out.println(obj4.side);
		System.out.println(obj4.length);
		obj4.areaOfCirlce();
	}

}
