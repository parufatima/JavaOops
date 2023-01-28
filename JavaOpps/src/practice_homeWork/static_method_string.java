package practice_homeWork;

public class static_method_string {

	public static void main(String[] args) {
		//  create Static Method with String

		static_method_string.student();
		
	}

	public static void student() {
		
		String firstName ="Henry ";
		String lastName ="Jackobs";
		String fullName= firstName + lastName;
		System.out.println("Name of the student is : "+fullName);
	}
}
