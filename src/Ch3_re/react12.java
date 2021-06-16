package Ch3_re;

import java.util.Scanner;

public class react12 {

	public static void main14(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int menu; 
		while (true) {      // while문으로 메뉴가 반복해서 나오게 설정
			System.out.println("#Temperature Converter");
			System.out.println("1. Celsius --> Fahrenheit");
			System.out.println("2. Fahrenheit --> Celsius");
			menu = sc.nextInt();
			
			double n; 
			n = sc.nextDouble(); 
			
			if (menu ==1) { // 메뉴 1 선택시 
				n = n * 9 / 5 + 32;  // 섭씨를 화씨로 
				System.out.println(n + "");
			} else if (menu ==2) {   //메뉴 2 선택시 
				n = (n -32) * 5 /9;       // 화씨를 섭씨로   
				System.out.println(n + "");
			} else
				break;  // 출력되면 while문을  빠져나옴 
		
		}
		
	}

}
