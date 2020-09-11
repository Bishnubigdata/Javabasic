package classwork;

public class TypeCastingDemo {

	public static void main(String[] args) {

		int a = 130; //4-bytes
		byte b = 120; // 1-byte
		
		a = b; // Type conversion (automatic)
		
		System.out.println(a);
		
		System.out.println("------------------------");
		byte x = 10; // 1 byte
		int y = 120; // 4 bytes
		x = (byte) y; // type casting
		System.out.println(x);
		
		float f = 234.23423423f;
		double d = 345345345.33434534534d;
		f = (float) d;
		System.out.println(f);
		

	}

}
