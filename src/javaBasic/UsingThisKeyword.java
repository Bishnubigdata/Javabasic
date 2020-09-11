package classwork.oops;

public class UsingThisKeyword {
	
	int length ;
	int width ;
	
	UsingThisKeyword(int length, int width){
		this(length);
		System.out.println("hello");
		this.width = width;
		
	}
	
	UsingThisKeyword(){
		length = 1;
		width = 5;
	}
	
	UsingThisKeyword(int length){
		this.length = length;
	}

	public static void main(String[] args) {
		UsingThisKeyword obj = new UsingThisKeyword(10, 20);
		System.out.println(obj.length);
		System.out.println(obj.width);
		
		UsingThisKeyword obj2 = new UsingThisKeyword(40);
		System.out.println(obj2.length);
		System.out.println(obj2.width);
		
		UsingThisKeyword obj3 = new UsingThisKeyword();
		System.out.println(obj3.length);
		System.out.println(obj3.width);
	}

}
