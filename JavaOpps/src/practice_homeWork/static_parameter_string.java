package practice_homeWork;

public class static_parameter_string {

	public static void main(String[] args) {
		// s create Static Parameter Method with String


		static_parameter_string.student("Maysha"," Maliha");
	}

	public static void student(String firstName, String lastName) {
		
		String fullName= firstName+ lastName;
		System.out.println("The name of the student is : "+fullName);
	}
}
