package practice;

public class Practice_sep11 {

	public static void main(String[] args) {
		Practice_sep11 name = new Practice_sep11();
		
		name.studentName();
		name.fullName1();
		
	}
	public String studentName(){
		
		String firstName = "Amreen";
		String lastName = " Kamal";
		String fullName = firstName + lastName ;
		 
		System.out.println("My full name :"+ fullName);
		return fullName;
		
		
	}
	
	public static void fullName1() {
		String x= "arfaana";
		String y = " Kamal";
		String z = x+ y;
		System.out.println("full name : " +z );
	}
	
	
	
	
	
	
	
	
	

}
