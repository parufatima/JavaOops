package Interface_Demo;

interface A 
{
	 int a = 50;  //in interface variable static and final by default 
	 void display();  // method by default abstract .
}
 interface B
 {
	int b = 60;
	int b1= 70;
	void show ();
	
 }
  
 public class MultipleInheritance  implements A, B
 {
	public void display()
	 {
		 System.out.println(a);
	 }
	
 public	void show() {
		System.out.println(b+b1);
	}
 

	public static void main(String[] args) {
		
		 MultipleInheritance myint = new  MultipleInheritance();
		 
		 myint.display();
		 
		 myint.show();
	}

}
 
