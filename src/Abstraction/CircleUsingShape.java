package classwork.oops.abstraction;

public class CircleUsingShape extends AbstractShapeParent{
		float radius = 7.5f;
	@Override
	public void area() {
		System.out.println("area of circle : " + Math.PI * radius * radius);
	}
	
	public static void main(String[] args) {
		CircleUsingShape obj = new CircleUsingShape();
		obj.area();
	}

}
