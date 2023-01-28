package practice_homeWork;

public class static_return_int {

	public static void main(String[] args) {
		// create Static Return Type Method with int
        
		static_return_int.multiplication();

	}
	
	public static int multiplication() {
		
		int a= 500;
		int b= 30;
		int c= 200;
		int result= a*b*c;
		
		System.out.println("Multiplication of the number is : "+result);
		return result;
		
	}

}

