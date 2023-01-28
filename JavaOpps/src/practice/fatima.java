package practice;

public class fatima {

	public static void main(String[] args) {
		
		fatima anything = new fatima();
		anything.amreen();
		
		fatima total = new fatima();
		
		total.addition(456, 249, 2998);

	}
  public void amreen() {
    
	  String firstName = "Arfaana";
	  String lastName = " Kamal";
	  String fullName = firstName + lastName  ;
	  System.out.println(" My daughter name is " +  fullName);
  }
	  //non-parameter methods
	  
	  public void addition(int a ,int b, int c) {  // parameter method 
	   int result = a+b+b+c;
	   System.out.println("Summation of a,b,c is : " +result);
  }
	
}
