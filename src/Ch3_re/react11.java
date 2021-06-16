package Ch3_re;

import java.util.Scanner;

public class react11 {

	public static void main745(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int menu;  
		while(true) {
			System.out.println(" ");
			System.out.println("#Current Converter");
			System.out.println("1. South Korean won -> United States Dollar");
			System.out.println("2. United States Dollar -> South Korean won");
			System.out.println("3.");   // menu설정
			menu = sc.nextInt();   // 처음 입력값으로 환전할 돈이 달라짐 
			
			double n; 
			n = sc.nextDouble(); // 소수가 나올 수 있어서 
			
			if (menu ==1) {     // 1을 입력시 한화에서 미화로 
				n = n  / 1100; 
				System.out.printf("%.2f", n);   // 미화를 소수점 2번째까지만 출력 
			} else if (menu ==2) {    // 2를 입력시 미화에서 한화로 
				n = 1100 / n;       
				System.out.printf("%.2f", n);  // 한화를 소수점 2번째까지만 출력 
			} else
				break;  
		
		}
		
	}

}