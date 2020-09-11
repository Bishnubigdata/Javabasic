package classwork;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a = 0;
		
		String retval = (a > 0) && (a ==0) ? "a is a postive" : "a is zero or negative";
		System.out.println(retval);
		
		boolean rb = (a > 0) ? true : false;
		System.out.println(rb);
	}

}
