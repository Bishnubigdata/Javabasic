package classwork;

public class UsingVariables {

	boolean bool = true;
	char myChar = 'A';
	byte mybyte = 75;
	short myShort = -30786;
	int myInt = 234342342;
	long myLong = -234242342342l;
	float myFloat = 324234.232233f;
	double myDouble = 3423423.23423424223f;
	String myString = "John";
	
	public static void main(String[] args) {
		UsingVariables obj = new UsingVariables();
		obj.bool = false;
		obj.myString = "Steve";
		obj.myString = "Mc";
		System.out.println("bool : " + obj.bool);
		System.out.println("char : " + obj.myChar);
		System.out.println("byte : " + obj.mybyte);
		System.out.println("short : " + obj.myShort);
		System.out.println("int : " + obj.myInt);
		System.out.println("long : " + obj.myLong);
		System.out.println("float : " + obj.myFloat);
		System.out.println("double : " + obj.myDouble);
		System.out.println("String : " + obj.myString);
		
		
		boolean bool2 = false;
		char myChar2 = 'A';
		byte mybyte2 = 75;
		short myShort2 = -30786;
		int myInt2 = 234342342;
		long myLong2 = -234242342342l;
		float myFloat2 = 324234.232233f;
		double myDouble2 = 3423423.23423424223f;
		String myString2 = "John";
		System.out.println("bool : " + bool2);
		System.out.println("char : " + myChar2);

	}

}
