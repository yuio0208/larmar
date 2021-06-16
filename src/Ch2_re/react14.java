package Ch2_re;

import java.util.Scanner;

public class react14 {

	public static void main123124(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int a; 
		a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {   // i가 a(입력된 숫자)보다 커지면 정지 
			for (int j = 1; j <= i-1; j++) {  // int j의 초기값은 1로부터 i-1까지 공백을 출력
				System.out.print(" ");
				} for (int j = 2*a-1; j >= 2*i-1; j--) {  // 초기값을 2*a-1로 설정하고 2*i-1보다 큰 범위로 설정 
					System.out.print("*");  // 별출력 
				}
				System.out.println();
		}	
	}
}
