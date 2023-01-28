package practice_homeWork;

public class non_static_int {

	public static void main(String[] args) {
		//  create Non-Static Method with int

		non_static_int total = new non_static_int();
		total.addition();
	}

	public void addition() {
		int a=599;
		int b= 699;
		int c=799;
		int result = a+b+c;
		System.out.println("Total number is : "+result);
	}
}
