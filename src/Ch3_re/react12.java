package Ch3_re;

import java.util.Scanner;

public class react12 {

	public static void main14(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int menu; 
		while (true) {      // while������ �޴��� �ݺ��ؼ� ������ ����
			System.out.println("#Temperature Converter");
			System.out.println("1. Celsius --> Fahrenheit");
			System.out.println("2. Fahrenheit --> Celsius");
			menu = sc.nextInt();
			
			double n; 
			n = sc.nextDouble(); 
			
			if (menu ==1) { // �޴� 1 ���ý� 
				n = n * 9 / 5 + 32;  // ������ ȭ���� 
				System.out.println(n + "");
			} else if (menu ==2) {   //�޴� 2 ���ý� 
				n = (n -32) * 5 /9;       // ȭ���� ������   
				System.out.println(n + "");
			} else
				break;  // ��µǸ� while����  �������� 
		
		}
		
	}

}
