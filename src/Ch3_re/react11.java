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
			System.out.println("3.");   // menu����
			menu = sc.nextInt();   // ó�� �Է°����� ȯ���� ���� �޶��� 
			
			double n; 
			n = sc.nextDouble(); // �Ҽ��� ���� �� �־ 
			
			if (menu ==1) {     // 1�� �Է½� ��ȭ���� ��ȭ�� 
				n = n  / 1100; 
				System.out.printf("%.2f", n);   // ��ȭ�� �Ҽ��� 2��°������ ��� 
			} else if (menu ==2) {    // 2�� �Է½� ��ȭ���� ��ȭ�� 
				n = 1100 / n;       
				System.out.printf("%.2f", n);  // ��ȭ�� �Ҽ��� 2��°������ ��� 
			} else
				break;  
		
		}
		
	}

}