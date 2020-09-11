package classwork.interfaces;

public class RectangleChild implements MathShapes{



	@Override
	public void area() {
		System.out.println("In area");
		
	}

	@Override
	public float perimeter(float r) {
		System.out.println("In perimter");
		return 0;
	}

	@Override
	public void volume() {
		System.out.println("In volume");
		
	}

	@Override
	public void mShape() {
		System.out.println("In mshape");
		
	}
	
	public static void main(String[] args) {
		RectangleChild obj = new RectangleChild();
		obj.area();
		obj.perimeter(7.5f);
		obj.volume();
		obj.mShape();

	}

}
