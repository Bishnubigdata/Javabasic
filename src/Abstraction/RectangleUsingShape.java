package classwork.oops.abstraction;

public class RectangleUsingShape extends AbstractShapeParent{
	public int length =15 ;
	public int width =25;


	@Override
	public void area() {
		System.out.println("Area of rectangle : " + length * width);
	}
	
	public static void main(String[] args) {
		RectangleUsingShape obj = new RectangleUsingShape();
		obj.area();
	}

}
