package scr;

import java.util.Scanner;

public class inputclass {
		private Scanner sc = null;  // sc를 선언 
		
		public inputclass() {          
			sc = new Scanner(System.in);       // sc에 객체 부여 
			
		}
		
		public int inputFromConsoleWon() {      //  inputFromConsoleWon 함수 설정  얼마 환전할지 
			int moneyKOR;
			System.out.println("원화 입력 :");       
			moneyKOR = sc.nextInt();         // 입력한 금액을 moneyKOR에 
			return moneyKOR;                // moneyKOR반환 
		} 
		
		public int inputFromConsoleType() {   //inputFromConsoleType 함수 설정 무슨 돈 환전할지 
		int inputChangeType;
		System.out.println("Which money do you want?\n"
							+ "1.USD\n\n"  
							+ "2.EUR\n\n"
							+ "3.JPY\n\n"               // 출력문 설정 
							+ "4.Exit");
		inputChangeType = sc.nextInt();     //입력한 돈의 종류를 inputChangeType에 
		return inputChangeType;
	
	}
}
