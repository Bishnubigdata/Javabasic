package classwork;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[][] twoDarray = new int[4][5];
		
		twoDarray[0][0] = 11;
		twoDarray[0][1] = 12;
		twoDarray[0][2] = 13;
		twoDarray[0][3] = 14;
		twoDarray[0][4] = 15;
		
		twoDarray[1][0] = 21;
		twoDarray[1][1] = 22;
		twoDarray[1][2] = 23;
		twoDarray[1][3] = 24;
		twoDarray[1][4] = 25;
		
		twoDarray[2][0] = 31;
		twoDarray[2][1] = 32;
		twoDarray[2][2] = 33;
		twoDarray[2][3] = 34;
		twoDarray[2][4] = 35;
		
		twoDarray[3][0] = 41;
		twoDarray[3][1] = 42;
		twoDarray[3][2] = 43;
		twoDarray[3][3] = 44;
		twoDarray[3][4] = 45;
		
		System.out.println("no.of arrays : " + twoDarray.length);
		System.out.println("each array length : " + twoDarray[0].length);
		for(int i = 0; i < twoDarray.length; i++) {  // 0, 1, 2
			for(int j = 0; j < twoDarray[0].length; j++) { // 0, 1, 2, 3, 4
				System.out.print(twoDarray[i][j] + "\t"); // 00, 01, 02, 03, 04, 10, 11, 12, 13, 14
			}
			System.out.println();
		}
		
		System.out.println("-------------For each------------------");
		
		for(int[] tempArr : twoDarray) {
			for(int myval : tempArr) {
				System.out.print(myval + "\t");
			}
			System.out.println();
		}
		
	}

}
