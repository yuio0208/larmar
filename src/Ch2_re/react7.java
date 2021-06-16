package Ch2_re;

import java.util.Scanner;

public class react7 {

	public static void main44(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		
		
		if (a < 10) {     //a는 10미만으로 해서 구단까지 나오게
			for (int i =2; i<10; i++) {  //i도 2부터 시작해서 9까지 +1씩 올라가게 설정 
				System.out.println(a + "X" + i + "=" + (a-4)*i );  // 원래 구구단과 결과가 다르게 나와서 결과를 맞춰줌 
			
				
			}	
		}
	}
}
