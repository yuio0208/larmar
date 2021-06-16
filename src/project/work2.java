package project;

public class work2 {  // class 선언

	public static void main78(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int kopo05_MyWon = 1000000;        //환전할 금액을 kopo05_MyWon로 변수 설정 
		double kopo05_MoneyEx=1238.21;     // 달러환율을 kopo05_MoneyEx로 변수 설정
 		double kopo05_commission = 0.3;    // 환전 수수료 퍼센트을 kopo05_commission로 변수 설정 
		
		
 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // 변수 kopo05_usd에 환전할 금액/환율을 해주고 int로 소수점은 버린다, kopo05_usd는 환전한 달러의 값
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // 변수 kopo05_remain에 환전할 금액 - (환율*환전한 달러)를 입력, 잔돈은 소수점이 나와도 줄 수 없기에 int로  버림을 해야한다 
 		
 		System.out.println("****************************************************\n");  // *출력 후 \n으로 줄띄우기
 		System.out.println("*                   수수료없이 계산                 *\n");   // 제목 입력 후 \n으로 줄띄우기
 		System.out.printf("총 한화환전금액: %d원 => %d달러,    잔돈 : %d원\n", kopo05_MyWon,kopo05_usd, kopo05_remain);  // 환전할 총금액과 그 금액을 달러로 환전한 값과 잔돈을 출력  
 		
 		System.out.println("****************************************************\n");  // *출력 후 \n으로 줄띄우기
		
		
	}

}
