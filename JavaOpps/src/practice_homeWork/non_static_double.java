package practice_homeWork;

public class non_static_double {

	public static void main(String[] args) {
		// create Non-Static Method with double

		non_static_double total= new non_static_double();
		total.addition();
	}

	public void addition() {
		
		double a= 498.890;
		double b = 234.340;
		double c= a+b;
		System.out.println("total number is : "+c);
	}
}
