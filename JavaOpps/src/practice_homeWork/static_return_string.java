package practice_homeWork;

public class static_return_string {

	public static void main(String[] args) {
		//  create Static Return Type Method with String

       
		static_return_string.person();
	}

	public static String person() {
		
		String firstName= "Aysha  ";
		String lastName ="Haque";
		String fullName = firstName+ lastName;
		System.out.println("person name is  : "+fullName);
		
		return fullName;
		
	}
	
}
