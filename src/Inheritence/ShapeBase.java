package classwork.oops.inheritance;

public class ShapeBase {
	
	public float radius = 13.45f;
	
	public void areaOfCircle() {
		
		System.out.println("area of parent circle :" + Math.PI * radius * radius);
	}
	
	public void areaOfRectangle(int l, int w) {
		System.out.println("Area of parent rectangle : " + (l * w));
	}
	
	public static void myStat() {
		System.out.println(" I am in parent stat");
	}
	
	public void mynonStat() {
		System.out.println(" I am in parent non stat");
	}
	
//	public static void main(String[] args) {
//		ShapeBase  obj = new ShapeBase();
//		obj.areaOfCircle();
//		obj.areaOfRectangle(8, 9);
//		
//		ShapeChild obj2 = new ShapeChild();
//		obj2.areaOfCircle();
//		obj2.areaOfRectangle(8, 9);
//	}

}
