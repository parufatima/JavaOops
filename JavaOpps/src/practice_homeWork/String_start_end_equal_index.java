package practice_homeWork;

public class String_start_end_equal_index {

	public static void main(String[] args) {
		// Start with
		
		String studentName = "Nomera Hoque";
		
		boolean result1 = studentName.startsWith( "No");
		System.out.println(result1);   // result true
		
		// End with
		
		boolean result2 = studentName.endsWith("Hoque");
		
		System.out.println(result2); // result true
		
		//Equals
		
		String studentName1 = "Mysha Hoque";
		
		boolean result3 = studentName.equals(studentName1);
		boolean result4 = studentName1.equals(studentName1);
		System.out.println(result3);      //result false
		
		System.out.println(result4);      //result true
		
		//Equals ignore Case;
		
		String studentName2 = "mysha hoque";
		
		boolean result5 = studentName1.equalsIgnoreCase(studentName2);
		System.out.println(result5);      //result true
		System.out.println(studentName1.equalsIgnoreCase(studentName));      //result false
		
		// CharAt Method   ; index
		
		char result6 = studentName2.charAt(3);
		System.out.println(result6);      //result h
		
	}

}
