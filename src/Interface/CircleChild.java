package classwork.interfaces;

import classwork.oops.inheritance.CircleBase;

public class CircleChild extends CircleBase implements ShapeInterface, ShapeVolume {
	float radius = 19.75f;


	@Override
	public void area() {
		System.out.println("Area = " + pival * radius * radius);
	}

	@Override
	public float perimeter(float r) {
		float p = 2 * pival * r;
		return p;
	}
	
	public static void main(String[] args) {
		CircleChild obj = new CircleChild();
		obj.area();
		System.out.println(" Perimter " + obj.perimeter(25.5f));
		obj.volume();
		obj.printP();
//		obj.defMethod();
//		ShapeInterface.statMethod();

	}

	@Override
	public void volume() {
		System.out.println("I am in voulme");
		
	}

}
