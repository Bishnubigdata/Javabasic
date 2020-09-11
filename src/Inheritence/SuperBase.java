package classwork.oops.inheritance;

public class SuperBase {
	
	public float radius = 0f;
	
	SuperBase(float r){
		radius = r;
	}

	
	public void areaofcircle() {
		System.out.println(radius);
		System.out.println("Area of circle: " + Math.PI * radius * radius);
	}
	

}
