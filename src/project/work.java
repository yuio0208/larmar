package project;

public class work {  //class 선언 

	

		
	
		private static int kopo05_taxcal(int kopo05_val, int kopo05_rate){ // kopo05_taxcal 함수에 int kopo05_val, int kopo05_rate인수 입력 
			int kopo05_ret; // kopo05_ret변수 선언  
			
		 if(((double)kopo05_val * (double)kopo05_rate/100.0) == kopo05_val * kopo05_rate/100)
			 //  (double)kopo05_val * (double)kopo05_rate에 100.0으로 나눠줬으면 실수가 나옴 양변이 같으려면 소수점이 나오면 안됨 
			kopo05_ret = kopo05_val * kopo05_rate/100; // 소수가 안나오면 그대로 출력
		 else
			 kopo05_ret = kopo05_val * kopo05_rate/100 +1; // 소수가 나오면 손해를 덜 받게끔 +1을 해줘서 int로 버림을 해줌 결국 올림
		 // 손해를 안받기 위해서 올림으로 해줘야 함 
		 return kopo05_ret;   // 리턴값은 소비자가격 * 세금 
			
			
		}
			public static void main125(String[] args) {
				// TODO Auto-generated method stub
			
			int kopo05_val =1121; // 세전가격은 버림이므로 
			// 세금 = 소비자 가격 - 세전가격에서 소비자 가격은 올림을 받을 수 있음, 세전 가격 = 소비자가격/(1+0.1)
			int kopo05_rate = 10;  // 세금은 10퍼센트
				
			int kopo05_tax= kopo05_taxcal(kopo05_val,kopo05_rate); // kopo05_taxcal의 함수를 kopo05_tax함수로 가져와서 인수 kopo05_val, kopo05_rate에 있던 값 입력
			
			System.out.println("**********************************************\n");  // *출력 후 \n으로 줄띄우기
			System.out.println("*             단순 세금 계산                  *\n");  // 제목 입력 후 \n으로 줄띄우기
			System.out.printf("실제 세금계산: %f\n", kopo05_val *kopo05_rate/100.0); //실제 세금 금액은  소비자가격 * 세금/100.0으로 출력 실수로 출력   (%f는 소수 출력)
			System.out.printf("세전가격: %d    세금 :%d    세포함가격: %d\n", kopo05_val,kopo05_tax,kopo05_val+kopo05_tax);  // 세전가격, 세금, 세포함 가격(세전가격 + 세금)을 각각 출력  (%d는 정수 출력)
			System.out.println("**********************************************\n"); // *출력 후 \n으로 줄띄우기
			
		
		
		
	}

}
