package practice_homeWork;

public class non_static_return_double {

	public static void main(String[] args) {
		//  create Non-Static Return Type Method with double
               
		non_static_return_double sum= new non_static_return_double();
		
		sum.addition();
	 
		
	}
	
	  public double  addition()
	  {
		 double x= 36470.5768;
		 double y =23487.4560;
		 
		 double z= x+y;
		 System.out.println("Addition of the number is : "+z);
		  return z;
	  }

}
