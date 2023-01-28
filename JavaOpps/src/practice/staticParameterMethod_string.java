package practice;

public class staticParameterMethod_string {

	public static void main(String[] args) {
		
		staticParameterMethod_string.student("Nomera" , " Hoque");
		staticParameterMethod_string.multiplication(50, 30, 90);
		staticParameterMethod_string.person();
		staticParameterMethod_string.addition(500,489,700);
		
	}
	
	
	public static void student(String firstName , String lastName) {  //static parameterise method with  String data type.
	
		     String fullname = firstName + lastName ;
		     
		     System.out.println( "Student full name is : " + fullname);
	}
	
	// static parameter method with int data type
	
	public static void multiplication(int a, int b, int c) {
	
	    int result = a*b*c;
	    
	    System.out.println(" Multiplication of a,b,c, is : " +result);
	    }
	 //static return method non parameter type  (Return type only work on int ,double, string)
	    public static  String person() {
	    	String firstName = "Amreen";
	    	String lastName = " Kamal";
	    	String fullName = firstName + lastName;
	    	System.out.println("person fullName :  " +fullName);
	    	return fullName;
	    }
	    //static return method  parameter type
	     
	   public static int addition(int x, int y,int z) {
		   
		   int sum = x+y+z;
		   System.out.println("Summetion of x,y,z,is : " +sum);
		   return sum;
	   }
	    
	}
	 // Method = Method is a block of code which only runs when it is call. 
	// static = do not need to create an object . Can call by method name only
      // is a very powerful key given by java.
	//return type = return a result (only work on int , double, String)
	//void = no return type
	// parameter = include data type  and variable name in parenthesis
	// non parameter = hard code variable name and values
	


