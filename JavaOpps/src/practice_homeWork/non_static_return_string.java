package practice_homeWork;

public class non_static_return_string {

	public static void main(String[] args) {
		//  create Non-Static Return Type Method with String
      
		non_static_return_string name = new non_static_return_string();
		
		name.studentName();
		
		
	}
	 
	public String  studentName()
	{
		String firstName ="Safwan";
		String lastName= " Kamal";
		String fullName = firstName + lastName;
		System.out.println(" Student name :" +fullName);
		return fullName;
	}

}
