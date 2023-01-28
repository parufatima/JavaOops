package practice;

public class string_class_ex {

	public static void main(String[] args) {
		
		 //startWith
		
		String name = "amreen"; 
		    
		// boolean n=  name.startsWith("a");  // print true result
		 boolean n=  name.startsWith("p");  //print false result

		 
		 System.out.println(n);
		 
		 //endWith
		 
		 String flower ="rose"; 
		 
		boolean f =       flower.endsWith("e");
		boolean g =       flower.endsWith("o");
		
		System.out.println(f); //print true result
		
		 System.out.println(g);  // print false result	
		 
		 //equals
		 
		 String m="melon";
		 String o="orange";
		boolean result= m.equals("melon");
		boolean result2= o.equals("melon");
		
		System.out.println(result);   //print true
		
		System.out.println(result2);  //print false

		//equalsIgnoreCase
		
		String firstName = "FATIMA";
		String firstName1 = "Fatima";
		String firstName2= "java";
	boolean output= firstName.equalsIgnoreCase(firstName1);
	boolean output1= firstName.equalsIgnoreCase(firstName2);
	System.out.println(output);    //print true result
	System.out.println(output1);    //print false result
	
	//CharAt
	   
	String courseName ="javaSelenium";
	  
	    char indexNumber= courseName.charAt(4);
	    System.out.println(indexNumber);    //print alphabet S

		          
	}

}
