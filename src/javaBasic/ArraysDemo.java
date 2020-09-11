package classwork;

public class ArraysDemo {

	public static void main(String[] args) {

		
		//int[] ar;
		//ar = new int[10];
		
		int[] ar  = new int[10];
		
		//int ar[] = new int[10];
		
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;
		ar[3] = 4;
		ar[4] = 5;
		ar[9] = 10;
		
		System.out.println("First element : " + ar[0]);
		System.out.println("2 element : " + ar[1]);
		System.out.println("3 element : " + ar[2]);
		System.out.println("4 element : " + ar[3]);
		System.out.println("5 element : " + ar[4]);
		System.out.println("6 element : " + ar[5]);
		System.out.println("10 element : " + ar[9]);
		System.out.println("--------------------");
		int i = 0;
		while(i < ar.length) {
			System.out.println(ar[i]);
			i++;
		}
		System.out.println("-----using for --------------");
		for(int j =0; j < ar.length; j++) {
			System.out.print(ar[j] + " , ");
		}
		System.out.println();
		ar[5] = 6;
		ar[9] = 100;
		for(int j =0; j < ar.length; j++) {
			System.out.print(ar[j] + " , ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		String[] names = { "John", "trump", "bill", "donald", "larry", "page" };
		
		System.out.println("lengh :" + names.length);
		for(int k = 0; k < names.length; k++) {
			System.out.println(names[k]);
		}
		names[5] = "oats";
		System.out.println("---------------");
		for(int k = 0; k < names.length; k++) {
			System.out.println(names[k]);
		}
		
		
		
	}

}
