package Interface_Demo;

public  class interface_abs implements Interface_ex
{
  
	public void myMumber() {
		 int a= 500;
		   int b= 3958;
		   int c= 876; 
		System.out.println(a+b+c);
	}
	 public void myName()
	 {
		 String fName ="Amreen";
		   String lName =" kamal";
		 System.out.println(fName + lName);
	 }
	
}

 class Main{

	public static void main(String[] args) {
		
		interface_abs interfaceAbs = new interface_abs();
		
		interfaceAbs.myMumber();
		
		//interface_abs_child name = new interface_abs_child();
		
		interfaceAbs.myName();

	}

}
