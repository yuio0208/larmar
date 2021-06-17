package Gaek;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class G3 {

	public static String[] kopo05_ItemName = { "초코파이", "바나나우유", "허니버터칩", "스윙칩", "메이플 시럽", "코카콜라", "펩시", "스프라이트", "신라면",
			"진라면", "틈새라면", "썬글라스", "우유", "요구르트", "하늘보리", "맥콜", "데자와", "솔의 눈", "홈런볼", "와우껌", "비타500", "커피", "커피우유", "김밥",
			"삼각김밥", "도시락", "간짬뽕", "공화춘", "너구리", "무파마" };  // 상품명 목록 전역변수

	public static int[] kopo05_Price = { 2000, 1000, 1500, 1500, 1500, 2000, 1700, 1700, 1500, 1500, 1500, 5000, 4000,
			3000, 2000, 1000, 1000, 1000, 1500, 1000, 1000, 5000, 2000, 3000, 1500, 4000, 1000, 2000, 1500, 2000 };  // 상품가격 목록 전역변수

	public static int[] kopo05_SuRyang = { 1, 2, 3, 5, 6, 8, 9, 3, 4, 2, 4, 6, 2, 1, 5, 7, 10, 5, 5, 15, 10, 5, 7, 9, 8,
			4, 15, 2, 3, 6 }; // 상품수량 목록 전역변수

	public static boolean[] kopo05_TaxFree = { true, false, true, false, false, false, false, true, false, true, false,
			false, true, false, true, true, true, true, false, false, false, false, true, true, true, true, true, false,
			false, true };  // 면세여부 목록 전역변수

	public static DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###");  // 숫자 형식 설정 kopo05_df 객체 생성 전역변수

	public static Date kopo05_Time = new Date(); // 현재 날짜 kopo05_Time 객체 생성 전역변수

	public static void kopo05_prtTop() {  // kopo05_prtTop 메소드 생성 
		SimpleDateFormat kopo05_date = new SimpleDateFormat("YYYY-MM-dd HH:mm");  // 날짜 출력 형식 설정 
		System.out.println("emart");   // 이마트 
		System.out.println("이마트 죽전점 (031)888-1234");  // 지점, 전화번호 
		System.out.println("206-85-50913 강희석");   // 지점장
		System.out.println("용인 수지구 포은대로 552");  // 주소 
		System.out.println("영수증 미지참시 교환/환불 불가");  // 교환 환불 조건 
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");  // 교환 환불 조건
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조");  // 교환 환불 조건
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)\n");  // 교환 환불 조건

		System.out.printf("[구 매]%10s", kopo05_date.format(kopo05_Time));  // // 현재 날짜를 kopo05_date형식으로 출력  
		System.out.println("     POS:0011-9861");                  
		System.out.printf("-----------------------------------------\n");  // 구분 설정
		System.out.println("  상품명           단가     수량     금액");    // 항목 
		System.out.printf("-----------------------------------------\n");  // 구분 설정 

	}

	public static void kopo05_prtList() throws Exception {      // kopo05_prtList메소드 설정  

		for (int kopo05_i = 0; kopo05_i < kopo05_ItemName.length; kopo05_i++) {   // kopo05_ItemName 상품목록 전체를 출력 
			if (kopo05_TaxFree[kopo05_i]) {  // 만약 면세대상이면 
				System.out.printf("*");  // *표시 
			} else {   // 과세대상이면 
				System.out.printf(" ");  // 공백 출력 
			}
			System.out.printf("%s%1s%7d%10s\n", kopo05_stringByBytes(kopo05_ItemName[kopo05_i], 18), // 상품명은 8자로 나오게 kopo05_stringByBytes 메소드 사용 
					kopo05_df.format(kopo05_Price[kopo05_i]), kopo05_SuRyang[kopo05_i], // 상품가격, 상품 수량 
					kopo05_df.format(kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i]));  // 상품 합계 가격 출력 

			if ((kopo05_i + 1) % 5 == 0) {  // 다섯개 항목마다 구분선 출력 위해, +1은 0부터 시작하니까  
				System.out.printf("-----------------------------------------\n");  // 구분선 출력 
			}
		}

	}

	public static int[] kopo05_calToralPriceTaxAndFree() {  // kopo05_calRoralPriceTaxAndFree 메소드 생성 과세여부에 따른 총 가격 계산 
		int kopo05_resultPrice[] = new int[2]; //  면세, 과세 품목 총합계 저장할 배열 
		int kopo05_taxPrice = 0;   // 과세품목 설정
		int kopo05_freePrice = 0;   // 전체품목 설정 
		for (int kopo05_i = 0; kopo05_i < kopo05_ItemName.length; kopo05_i++) { // 품목전체 출력
			if (kopo05_TaxFree[kopo05_i]) {  // boolean은 true false로만 출력하는데 true면 면세 품목 
				kopo05_freePrice += kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i];  // 면세합계에 품목 금액 추가 

			} else { // 과세 품목인 경우 
				kopo05_taxPrice += kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i]; // 과세합계에 품목 금액 추가 

			}
		}
		kopo05_resultPrice[0] = kopo05_freePrice;  // 인덱스 0에 면세품목 총합계 저장 
		kopo05_resultPrice[1] = kopo05_taxPrice;   // 인덱스 1에 과세품목 총합계 저장 
		return kopo05_resultPrice;  // 배열 반환 

	}

	public static void kopo05_prtCalResult(int[] kopo05_resultPrice) {  // kopo05_prtCalResult 메소드 생성  총 금액 계산 및 출력 

		int kopo05_freePrice = kopo05_resultPrice[0];  // 면세품목 총합계
		int kopo05_taxPrice = kopo05_resultPrice[1];   // 과세품목 총합계 
		int kopo05_totalPrice = 0;     // 전체 합계액 
		int kopo05_netPrice;             // 과세 상품  
		int kopo05_tax;                // 부가세 

		kopo05_totalPrice = kopo05_freePrice + kopo05_taxPrice; // 전체 합계 = 면세가격 + 과세가격 
		kopo05_netPrice = kopo05_getNetPrice(kopo05_taxPrice);   // 과세상품 공급가액 계산
		kopo05_tax = kopo05_taxPrice - kopo05_netPrice;      // 부가세 = 가격 - 공급가액 

		System.out.printf(" %3s 총 품목 수량 %23s\n", " ", kopo05_df.format(kopo05_SuRyang.length)); // 총 상품 수량 

		System.out.printf(" %3s (*)면세 물품%24s%14s\n", " ", kopo05_df.format(kopo05_freePrice), " ");  //  숫자 형식으로 면세 상품 총액 

		System.out.printf(" %3s    과세 물품%24s%14s\n", " ", kopo05_df.format(kopo05_netPrice), " ");  //  숫자 형식으로 과세 상품 총액
		System.out.printf(" %3s    부  가 세%24s%15s\n", " ", kopo05_df.format(kopo05_tax), " ");		// 숫자 형식으로 부가세 출력 
		System.out.printf(" %3s    합     계%24s%14s\n", " ", kopo05_df.format(kopo05_totalPrice), " ");  // 숫자 형식으로 전체 합계액  

		System.out.printf("결제대상금액%29s%14s\n", kopo05_df.format(kopo05_totalPrice), " ");  // 숫자 출력 형식 사용 결제 금액 
		System.out.printf("-----------------------------------------\n");   // 구분 설정 
		System.out.printf("0012 KEB 하나       541707**0484/35860658\n");   // 카드 정보 
		System.out.printf("카드결제(IC)             일시불 /%8s\n", kopo05_df.format(kopo05_totalPrice), " ");  // 숫자 형식으로 결제금액 
		System.out.printf("-----------------------------------------\n");  // 구분 설정 

	}

	public static void kopo05_prtBottom() {  // 영수증 하단 출력 메소드 

		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");  // 날짜 출력 
		SimpleDateFormat kopo05_date2 = new SimpleDateFormat("YYYYMMdd");    // 날짜 출력 형식 

		System.out.println("[신세계포인트 적립]");    // 영수증 정보 
		System.out.println("홍*두 고객님의 포인트 현황입니다."); // 영수증 정보

		int kopo05_PayPoint = 164;  // 포인트 
		int kopo05_SumPoint = 5637; // 누계 포인트 
		System.out.printf("금회발생포인트            9350**9995%5s\n", kopo05_df.format(kopo05_PayPoint));  // 발생 포인트 출력 
		System.out.printf("누계(가용)포인트     %8s%1s%10s%1s\n", kopo05_df.format(kopo05_SumPoint), "(",   // 누계 포인트에 
				kopo05_df.format(kopo05_SumPoint - kopo05_PayPoint), ")");    // 기존 포인트 출력 
		System.out.println("＊신세계포인트 유효기간은 2년입니다.");      // 영수증 정보 
		System.out.printf("-----------------------------------------\n");  // 구분설정 
		System.out.println("   구매금액기준 무료주차시간 자동부여");    // 영수증 정보 
		System.out.println("차량번호 :                       34저**** ");  // 차량 번호 출력 
		System.out.printf("입차시간 :            %7s\n", kopo05_date1.format(kopo05_Time)); // 입차시간 출력 
		System.out.printf("-----------------------------------------\n");  // 구분 설정 
		System.out.println("캐셔:084599 양OO                     1150");   // 캐셔 정보 
		System.out.println("      |||||||||||||||||||||||||||||");    // 바코드 
		System.out.println("      |||||||||||||||||||||||||||||");
		System.out.println("     " + kopo05_date2.format(kopo05_Time) + "/00119861/00164980/31"); // 바코드 시간 출력 

	}

	public static int kopo05_getNetPrice(int kopo05_Price) {  // 부가세를 포함하지 않는 물품의 가격을 구하는 메소드  
		double kopo05_taxRate = 10.0 / 11.0;   // 부가세율 10%, 부동소수점 오류 방지를 위해 10.0, 11.0으로 계산 
		double kopo05_netPrice = kopo05_Price * kopo05_taxRate;  // 부가세 미포함 가격 = 총 가격 / (1 + 부가세율)
 
		return (int) kopo05_netPrice;   // 정수값 부가세 미포함 가격 반환 

	}

	public static String kopo05_stringByBytes(String kopo05_inputString, int kopo05_stringWidth) throws Exception {
		for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth; kopo05_i++) { // kopo05_stringWidth으로 기존 문자열의 너비를 설정
			kopo05_inputString += " "; // 기존 문자열에 설정 너비만큼 공백을 더함
		}

		int kopo05_widthByte = 0;  // 바이트 기준 가로너비 
		int kopo05_cutIndex = 0;   // 잘라낼 인덱스 
		char kopo05_temp = ' ';    // 문자열 중 한 글자 
		for (int kopo05_i = 0; kopo05_i < kopo05_inputString.length(); kopo05_i++) {   // 문자열 전체 
			kopo05_temp = kopo05_inputString.charAt(kopo05_i);    // 한글자를 char로 받아옴 
			if (Character.getType(kopo05_temp) == 5) {    // character type이 5인 경우 
				kopo05_widthByte += 2; // 한글 글자 너비 2 추가 
			} else {  // 한글이 아닌 경우 
				kopo05_widthByte += 1;  // 너비 1 추가 
			}
			kopo05_cutIndex++;  // 잘라낼 인덱스 1 추가 
			if (kopo05_widthByte > kopo05_stringWidth) { // 설정한 최대 너비보다 클 경우 
				kopo05_cutIndex--;  // 한글자 앞에서 자른 후 
				break;   // 종료 
			}
		}
		String kopo05_rename = kopo05_inputString.substring(0, kopo05_cutIndex);  // 지정한 인덱스 앞까지 자르기 

		int kopo05_newWidth = kopo05_rename.getBytes("EUC-KR").length;  // 한글 2바이트로 간주한 너비 = 바이트 길이 
		if (kopo05_newWidth < kopo05_stringWidth) {    // 설정한 최대 너비보다 작은 경우 
			for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth - kopo05_newWidth; kopo05_i++) {  // 남는 자리 만큼 
				kopo05_rename += " ";  // 공백 추가 
			}
		}
		return kopo05_rename;  // 새로운 상품이름 반환 

	}

	public static void main45(String[] args) throws Exception {  // 메인 

		kopo05_prtTop();   // 영수증 상단 출력 
		kopo05_prtList();  // 품목 리스트 출력 
		int[] calResult = kopo05_calToralPriceTaxAndFree(); // 가격 반환 
		kopo05_prtCalResult(calResult);   // 총 금액 출력 
		kopo05_prtBottom();    // 영수증 하단 출력 

	}

}
