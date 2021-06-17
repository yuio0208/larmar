package Young;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Y2 {

	public static void main45(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		Y2_inclass kopo05_Runclass = new Y2_inclass(); // Y2_inclass 클래스를 가져와서 kopo05_Runclass 객체설정

		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###"); // kopo05_df를 통화 설정으로 ,가 붙게 변수 설정
		Date kopo05_Time = new Date(); // kopo05_time를 현재 시간의 변수로 설정
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss"); // kopo05_date를 년도.월.일 시간:분:초의 형식으로 변수 설정																					// 
		int kopo05_Sum1 = kopo05_Runclass.kopo05_price1 * kopo05_Runclass.kopo05_amount1; // kopo05_Runclass객체에서 가져온 첫번째 품목의 첫번째 가격과 수량을 곱해준 것을 kopo05_Sum1로 변수 설정
																						

		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("MM월 dd일"); // 환불가능 날짜를 알려주기 위해 설정
		Calendar kopo05_cal = Calendar.getInstance(); // kopo05_cal이란 객체를 현재 날짜를 가져오기 위해 설정
		kopo05_cal.setTime(new Date()); // 새로운 날짜로 세팅
		kopo05_cal.add(Calendar.DATE, 14); // 현재 날짜에 14일 이후를 계산해주기 위해 설정

		int kopo05_Sum2 = kopo05_Runclass.kopo05_price2 * kopo05_Runclass.kopo05_amount2; // kopo05_Runclass객체에서 가져온 두번째 품목의 두번째 가격과 수량을 곱해준 것을 kopo05_Sum2로 변수 설정
																							
		int kopo05_Sum3 = kopo05_Runclass.kopo05_price3 * kopo05_Runclass.kopo05_amount3; // kopo05_Runclass객체에서 가져온 세번째 품목의 세번째 가격과 수량을 곱해준 것을 kopo05_Sum3로 변수 설정
																							
		int kopo05_GwaSeHabGye = (int) ((double) (kopo05_Sum1 + kopo05_Sum2 + kopo05_Sum3) / 11.0 * 10.0);
		// 과세합계를 구하기 위해 kopo05_Sum1 + kopo05_Sum2 + kopo05_Sum3의 값에 11을 나눠주고 10을 곱해줌
		// 왜냐하면 이미 10퍼센트의 부가세가 추가가 되었기 때문에 부가세를 빼주기 위해서
		// 이것을 kopo05_GwaSeHabGye 변수로 설정
		int kopo05_BuGaSe = (int) ((kopo05_GwaSeHabGye * 0.1) + 1); // 부가세는 과세합계에서 10퍼센트를 곱해준 값을 kopo05_BuGaSe 변수에 설정

		System.out.println("            " + "\"국민가게" + "," + " " + "다이소\"" + " "); // 국민가게 다이소
		System.out.println("(주)아성다이소_분당서현점"); // 상호명 출력
		System.out.println("전화:031-702-6016"); // 전화번호 출력
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)"); // 본사주소 출력
		System.out.println("대표:박정부,신호섭 213-81-52063"); // 대표자 출력
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11\n (서현동)"); // 매장의 주소 출력
		System.out.println("========================================="); // 여기까지 head 설정
		System.out.println("      소비자중심경영(CCM) 인증기업"); // 인증 기업 출력
		System.out.println("     ISO 9001 품질경영시스템 인증기업"); // 품질경영시스템 인증기업 출력
		System.out.println("=========================================");
		System.out.printf("      교환/환불 14일(%5s)이내,\n", kopo05_date1.format(kopo05_cal.getTime()));// 교환 환불 가능 기간을 출력
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장\n에서 가능"); // 교환/환불 조건 출력
		System.out.println("   포장/가격 택 훼손시 교환/환불 불가 "); // 교환/환불 조건 출력
		System.out.println("    체크카드 취소 시 최대 7일 소요 "); // 교환/환불 시간소요 출력
		System.out.println("=========================================");
		System.out.printf("[POS 1058231]\t %25s", kopo05_date.format(kopo05_Time) + "\n"); // 포스기에서 현재시간에 설정해둔 시간 형식으로 출력																					
		System.out.println("=========================================");

		
		
		
		// 상품명 최대 길이 8글자로
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname1, 18),  // kopo05_stringByBytes 함수 가져옴
				kopo05_df.format(kopo05_Runclass.kopo05_price1), kopo05_df.format(kopo05_Runclass.kopo05_amount1),  
				kopo05_df.format(kopo05_Runclass.kopo05_price1 * kopo05_Runclass.kopo05_amount1)  );  // 품목1 이름, 가격, 수량, 금액 kopo05_Runclass로 가져옴
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode1); // 품목1의 상품코드 출력

		
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname2, 18), // kopo05_stringByBytes 함수도 가져옴
				kopo05_df.format(kopo05_Runclass.kopo05_price2), kopo05_df.format(kopo05_Runclass.kopo05_amount2),  
				kopo05_df.format(kopo05_Runclass.kopo05_price2 * kopo05_Runclass.kopo05_amount2)  );    // 품목2 이름, 가격, 수량, 금액을 kopo05_Runclass로 가져옴
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode2);  // 품목2의 상품코드 출력
		
		
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname3, 18),  // kopo05_stringByBytes 함수도 가져옴
				kopo05_df.format(kopo05_Runclass.kopo05_price3), kopo05_df.format(kopo05_Runclass.kopo05_amount3),     // 품목3 이름, 가격, 수량, 금액 kopo05_Runclass로 가져옴
				kopo05_df.format(kopo05_Runclass.kopo05_price3 * kopo05_Runclass.kopo05_amount3)  );  
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode3); // // 품목3의 상품코드 출력

		
		
		System.out.printf(" \t  과세합계 %22s\n", kopo05_df.format(kopo05_GwaSeHabGye)); // 아까 설정해둔 kopo05_GwaSeHabGye변수에
																						// 통화설정으로 세번째 자리마다 , 를 넣는 형식으로
																						// 출력
		System.out.printf(" \t    부가세 %22s\n", kopo05_df.format(kopo05_BuGaSe)); // 아까 설정해둔 kopo05_BuGaSe변수에 통화설정으로 세번째
																					// 자리마다 , 를 넣는 형식으로 출력
		System.out.println("-----------------------------------------");
		System.out.printf("판매합계   %30s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // 과세 합계와 부가세를 더한값인
																									// 판매합계를
																									// kopo05_df형식으로 출력
		System.out.println("=========================================");
		System.out.printf("신용카드   %30s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // 신용카드 결제 금액을 과세합계 +
																									// 부가세로 출력
		System.out.println("-----------------------------------------");
		System.out.printf("우리카드 %32s\n", "538720**********"); // 우리카드, 카드번호 출력 
		System.out.printf("승인번호 77982843(0)  승인금액 %10s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // 승인번호, 승인금액을 %9에 맞게 출력 금액이 높아져도 칸에 맞게
																													
																													
		System.out.println("=========================================");
		System.out.printf("     %12s%7s", kopo05_date.format(kopo05_Time), "분당서현점" + "\n"); // 결제 시간 출력 , 매장점 출력
		System.out.println("상품 및 기타 문의 : 1522-4400"); // 상품 및 기타 문의 전화번호 출력
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211"); // 멤버십 및 샵다이소 관련 문의 전화번호 출력
		System.out.println("      |||||||||||||||||||||||||||||"); // 바코드
		System.out.println("      |||||||||||||||||||||||||||||"); // 바코드
		System.out.println("             2112820610158231"); // 바코드 번호
		System.out.println("-----------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속\n하셔서 회원가입 후 다양한 혜택을 누려\n보세요!◈"); // 홈페이지 접속 유도 문구

	}

}
