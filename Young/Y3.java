package Young;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Y3 {

	public static void main77(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		Y3_inclass kopo05_inclass = new Y3_inclass();  // kopo05_inclass객체 생성해서  Y3_inclass 가져옴 
		int kopo05_freePrice = 0;   // 면세품목 총합계
		int kopo05_taxPrice = 0;    // 과세품목 총합계

		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###");  // 숫자 출력 형식 지정 
		Date kopo05_Time = new Date();  // 현재 날짜 설정 
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy-MM-dd hh:mm");  // 날짜 출력 형식 
		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 날짜 출력 형식
		SimpleDateFormat kopo05_date2 = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 출력 형식

		System.out.println("emart");   // 이마트 출력 
		System.out.println("이마트 죽전점 (031)888-1234");  // 지점명과 전화번호 출력 
		System.out.println("206-85-50913 강희석");        //  지점장 
		System.out.println("용인 수지구 포은대로 552");    // 주소 출력 

		System.out.println("영수증 미지참시 교환/환불 불가");  // 교환/환불조건 출력 
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");  //  교환/환불조건 출력
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조");  //  교환/환불조건 출력
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)\n"); //  교환/환불조건 출력

		System.out.printf("[구 매]%10s", kopo05_date.format(kopo05_Time)); // 현재 날짜를 kopo05_date에 지정해둔 형식으로 출력  
		System.out.println("     POS:0011-9861");  // 포스기 출력
		System.out.printf("-----------------------------------------\n"); // 구분선 출력
		System.out.println("  상품명                단가 수량    금액");  // 제목 설정 
		System.out.printf("-----------------------------------------\n"); // 구분선 출력

		for (int kopo05_i = 0; kopo05_i < kopo05_inclass.kopo05_ItemName.length; kopo05_i++) {  // 배열에 품목들을 넣어놨기 때문에 그걸 하나씩 가져와야하기에 length로 kopo05_ItemName에 들어있는 값들 만큼 가져온다 
			if (kopo05_inclass.kopo05_TaxFree[kopo05_i]) { // kopo05_TaxFree배열에 들어있는 값들이 true라면  (boolean은 true, false라 조건을 설정 안해줘도 됨) 
				System.out.printf("*");  // 면세품들은 앞에 *출력 후
				kopo05_freePrice += (kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i]); // kopo05_freePrice에 품목별로 가격과 수량을 각각 곱해줌 이것을 for문과 배열이기에 모든 값들을 반복해서 출력   
			} else {
				System.out.printf(" ");  // 과세품들은 앞에 공백출력 
				kopo05_taxPrice += (kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i]); // kopo05_freePrice에 품목별로 가격과 수량을 각각 곱해줌 이것을 for문과 배열이기에 모든 값들을 반복해서 출력  
			}

			System.out.printf("%s%9.9s%3s%10.10s\n", // %s%10.8s이라면 앞에 10은 간격을 설정 뒤에 8은 나타낼 자리수 설정 
					kopo05_inclass.kopo05_stringByBytes(kopo05_inclass.kopo05_ItemName[kopo05_i], 18), // kopo05_stringByBytes 함수 가져와 품목명 출력 
					kopo05_df.format(kopo05_inclass.kopo05_Price[kopo05_i]), // 가격 각각 출력
					kopo05_df.format(kopo05_inclass.kopo05_SuRyang[kopo05_i]),  // 수량 각각 출력 
					kopo05_df.format(kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i])); // 품목별 가격 * 수량을 곱한값을 각각 출력 
																														
																							
			if (kopo05_i % 5 == 4) {  // 0부터 kopo05_i가 시작하기 때문에 5로 나눈 나머지가 4라면 5개의 값 출력 
				System.out.printf("-----------------------------------------\n"); // 구분 설정 
			
			}

		}

		System.out.printf(" %3s 총 품목 수량 %23s\n", " ", kopo05_df.format(kopo05_inclass.kopo05_SuRyang.length)); // 품목들이 총 몇개 있는지 출력하기 위해 kopo05_SuRyang에 length로 출력 

		int kopo05_MyeonSe = 0;  // 면세물품 총가격
		int kopo05_GwaSe = 0;   // 과세물품 총가격 
		for (int kopo05_i = 0; kopo05_i < kopo05_inclass.kopo05_ItemName.length; kopo05_i++) {  // 배열에 품목들을 넣어놨기 때문에 그걸 하나씩 가져와야하기에 length로 kopo05_ItemName에 들어있는 값들 만큼 가져온다 
			if (kopo05_inclass.kopo05_TaxFree[kopo05_i]) {   //  면세물품의 가격들을 다 더 해주기 위해 
				kopo05_MyeonSe += kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i];  // 면세는 true이기때문에 true일때 가격과 수량을 곱한값 kopo05_MyeonSe에 입력
			} else {
				kopo05_GwaSe += kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i];  // 과세는 false이기 때문에 false일때 품목들의 가격과 수량 곱한갑 kopo05_GwaSe에 입력 
			}

		}
		System.out.printf(" %3s (*)면세 물품%24s%14s\n", " ", kopo05_df.format(kopo05_MyeonSe), " "); // for문으로 kopo05_MyeonSe에 계속해서 더해준 것을 for문 밖에 써서 누적된것을 다 더한것을 출력한다																					 
		System.out.printf(" %3s    과세 물품%24s%14s\n", " ", kopo05_df.format(kopo05_GwaSe), " ");  // for문으로 kopo05_GwaSe에 계속해서 더해준 것을 for문 밖에 써서 누적된것을 다 더한것을 출력한다
		System.out.printf(" %3s    부  가 세%24s%15s\n", " ", kopo05_df.format((int) (kopo05_GwaSe * 0.1)), " ");  // 부가세는 과세물품들의 누적합에 10퍼센트를 곱한 값 
		System.out.printf(" %3s    합     계%24s%14s\n", " ",
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)), " ");  // 면세물품 + 과세물품 + 부가세를 모두 더한값을 합계로 출력 
		System.out.printf("결제대상금액%29s%14s\n",
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)), " ");  //  면세물품 + 과세물품 + 부가세를 모두 더한값을 결제대상금액으로 출력 
		System.out.printf("-----------------------------------------\n"); // 구분 설정 
		System.out.printf("0012 KEB 하나       541707**0484/35860658\n");  // 카드사 카드번호 
		System.out.printf("카드결제(IC)             일시불 /%8s\n",    // 결제방식 
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)));  // 결제 금액 출력
		System.out.printf("-----------------------------------------\n"); // 구분 설정
		System.out.println("[신세계포인트 적립]"); // 포인트 적립
		System.out.println("홍*두 고객님의 포인트 현황입니다."); 

		int kopo05_PayPoint = 164;    // 발생포인트 설정 
		int kopo05_SumPoint = 5473;   // 기존 포인트 설정 
		System.out.printf("금회발생포인트            9350**9995%5s\n", kopo05_df.format(kopo05_PayPoint));  // 결제함으로 발생한 포인트 
		System.out.printf("누계(가용)포인트     %8s%1s%10s%1s\n", ( kopo05_df.format(kopo05_SumPoint + kopo05_PayPoint)), "(", kopo05_df.format(kopo05_SumPoint), ")");  // 기존포인트와 발생한 포인트의 합인 누계 포인트 출력 
		System.out.println("＊신세계포인트 유효기간은 2년입니다.");
		System.out.printf("-----------------------------------------\n");
		System.out.println("   구매금액기준 무료주차시간 자동부여");
		System.out.println("차량번호 :                       34저**** ");
		System.out.printf("입차시간 :            %7s\n", kopo05_date1.format(kopo05_Time));  // 입차시간 출력
		System.out.printf("-----------------------------------------\n");
		System.out.println("캐셔:084599 양OO                     1150");
		System.out.println("      |||||||||||||||||||||||||||||"); // 바코드 설정 
		System.out.println("      |||||||||||||||||||||||||||||");
		System.out.println("     " + kopo05_date2.format(kopo05_Time) + "/00119861/00164980/31");  // 현시간 출력 

	}

}
