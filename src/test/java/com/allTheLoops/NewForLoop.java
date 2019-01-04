package com.allTheLoops;

public class NewForLoop {

	public void getGrades(int examScore) {

		char grade;
		if (examScore >= 95) {
			grade = 'A';
		} else if (examScore >= 80 && examScore <= 90) {
			grade = 'B';

		} else if (examScore >= 70 && examScore <= 80) {
			grade = 'C';
		} else if (examScore >= 65 && examScore <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is " + grade);

	}

	public static void getTernary(int i, int j) {

		String a = (i <= 20) ? "I saved money " : " I spent money ";
		System.out.println("String a " + a);


		String b1;
		if (j < 20) {
			b1 = "I saved money";
		} else {
			b1 = "I spent money";
		}
		System.out.println("String b1 " +b1);

	}

	public static void main(String[] args) {
		NewForLoop obj = new NewForLoop();
		obj.getGrades(30);
		getTernary(25, 25);

	}

}
