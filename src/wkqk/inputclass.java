package scr;

import java.util.Scanner;

public class inputclass {
		private Scanner sc = null;  // sc�� ���� 
		
		public inputclass() {          
			sc = new Scanner(System.in);       // sc�� ��ü �ο� 
			
		}
		
		public int inputFromConsoleWon() {      //  inputFromConsoleWon �Լ� ����  �� ȯ������ 
			int moneyKOR;
			System.out.println("��ȭ �Է� :");       
			moneyKOR = sc.nextInt();         // �Է��� �ݾ��� moneyKOR�� 
			return moneyKOR;                // moneyKOR��ȯ 
		} 
		
		public int inputFromConsoleType() {   //inputFromConsoleType �Լ� ���� ���� �� ȯ������ 
		int inputChangeType;
		System.out.println("Which money do you want?\n"
							+ "1.USD\n\n"  
							+ "2.EUR\n\n"
							+ "3.JPY\n\n"               // ��¹� ���� 
							+ "4.Exit");
		inputChangeType = sc.nextInt();     //�Է��� ���� ������ inputChangeType�� 
		return inputChangeType;
	
	}
}
