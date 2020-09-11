package classwork.oops.inheritance;

public class ShapeChild extends ShapeBase{
	
	float r = 8.9f;
	
	@Override
	public void areaOfCircle() {
		System.out.println("Area of child circle : " + Math.PI * r * r);
	}
	
	@Override
	public void areaOfRectangle(int a, int b) {
		System.out.println("Area of child rectangle : " + (a * b));
	}
	
	public void perimeterOfcircle() {
		System.out.println("Perimter of circle : " + 2 * Math.PI * r);
	}
	
//	public void myStat() {  // Compile error
//		System.out.println(" I am in child stat");
//	}
//	
//	public static void mynonStat() { //compile error
//		System.out.println(" I am in child non stat");
//	}
	
	//@Override - cant override and it hides
	public static void myStat() {
		System.out.println(" I am in child stat");
	}
	
	public static void main(String[] args) {
		ShapeChild obj = new ShapeChild();
		obj.areaOfCircle();
		obj.areaOfRectangle(8, 9);
		obj.perimeterOfcircle();
		myStat();
		ShapeBase.myStat();
		
//		ShapeBase obj2 = new ShapeBase();
//		obj2.areaOfCircle();
//		obj2.areaOfRectangle(6, 5);
		
		ShapeBase obj3 = new ShapeChild();
		obj3.areaOfCircle();
		obj3.areaOfRectangle(8, 9);
		
		//obj3.perimeterOfcircle(); //not accessible
		
	}

}
