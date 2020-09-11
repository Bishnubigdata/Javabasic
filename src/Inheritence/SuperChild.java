package classwork.oops.inheritance;

public class SuperChild extends SuperBase{
	
	SuperChild(float r,  int l, int w) {
//		this(r,l); // this or super must be first constructor
		super(r);
		length=l;
		width=w;
	}
//	SuperChild(float r,  int l){
//		super(r);
//		length=l;
//	}
	

	public float radius = 9.75f;
	public int length=0;
	public int width = 0;
	
	
	public void perimeter() {
		System.out.println(super.radius);
		System.out.println("perimter : " + 2 * Math.PI * super.radius);
	}
	
	public static void main(String[] args) {
		SuperChild obj = new SuperChild(25.5f, 20 , 30);
		obj.areaofcircle();
		obj.perimeter();
		System.out.println(obj.length);
		System.out.println(obj.width);
	}

}
