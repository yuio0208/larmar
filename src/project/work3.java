package project;

public class work3 { // class 선언

	public static void main2222(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kopo05_MyWon = 1000000;        //환전할 금액을 kopo05_MyWon로 변수 설정 
		double kopo05_MoneyEx=1238.21;     // 달러환율을 kopo05_MoneyEx로 변수 설정
 		double kopo05_commission = 0.3;    // 환전 수수료 퍼센트을 kopo05_commission로 변수 설정 
		

 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // 변수 kopo05_usd에 환전할 금액/환율을 해주고 int로 소수점은 버린다, kopo05_usd는 환전한 달러의 값
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // 변수 kopo05_remain에 환전할 금액 - (환율*환전한 달러)를 입력, 잔돈은 소수점이 나와도 줄 수 없기에 int로  버림을 해야한다 
 		
 		
 		double kopo05_ComPerOne = kopo05_MoneyEx * kopo05_commission; // kopo05_ComPerOne(1달러 당 수수료) = 달러환율 * 환전 수수료 퍼센트
 		
 		double kopo05_totalcom = kopo05_usd * kopo05_ComPerOne;    // kopo05_totalcom (총 달러값의 수수료) = 1달러당 수수료 * 환전한 달러 
 		
 		System.out.println("*************************************************************************\n"); // 별 출력 후 줄띄우기 
 		System.out.println("*                               수수료 계산                              *\n");        // 제목 작성 후 줄 띄우기 
 		System.out.printf("총 수수료: %f원 => 미화: %d달러,   달러당 수수료: %f원\n", kopo05_totalcom, kopo05_usd, kopo05_ComPerOne);  // 총 수수료와 총 수수료를 환전한 달러, 달러당 수수료 출력 
 		System.out.println("*************************************************************************\n");   // 별 출력 후 줄띄우기 
		
		
	}

}
