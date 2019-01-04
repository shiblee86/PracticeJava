package com.otherpractice;


/*
 * ! not && and || or ^ exclusive or
 * 
 * All these operators work well with boolean value
 * 
 * if we write !true --> then result becomes false if we write !false --> then
 * resuls becomes false
 */


public class LogicalOperators {
	
	
/* ! NOT */
	public static void main(String[] args) {

		Boolean human = true;
		if (!human) {
			System.out.print("I am not a human");
		}
		System.out.println("I am not human");
		
		int targetSalesAmount = 5000;
		int actualSoldAmount = 1000;
		if(actualSoldAmount != targetSalesAmount)
		{
			boolean salesMet = false;
			System.out.println(salesMet);
		}else {
			boolean salesMet = true;
		System.out.println(salesMet);}
		
		
		/*The assigment Operators
		 * =  Assigns values from right side operands to left side operand. C = A + B will assign value of A + B into C
		 * += Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand. C += A is equivalent to C = C + A
		 * -= Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand. C -= A is equivalent to C = C – A 
		 * *= Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand. C *= A is equivalent to C = C * A
		 * /= Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand. C /= A is equivalent to C = C / A
		 * */
		
		int a = 10;
		int b = 2;
		a += b;
		System.out.println(a);

		int c = 1;
		c += 1;
		System.out.println(c);
		
		float x = 0.0f;
		x += 1.1f;
		x = x+ 1.1f;
		
		System.out.println(x);
		
		
		int d = 10;
		int e = 2;
		d -= e;
		System.out.println(d);

		int f = 1;
		f -= 1;
		System.out.println(f);
		
		float g = 0.0f;
		g -= 1.1f;
		g = g- 1.1f;
		
		System.out.println(g);

	}





}
