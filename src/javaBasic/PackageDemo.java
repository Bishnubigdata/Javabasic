package classwork.oops;

//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;

import exercises.EMICalculator;
//import static java.lang.Math.PI;
import static java.lang.Math.*;

public class PackageDemo {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			ArrayList<String> lst = new ArrayList<String>();
			
			EMICalculator obj = new EMICalculator();
			
			ChildCircle o1 = new ChildCircle();//  from you local package
	
			
			classwork.ChildCircle o2 = new classwork.ChildCircle(); // Fully qualified name
			o2.area();
			
			System.out.println(PI);
			System.out.println(abs(34.5f));
		}

}
