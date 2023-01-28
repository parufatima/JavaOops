package Oop_practice;

import java.util.ArrayList;

public class Array_list_demo {

	public static void main(String[] args) {
		 
	/*	int[] taka = {200,400,80000,900};
		
		
		System.out.println(taka.length);
		System.out.println(taka[3]);
		
		
		for(int i= 0; i< taka.length; i++) {
			System.out.println(i);
		}
		
		String [] kids = {"Safwan","Amreen","Arfaana","Nuri","Ariba"};
		System.out.println(kids.length);
		System.out.println(kids[2]);
		
		for(int j=0; j<kids.length; j++) {
			System.out.println(kids[j]);
		}
		for(int j=0; j<kids.length; j=j+2) {
			System.out.println(kids[j]);  
		}
		for(String a: kids) {         // for-each loop
			System.out.println(a);
			
		}*/
		
		ArrayList  studentName= new ArrayList();
		
		studentName.add("Lily");
		studentName.add("Shama");
		studentName.add("Nafiza");
		studentName.add("Lamiya");
		studentName.add("Nusrat");
		studentName.add("Ayra");
		studentName.add("Sabiha");
		studentName.add(2344);
		studentName.add(567);
		
		System.out.println(studentName.size());
		
		System.out.println(studentName.get(3));
		
		System.out.println(studentName);
		
		for (int i=1;i<studentName.size();i=i+2 ) {   // print odd number
			
			System.out.println(studentName.get(i));
		}
		
		
		
		
		

	}

	

}
