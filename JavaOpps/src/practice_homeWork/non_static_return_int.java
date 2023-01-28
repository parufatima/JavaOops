package practice_homeWork;

public class non_static_return_int {

	public static void main(String[] args) {
		// First Class create Non-Static Return Type Method with int
		non_static_return_int summetion = new non_static_return_int();
		
		summetion.addition();
		

	}
	
	public int addition() {
		
		int a= 50;
		int b= 30;
		int c= 60; 
		int result = a+b+c;
		System.out.println(result);
		return result;
		
		
	}

}
