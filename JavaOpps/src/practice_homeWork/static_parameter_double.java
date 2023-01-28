package practice_homeWork;

public class static_parameter_double {

	public static void main(String[] args) {
		//  create Static Parameter Method with double

		static_parameter_double.multiplication(30.50,70.60, 55.50);
	}

	public static void multiplication(double a,double b,double c) {
		
		double result = a*b*c;
		System.out.println("Multiplication of the number is : "+result);
	}
}
