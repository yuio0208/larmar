package project;


public class Taxcalc { 
	
	
	
	public static void main33(String[] args) {
	
	String [] kopo05_item= {"꼬북칩" ,"포카칩", "스윙칩"};  // 배열로 과자 종류 입력
	int[] kopo05_price= {1000,2000,3000};                 // 배열로 과자 가격 입력
	int[] kopo05_amount= {10,20,30};                     // 배열로 과자 수량 입력
	double kopo05_tax_rate= 0.1;                         // 세금 10% 
	int kopo05_total_sum=0;                              // 총 지불 금액 변수 지정
	
	System.out.println("************************************\n");     // *입력 후  \n으로 다음 줄로 
	System.out.println("              구매 과자           \n");        //   제목입력 후 \n으로 다음 줄로
	System.out.println(" 항목        단가       수량    합계\n");       // 항목들 입력 후 \n으로 다음 줄로
	for(int kopo05_i=0; kopo05_i<kopo05_item.length; kopo05_i++) {
		// kopo05_item에서 length로 배열에 넣은 값들을 0번째부터 kopo05_item.length까지 가져온다. 
		int kopo05_sum = kopo05_price[kopo05_i] * kopo05_amount[kopo05_i]; 
		// 가격 * 수량을 kopo05_sum에 넣어 준다.
		kopo05_total_sum = kopo05_total_sum + kopo05_sum;
		// kopo05_total_sum을 누적으로 총 지불금액 설정
		System.out.printf("%.4s  %9d   %7d  %8d\n", kopo05_item[kopo05_i], kopo05_price[kopo05_i], kopo05_amount[kopo05_i],kopo05_sum);
 	}            // %.4s는 4번째 글자까지 가져온다는 뜻이고 그 뒤로 %9d는 전항목 다음 9번째에 단가를 나타내겠다는 것 
	System.out.println("*************************************\n");
	System.out.printf("지불 금액 :   %23d\n", kopo05_total_sum);  //  지불금액 : 다음 23번째부터 kopo05_total_sum 쓰겠다
	
	int kopo05_total_netprice= (int)(kopo05_total_sum/ (1+kopo05_tax_rate));   //kopo05_total_sum /(1 + kopo05_tax_rate)를  (지불금액 / (1+과세율)) kopo05_total_netprice에 넣는다
	System.out.printf("과세 금액 :  %24d\n", kopo05_total_netprice);              // 총 과세 금액 출력
	int kopo05_tax = kopo05_total_sum - kopo05_total_netprice;           // 총 지불금액 - 총 과세금액 을 빼주면
	System.out.printf("세     금 :    %22d\n", kopo05_tax);              // 세금 출력 
	
	
	
	
	
	
	/*
			
			
	
			
		*/
			
	}


}