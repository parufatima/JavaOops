package practice_homeWork;

public class non_static_string {

	public static void main(String[] args) {
		// create Non-Static Method with String

		non_static_string information = new non_static_string ();
		information.student();

	}

	public void student() {
		
		String firstName= "Abdul";
		String lastName = " Houqe";
		String fullName= firstName+ lastName;
		System.out.println("The name of the student :"+fullName);
	}
}
