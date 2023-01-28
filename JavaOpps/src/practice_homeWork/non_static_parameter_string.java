package practice_homeWork;

public class non_static_parameter_string {

	public static void main(String[] args) {
		// create Non-Static Parameter Method with String

		non_static_parameter_string student= new non_static_parameter_string();
		student.information("Amreen", " Kamal");
		
	}

	public void information(String firstName ,String lastName) {
		   
		String fullName = firstName +lastName;
		System.out.println("Student information name : " +fullName);
	}
	  
}
