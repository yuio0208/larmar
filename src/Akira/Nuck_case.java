package Akira;

public class Nuck_case {

	public static void main654(String[] args) {
		// TODO Auto-generated method stub

		
		for (int kopo05_i = 1; kopo05_i < 13; kopo05_i++) {  // 12월달까지 표현 
			System.out.printf("%d월 =>", kopo05_i);  // 출력문 설정
			LOOP:for (int kopo05_j = 1; kopo05_j < 32; kopo05_j++) {   // 최대 31일까지 반복문 돌게 설정
				System.out.printf("%d," , kopo05_j);  // 출력문 설정
				
				switch(kopo05_i) {  
				case 4:case 6:case 9:case 7:case 11:  // 4월 6월 7월 9월 11월은 
					if (kopo05_j == 30) break LOOP;  // 30일에서 멈추게 설정 
					break;  
				case 2:
					if (kopo05_j == 28) break LOOP;  // 2월은 28일에 멈추게 설정 
					break;
				}
			}
			System.out.println("\n");
		}
		
		
		
	}

}
