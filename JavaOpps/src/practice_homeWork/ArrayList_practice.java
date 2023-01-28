package practice_homeWork;

import java.util.ArrayList;

public class ArrayList_practice {

	public static void main(String[] args) {
		//
  ArrayList<String> student = new ArrayList<String>(); //generic arrayList
  
  //ArrayList student = new ArrayList();    Normal arrayList 
     
      student.add("Amreen");  //adding the value in arrayList 
      student.add("Arfaana");
      student.add("Safwan");
      student.add("Nuri");
      student.add("Noman");
      student.add("Nayeem");
       
      System.out.println(student);   // print all value
      System.out.println(student.get(2));
      System.out.println(student.size());
      
      
   /*   for (int i=1; i<student.size(); i=i+2) { //all even number
    	  
    	  System.out.println(student.get(i));}
      
    	  for (int i=0; i<student.size(); i++) {  // print all value
    		  System.out.println(student.get(i));
      }
    	  for (int i=0; i<student.size(); i=i+2) {  // print all odd value 
    		  System.out.println(student.get(i));
    	  }*/
      
	    for (String s: student) {
	    	System.out.println(s);
	    }
	}

}    //.add
     //.get
     //.size
     //.remove
     //.clear
