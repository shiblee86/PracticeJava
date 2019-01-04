package com.otherpractice;

public class NewReturnType {
	
	public int getReturnWithVoid() {
		 int x = 10;
		 return 2;
		 }
		 
		 public int getReturnWithVoid2() {
		 int x = 10;
		 return x;
		 }
		 
		 public int getReturnWithVoid3() {
		 int x = 10;
		 return x;
		 }
		 
		 public int getReturnWithVoid4() {
		 int x = 10;
		 return 0;
		 }
		 
		 public int getReturnWithVoid5() {
		 int x = 10;
		 return 1;
		 }
		 
		 public static void main(String[] args) {
			 NewReturnType obj = new NewReturnType();
			 obj.getReturnWithVoid();
			 System.out.println(obj.getReturnWithVoid());
			 System.out.println(obj.getReturnWithVoid2());
		 }

}
