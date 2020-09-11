package classwork.oops;

public class AnotherClass {

	
	public static void main(String[] args) {
		ClassObjectDemo o1 = new ClassObjectDemo();
		System.out.println(o1.radius); //public
		System.out.println(o1.name); // no access modifier or package-private 
	//	System.out.println(o1._vol); // private - not accessible
		o1.area();
		o1.perimeter();
		System.out.println("-------------------------");
		MethodOverloadingDemo o2 = new MethodOverloadingDemo();
		o2.area(8.5f);
		System.out.println("Area of Sqare: " + o2.area(8));
		o2.area(9, 15);
		
		UsingStaticDemo obj = new UsingStaticDemo();
		System.out.println(obj.f);
		System.out.println(UsingStaticDemo.x);
		UsingStaticDemo.statMethod();
	}
}
