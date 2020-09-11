package classwork.oops.inheritance;

public class CircleChild extends CircleBase{
	
	public void perimeter() {
		float p = (float) (2 * MYPI * radius);
		System.out.println("parimeter : " + p);
	}

	public static void main(String[] args) {
		CircleChild obj = new CircleChild();
		obj.area();
		obj.perimeter();
		obj.printP();
		//System.out.println(obj._p);// not accessible as it is private in parent class
		System.out.println(obj.x);
		System.out.println(obj.pr);
		
	}

}
