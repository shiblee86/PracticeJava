package com.practice;

class CodeMagnet {

	public static void main(String[] args) {

		int x = 3;
		while (x > 0) {

			if (x > 2) {
				System.out.println("Value of x is " + x);
				System.out.println("a");
			}

			x = x - 1;
			System.out.println("Value of x is " + x);
			System.out.println("-");

			if (x == 2) {
				System.out.println("Value of x is " + x);
				System.out.println("b c");

			}

			if (x == 1) {
				System.out.println("Value of x is " + x);
				System.out.println("d");
				x = x - 1;
				//System.out.println("Value of x at the bottom is " + x);
			}
		}

	}

}
