package project;

public class work1 {

	
	public static int kopo05_netprice(int kopo05_price, double kopo05_rate) {
		//kopo05_netprice로 함수 지정 그안에 int kopo05_price, double kopo05_rate 인수 설정 
		return (int)(kopo05_price/(1+kopo05_rate));
		// return 받을 값은 가격/(1+세율) = 세전가격
	}
	
	
	
	
	public static void main444(String[] args) { //static이므로 main에서 바로 사용 가능 
		// TODO Auto-generated method stub

	int kopo05_price =1234;    // 가격 설정
	double kopo05_tax_rate = 0.1;  // 세율 설정 
	
	
	int kopo05_finprice = kopo05_netprice(kopo05_price,kopo05_tax_rate);  // kopo05_netprice(세전가격)라는 함수를 kopo05_finprice라는 변수에 입력
	int kopo05_tax = kopo05_price - kopo05_finprice; // 세금은 가격 - 세전가격 
	// 손해를 안보기 위해서 1원이라도 올림을 하기 위해서 세전가격을 버림으로 처리하여 소비자가격을 올린다
	
		
	System.out.println("**********************************************\n");
	System.out.println("소비자가,           세전가격,         세금 계산                  \n");
	System.out.printf("소비자가격: %d,   세전가격: %d,   세금: %d\n", kopo05_price,kopo05_finprice, kopo05_tax);  // 소비자가격, 세전가격, 세금을 각각 출력 
	System.out.println("**********************************************\n");
		
		
		
		
		
	}

}
