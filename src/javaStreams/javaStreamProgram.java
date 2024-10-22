package javaStreams;

import java.util.ArrayList;

public class javaStreamProgram {

	public static void main(String[] args) {
		
		javaStreamOptimizedCode();
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Danish");
		names.add("Dikshya");
		names.add("Razdan");
		names.add("Faruki");
		names.add("Duryodhan");
		int count =0;
		
		for(int i=0;i<names.size();i++) {
			String actual =names.get(i);
			
			if(actual.startsWith("D")) {
				count = count+1;
			}
			
		}
		System.out.println(count);	
	}
	
	
	public static void javaStreamOptimizedCode() {
		
	ArrayList<String> names =new ArrayList<String>();
	names.add("Bisakha");
	names.add("Bani");
	names.add("Roshmi");
	names.add("Bonita");
	names.add("Archana");
	names.add("Binashree");
	
	//Lets simplyfy the code using streams method
	//First we need to add stream method to the object
	//we will be using lambda expression for example (->)
//	Integer count =(int) names.stream().filter(t->t.startsWith("B")).count();
	Long count = names.stream().filter(t->t.startsWith("B")).count();	
	System.out.println(count);	
// Finally we got the count in one single line
	}
	
	
	
	
	
	
	
}
