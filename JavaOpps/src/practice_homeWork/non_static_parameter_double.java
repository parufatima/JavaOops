package practice_homeWork;

public class non_static_parameter_double {

	public static void main(String[] args) {
		//  create Non-Static Parameter Method with double

		non_static_parameter_double total= new non_static_parameter_double();
		total.addition(38.70, 55.90, 88.50);
	}

	public void addition(double a, double b,double c) {
		
		double result= a+b+c;
		System.out.println("Total number is :" +result);
	}
	
}
