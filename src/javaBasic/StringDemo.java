package classwork.oops;

public class StringDemo {

	public static void main(String[] args) {

		String	name = "Srinivas";
		
		String name2 = new String("Srinivas");
		
		char[] nameVal = { 'j', 'a', 'v', 'a'};
		String name3 = new String(nameVal);
		
		int a = 10;
		
		a = 20;
		
		String city = "Denver";
		
		city="Bangalore"; //Strings are immutable
		
		
		String myString = "Java is object oriented programming language oriented Java";
		String empString = "";
		System.out.println(" length : " + myString.length());
		
		System.out.println(" contains : " + myString.contains("programming"));
		System.out.println(" contains : " + myString.contains("Programming"));
		
		System.out.println(" Char(9) : " + myString.charAt(9));
		System.out.println(" Substring : " + myString.substring(9));
		System.out.println(" Substring : " + myString.substring(9, 20));
		System.out.println(" Is empty : " + myString.isEmpty());
		System.out.println(" Is empty : " + empString.isEmpty());
		
		String e1 = "H2KInfosys";
		String e2 = "H2kINfosys";
		
		System.out.println("Equals : " + e1.equals(e2));
		System.out.println("Equals : " + e1.equalsIgnoreCase(e2));
		System.out.println("concat : " + e1.concat(e2));
		
		System.out.println(" to uppercase : " + myString.toUpperCase());
		System.out.println(myString);
		System.out.println(" to lowercase : " + myString.toLowerCase());
		System.out.println(" trim : " + myString.trim());
		
		System.out.println(" replace : " + myString.replace("Java", "C++"));
		System.out.println(" replace first : " + myString.replaceFirst("Java", "C++"));
		System.out.println(" replace all: " + myString.replaceAll("Ja..", "C++"));
		
		String[] arrStr = myString.split("oriented");
		for(String arrel : arrStr) {
			System.out.println(arrel);
		}
	}

}
