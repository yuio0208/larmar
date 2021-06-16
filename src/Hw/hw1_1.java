package Hw;

import java.util.Scanner;

public class hw1_1 {

	public static void main666(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f0 = 0;  // f0 초기화
		int f1 = 1;  // f1 초기화
		int sum;
		
		if (n >2) {
			System.out.println(f0+" ");
			System.out.println(f1+" ");
			for (int i = 0; i <= n-3; i++); {
			sum = f0+f1;
			System.out.println(sum+" ");
			f0 = f1; //  put f1 in f0 
			f1 = sum;   // put sum in f1
			}
		} else 
			System.out.printf(" ");
		
	}

}
