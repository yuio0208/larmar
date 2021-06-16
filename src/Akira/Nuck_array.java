package Akira;

public class Nuck_array {

	public static void main658(String[] args) {
		// TODO Auto-generated method stub

		
		int [] kopo05_lmd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 달마다 일이 불규칙하니 마지막 날짜만 리스트로 배열에 넣어준다
		// 배열은 0번부터 시작 
		
		
		for (int kopo05_i = 1; kopo05_i < 13; kopo05_i++) {   // 월 설정
			System.out.printf(" %d월 =>", kopo05_i);            // 월의 형식 설정 
			for (int kopo05_j = 1; kopo05_j <32; kopo05_j++) {   // 일 설정 
				System.out.printf("%d", kopo05_j);             // 일 형식 설정 
				
				if(kopo05_lmd[kopo05_i-1] == kopo05_j) break;    // kopo05_lmd의 배열안에서 kopo05_i-1 시작, 배열은 0부터 시작이기에 kopo05_i는 1부터 시작하게 설정해줬으니 -1을 해줘야 맞다 
				
				System.out.printf(",");  // , 설정 
			}
			System.out.printf("\n");
		}
		
		
		
		
	}

}
