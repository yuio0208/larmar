package wkqk;

import java.util.Scanner;

public class amuse {

		private Scanner sc = null; 
		
		public amuse() {
			sc = new Scanner(System.in);
			
		}
		
		public int inputFromConsoleType() {
			int tic;
			System.out.println("권종을 선택하세요.\n 1. 주간권 \n 2. 야간권");
			tic = sc.nextInt();
			return tic; 
	
		}
		
		public int inputFromConsoleNumber() {
			int num;
			System.out.println("주민번호 앞자리를 입력하세요.\n");
			num = sc.nextInt();
			return num; 		
		}

		public int inputFromConsoleTh() {
			int Th;
			System.out.println("몇개를 주문하시겠습니까? \n");
			Th = sc.nextInt();
			return Th;  
			
		}
		
		public int inputFromConsoleWu() {
			int Wu;
			System.out.println("우대사항을 선택하세요. "
					+ "1. 없음 (나이 우대는 자동처리)"
					+ "2. 장애인 "
					+ "3. 국가유공자"
					+ "4. 다자녀"
					+ "5. 임산부\n");
			Wu = sc.nextInt();
			return Wu; 
		
		}
		
		
}		
		
		
	


