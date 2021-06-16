package project;

public class work4 {  // 클래스 선언

	public static void main555(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kopo05_MyWon = 1000000;        //환전할 금액을 kopo05_MyWon로 변수 설정 
		double kopo05_MoneyEx=1238.21;     // 달러환율을 kopo05_MoneyEx로 변수 설정
 		double kopo05_commission = 0.3;    // 환전 수수료 퍼센트을 kopo05_commission로 변수 설정 
		
		

 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // 변수 kopo05_usd에 환전할 금액/환율을 해주고 int로 소수점은 버린다, kopo05_usd는 환전한 달러의 값
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // 변수 kopo05_remain에 환전할 금액 - (환율*환전한 달러)를 입력, 잔돈은 소수점이 나와도 줄 수 없기에 int로  버림을 해야한다 
 		
 		
 		double kopo05_ComPerOne = kopo05_MoneyEx * kopo05_commission; // 1달러 당 수수료 = 달러환율 * 환전 수수료 퍼센트
 		
 		double kopo05_totalcom = kopo05_usd * kopo05_ComPerOne;    // 총 달러값의 수수료 = 1달러당 수수료 * 환전한 달러 
 		
 		int kopo05_i_totalcom ;   // 수수료 청구료를 kopo05_i_totalcom로 설정 
 		
 		if(kopo05_totalcom != (double)((int)kopo05_totalcom))  // 예시로 kopo05_i_totalcom값이 123.4라 하면 (double)((int)kopo05_totalcom)의 값은 123.0이다 이때 같지 않다는 건 총 달러값의 수수료가 소수점이 붙어있다는 뜻이므로 이둘이 같지 않으면 
 			kopo05_i_totalcom = (int) kopo05_totalcom +1;    //  kopo05_totalcom의 값에 +1을 해줘서 손해를 보지 않겠다는 것
 		
 		else 
 			kopo05_i_totalcom = (int) kopo05_totalcom;  //  else 값으로 kopo05_i_totalcom의 값이 소수점 이하로 붙지 않아서 그대로 출력한다  
 		
 		
 	
 		System.out.println("************************************************************************************\n"); // 별 출력 후 줄띄우기 
 		System.out.println("*                                  수수료 적용환전                                  *\n");        // 제목 작성 후 줄 띄우기 
 		System.out.printf("총 수수료: %d원 => 미화: %d달러,   달러당 수수료: %f원\n", kopo05_i_totalcom, kopo05_usd, kopo05_ComPerOne);  // 총 수수료와 총 수수료를 환전한 달러, 달러당 수수료 출력
 		
 		kopo05_remain= (int) (kopo05_MyWon-kopo05_usd*kopo05_MoneyEx - kopo05_i_totalcom);  // kopo05_remain(잔돈) = 잔돈 변수에 환전할 금액 - (환전한 달러 * 환율) - 수수료 청구금액 출력
 		
 		System.out.printf("총 한화환전금액: %d원 => 미화:  %d달러,  수수료 청구:%d원    잔돈 : %d원\n", kopo05_MyWon,kopo05_usd, kopo05_i_totalcom, kopo05_remain);  // 총 환전할 금액과 그 금액을 환전한 달러, 은행의 수수료 청구료, 남은 돈 출력 
 		System.out.println("************************************************************************************\n");   // 별 출력 후 줄띄우기
		
	}

}
