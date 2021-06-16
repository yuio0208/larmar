package Hw;

import java.util.Scanner;

public class hw1_2 {

	public static void main646(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  // input number of subject
		double[] subject = new double[num];
		String[] grade = new String[num];
		double[] score = new double[num];
		double sum = 0, subsum = 0, GPA = 0;
		
		for (int i = 0; i < num; i++) {
			subject[i] = sc.nextDouble();   // enter score of the subject
		} 
			for (int i = 0; i < num; i++) {   // enter grade
				grade[i] = sc.next();
				
				if(grade[i].compareTo("A+") == 0) {   // convert grade to score
					score[i] = 4.5;
				} else if(grade[i].equals("A0") == true) {
					score[i] = 4.0;
				} else if(grade[i].equals("B+") == true) {
					score[i] = 3.5;
				} else if(grade[i].equals("B0") == true) {
					score[i] = 3.0;
				} else if(grade[i].equals("C+") == true) {
					score[i] = 2.5;
				} else if(grade[i].equals("C0") == true) {
					score[i] = 2.0;
				} else if(grade[i].equals("F") == true) {
					score[i] = 0;
				}
				sum += subject[i]*score[i];   // add sum of grade
				subsum += subject[i];   // add subject
			}
			GPA = sum / subsum;    // calculate GPA
			System.out.println(GPA);
	}

}
