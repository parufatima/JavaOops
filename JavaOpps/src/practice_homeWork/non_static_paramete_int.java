package practice_homeWork;

public class non_static_paramete_int {

	public static void main(String[] args) {
		// create Non-Static Parameter Method with int

		non_static_paramete_int sum= new non_static_paramete_int();
		sum.addition(600,9000, 8000);

	}

	public void addition(int a, int b, int c){
		
		int result = a+b+c;
		System.out.println("Sum of the number : " +result);
	}
	
}
