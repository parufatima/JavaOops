package practice;

public class parameterMathod_string {

	public static void main(String[] args) {
		
		parameterMathod_string name = new parameterMathod_string();//creating object
		
		name.delemont( "Fatima", " Johora");  //call method
		
		parameterMathod_string number = new parameterMathod_string();//create object
		
		number.multiplication(5, 10, 20); //call method by object name
		parameterMathod_string total = new parameterMathod_string();
		total.addition(567, 123, 600);

	}	
	//non parameterise method
	public void delemont(String firstName , String lastName) 
	{
		String fullname = firstName + lastName ;
		System.out.println("My name is " +fullname);
	}
   //parameter method with int data type
	
	public void multiplication(int a, int b ,int c) {
		
		int result = a*b*c;
		System.out.println("Multiplication of a,b,c is : " +result);
		
	}
	//return type parameter method with int data type 
	
	public int addition(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println("Summation of x,y,x is :"+ sum);
		return sum;
		
	}
}
