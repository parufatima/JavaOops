package practice_homeWork;

public class Array_practice {

	public static void main(String[] args) {
		
		String [] studentName = {"Lily","Amazon","Pentagon","Mysha"};
		
		System.out.println(studentName.length);  //by using length method we get the size of an array
		
		System.out.println(studentName[2]);
	
		
		for(int i=0; i<studentName.length; i++) {   //for loop
			System.out.println(studentName[i]);
		}
		for(int i=0; i<studentName.length-3; i++) {   //for loop
			System.out.println(studentName[i]);
		}
		
		
       for(String i:studentName ) {    //for-each loop
    	   System.out.println(i);
       }
      
	}

}
