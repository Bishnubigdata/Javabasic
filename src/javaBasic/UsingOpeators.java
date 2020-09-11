package classwork;

public class UsingOpeators {

	public static void main(String[] args) {
		
		//arithmeticOperators();
		//unaryOperators();
		//relationalOperators();
		//logicalOperators();
		assignmentOperators();
	}
	
	public static void arithmeticOperators() {
		byte b1 = 25;
		byte b2 = 75;
		
		int res;
		res = b1 + b2;
		System.out.println("Addition : " + res);
		
		res = b1 - b2;
		System.out.println("Subtraction : " + res);
		
		res = b1 * b2;
		System.out.println("Multiplication : " + res);
		
		float divres = (float) b1/b2;
		System.out.println("Division : " + divres);
		
		res = b2%24;
		System.out.println("Remainder : " + res);
		
		System.out.println(" 5 ^ 5: " + Math.pow(5,5));
	}

	public static void unaryOperators() {
		
		int u = 5;
		
		u++; // u = u + 1
		System.out.println(u);
		++u; // u = u + 1
		System.out.println(u);
		u--; // u = u -1
		System.out.println(u);
		--u; // u = u -1
		System.out.println(u);
		System.out.println("------------");
		System.out.println(u++);// incremented after printing
		System.out.println(u);
		System.out.println(++u); //incremented and printed
		System.out.println(u);
		System.out.println(u--);// decremented after printing
		System.out.println(u);
		System.out.println(--u); //decremented and printed
		System.out.println(u);
		
	}
	
	public static void relationalOperators() {
		
		int i = 9;
		int j = 10;
		boolean res = i > j;
		System.out.println(" i > j : " + res);
		res = i < j;
		System.out.println(" i < j : " + res);
		res = i >= j;
		System.out.println(" i >= j : " + res);
		res = i <= j;
		System.out.println(" i <= j : " + res);
		
		res = i == j;
		System.out.println(" i equals j : " + res);
		res = i != j;
		System.out.println(" i not equals j : " + res);
	}
	
	public static void logicalOperators() {
		
		int i = 9;
		int j = 10;
		
		boolean res = (i > 1) && (j > 20);
		System.out.println("Using && : " + res);
		
		res = (i > 1) || (j > 20);
		System.out.println("Using && : " + res);
		
		res =  ( (i > 1) || (j  < 20) ) && ( i < 10);
		System.out.println("Using && : " + res);
		
		res = !(i < 5);
		System.out.println(" not : " + res);
	}
	
	public static void assignmentOperators() {
		
		int a = 5;
		int b = 6;
		System.out.println(a);
		a+=b; // a = a + b;
		System.out.println(a);
		a-=b; // a = a - b;
		System.out.println(a);
		a*=b; // a = a * b;
		System.out.println(a);
		a/=b; //a = a / b;
		System.out.println(a);
		b%=a; // b = b % a;
		System.out.println(b);
		
		a+=10; // a = a + 10;
		System.out.println(a);
		a-=10;// a = a - 10;
		System.out.println(a);
		
	}
}
