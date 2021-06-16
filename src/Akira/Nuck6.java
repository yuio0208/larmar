package Akira;

public class Nuck6 {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		String [] kopo05_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; //  배열로 kopo05_units에 한글 넣음 
		for (int kopo05_i = 0; kopo05_i < 101; kopo05_i++ ) {    // 1부터 100까지만 표현  
			
			if(kopo05_i >= 0 && kopo05_i < 10) {  // 1부터 9까지는 일의 자리니까 
				System.out.printf("일의 자리 : %s\n",kopo05_units[kopo05_i]);  // 배열로 0부터 9까지는 배열 꺼내서 그대로 출력 
			}
			else if (kopo05_i >= 10 && kopo05_i < 100) {  // 10부터 99까지는 
				int kopo05_i10, kopo05_i0;           // 우선 인수 설정 
				kopo05_i10 = kopo05_i/10;          //   kopo05_i10은 kopo05_i에 10을 나눠준 나머지 
				kopo05_i0 = kopo05_i%10;         // kopo05_i0은 kopo05_i에 10을 나눠준 몫, 여기서 몫은 10의 자리 수를 뜻함 
				if (kopo05_i0==0) {         // kopo05_i0가 0이라면 10의자리수란 뜻
					System.out.printf("십의 자리 : %s십\n", kopo05_units[kopo05_i10]);  // 10의 자리 수는 kopo05_i10으로 구한 몫으로 %s로 인해 그대로 출력되고 kopo5_units배열에 글자를 십을 붙여서 구함 
				} else { 
					System.out.printf("십의 자리 : %s십%s\n", kopo05_units[kopo05_i10],kopo05_units[kopo05_i0]);  // 만약 10의 배수가 아니라면 kopo05_i10으로 구한 몫을 %s로 그대로 kopo05_units배열에 있는대로 출력하고 
					// 십을 붙힌뒤 kopo05_i0으로 구한 나머지들은 kopo05_units배열에 있는대로 출력 
				}
				
			}
			else System.out.printf("==>%d\n", kopo05_i);  // 맥스값 100은 그대로 출력 
		}
		
	}

}
