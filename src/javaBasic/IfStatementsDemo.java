package classwork;

public class IfStatementsDemo {

	public static void main(String[] args) {
		//simpleIf();
		//ifElse();
		//ifElseifLadder();
		nestedif();
	}
	
	public static void simpleIf() {
		
		int x = 8;
		
		if (x > 0) {
			System.out.println(" x > 0");
		}

		System.out.println("i am after if");
	}
	
	public static void ifElse() {
		
		int x = 0;
		
		if (x > 0) {
			System.out.println(" x > 0");
		} else {
			System.out.println(" x <= 0");
		}

		System.out.println("i am after if");
	}
	
	public static void ifElseifLadder() {
		
		int x = 10;
		
		if (x > 0) {
			System.out.println(" x > 0");
		} else if(x==0){
			System.out.println(" x is 0");
		} else {
			System.out.println(" x < 0");
		}

		System.out.println("i am after if");
	}
	
	public static void nestedif() {
		
		int x = 10;
		
		if(x > 0) {
			System.out.println(" x is a positive");
		} else {
			if(x==0) {
				System.out.println(" x is zero");
			} else {
				System.out.println(" x is a negative");
			}
		}

		System.out.println("i am after if");
	}

}
