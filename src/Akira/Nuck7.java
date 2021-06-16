package Akira;

public class Nuck7 {

	public static void main123(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_weekday = 5; // 초기값 설정 
		int[] kopo05_end = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    // 각각 달의 마지막 날을 배열로 kopo05_end에 입력 
		
		for (int kopo05_Mon = 0; kopo05_Mon < 12; kopo05_Mon++ ) {    // 달을 설정  
			System.out.printf("\n\n                       %d월\n", kopo05_Mon + 1);   // 0번부터 시작이어서 +1을 해준다 
			System.out.printf("===================================================\n");    // head 설정 
			System.out.printf(" 일\t 월\t 화\t 수\t 목\t 금\t 토 \n");    // 요일 설정 
			for (int kopo05_i = 1; kopo05_i <= kopo05_end[kopo05_Mon] + kopo05_weekday; kopo05_i++) {    // 배열에 넣어준 마지막날을 달별로 출력해야 한다 근데 + kopo05_weekday를 해주는 이유는 
				if (kopo05_i <= kopo05_weekday) {       //  if문에서 1부터 5까지는 탭을 해주기 때문에 일자가 부족해져서 미리 더해두는 것 
				System.out.printf(" \t");   
				
				
			} else {
				System.out.printf("%3d\t", kopo05_i - kopo05_weekday);   // kopo05_i - kopo05_weekday으로  kopo05_i의 6부터 시작해서 kopo05_weekday를 빼주기 때문에 일자는 1일부터 시작하게 된다 
			
				if (kopo05_i % 7 == 0) {  // 그리고 7로 나눈 나머지가 0일 경우엔 
				System.out.println();   // 아래 칸으로 가게 줄을 띄워 준다 
	
				
				}
			}
		}
		kopo05_weekday = (kopo05_weekday + (kopo05_end[kopo05_Mon] % 7)) % 7;   // for문 안에서 kopo05_end[kopo05_Mon]을 7로 나눈 나머지를 kopo05_weekday와 더한 뒤 다시 7로 나눈 값을 kopo05_weekday에 넣어준다 
		// 그 값이 다음 kopo05_weekday가 되어 달 별로 일자가 이어지게 설정이 된다   
	}
}

}
