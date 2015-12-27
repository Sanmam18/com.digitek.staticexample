package com.digitek.staticexample;

public class StaticBlock {
	 static int value;
	 static String world;
	 
	 static {
		 System.out.println("My First Block Statement");
		 value=10;
		 world= "hi";
	 }
	 static {
		 System.out.println("My Second Block Statement");
		 value=10;
		 world= "hi";
	 }
	public static void test(){
		System.out.println("My test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          test();
	}

}
