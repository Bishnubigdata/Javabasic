package classwork.oops;

public class ClassObjectDemo {
	
	
	public float radius ;
	String name="";
	private float _vol;
	
	
	public void area() {
		float area = (float) (Math.PI * radius * radius);
		System.out.println("Area = " + area);
	}
	
	void perimeter() {
		float p = (float) (2 * Math.PI * radius );
		System.out.println("Perimeter = " + p);
	}
	

	public static void main(String[] args) {
		
		ClassObjectDemo c1 = new ClassObjectDemo();
		System.out.println(c1.radius);
		c1.radius = 7;
		System.out.println(c1._vol);
		c1.area();
		c1.perimeter();
		System.out.println("--------------------------------");
		ClassObjectDemo c2 = new ClassObjectDemo();
		System.out.println(c2.radius);
		c2.radius = 15;
		System.out.println(c2.radius);
		c2.area();
		c2.perimeter();
		System.out.println("--------------------------------");
		System.out.println(c1.radius);
		System.out.println(c2.radius);
	}

}
