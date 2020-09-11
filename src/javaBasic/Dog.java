package classwork;

import classwork.oops.ClassObjectDemo;

public class Dog {
	
	int legs = 4;
	int tail = 1;
	String name = "";
	
	String barkSound = "bow...bow..";
	
	
	public void bark() {
		System.out.println(barkSound);
	}
	public void run() {
		System.out.println("running");
		System.out.println(legs);
	}
	
	

	public static void main(String[] args) {
		
		Dog jimmy = new Dog();
		jimmy.bark();
		jimmy.run();
		
		Dog pappu = new Dog();
		pappu.bark();
		pappu.run();
		pappu.legs = 3;
		System.out.println(pappu.legs);
		
		Dog puppy = new Dog();
		puppy.bark();
		puppy.run();
		
		ClassObjectDemo o1 = new ClassObjectDemo();
		System.out.println(o1.radius); //Public
		//System.out.println(o1.name); // no access modifier - not allowed outside of its package	
		//System.out.println(o1._vol); // no access as it is private
		o1.area();
		//o1.perimeter(); // no access modifier - not allowed outside of its package	
	}

}
