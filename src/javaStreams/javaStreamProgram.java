package javaStreams;

import java.util.ArrayList;

public class javaStreamProgram {

	public static void main(String[] args) {
		
		
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
	
	
}
