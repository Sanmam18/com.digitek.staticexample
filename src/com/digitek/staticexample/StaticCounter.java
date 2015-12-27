package com.digitek.staticexample;

public class StaticCounter {
   
	int counter = 2;
	
	static int StaticCounter = 4;
	static String value = "hello";
	
	 StaticCounter(){
		 counter++;
		 StaticCounter++;
		 
	 }
	 
	
	
	
	
	
	
	public static void main(String[] args) {
		StaticCounter sc = new StaticCounter();
		System.out.println("counter value"+ sc. counter);
		System.out.println("static counter"+ StaticCounter);
		StaticCounter = 10;
		
		StaticCounter sc2 = new StaticCounter();
		System.out.println("counter value"+ sc2. counter);
		System.out.println("static counter"+ StaticCounter);
		StaticCounter = 10;
		
		StaticCounter sc3 = new StaticCounter();
		System.out.println("counter value"+ sc3. counter);
		System.out.println("static counter"+ StaticCounter);
		StaticCounter = 10;
		
		String value1 = value;
		
	}

}
