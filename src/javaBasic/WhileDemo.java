package classwork;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 101;
		while(i < 101) {
			System.out.println(i);//2, 3, 100
			i++;//2,3, 4..101
		}
		System.out.println("after while");
		
		int j = 100;
		while (j > 0) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("---------------------");
		int x = 5;
		while(x < 500) {
			System.out.println(x);
			x +=5;
		}
	}

}
