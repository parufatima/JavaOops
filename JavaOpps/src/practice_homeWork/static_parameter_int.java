package practice_homeWork;

public class static_parameter_int {

	public static void main(String[] args) {
		//create Static Parameter Method with int

		static_parameter_int.addition(40, 500, 300);
	}

	public static void addition(int a, int b, int c) {
		
		int result = a+b+c;
		System.out.println("Total number is : "+result);
	}
}
