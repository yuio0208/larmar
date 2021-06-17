package Young;

import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Y1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.printf("신용승인\n");  // 신용승인 출력
		System.out.println("단말기 : 2NG8665898     전표번호 : 041218");  // 띄어쓰기로 칸에 맞게 출력문 설정  
		System.out.println("가맹점 : 한양김치찌개");   // 가맹점명 출력
		System.out.println("주  소 : 경기도 성남시 분당구 황새울로351\n번길 10 , 1층"); // 현 주소 출력, 중간에 길어서 줄띄우기로 칸에 맞게 출력
		System.out.println("대표자 : 유창신");  // 대표자 출력
		System.out.println("사업자 : 752-53-00558 \t    Tel : 7055695");
		System.out.println("-----------------------------------------"); // head 출력문으로 설정

		int kopo05_iPrice = 80000;  //  kopo05_iPrice를 총금액의 변수로 설정 
		int kopo05_Price = (int) ((double)(kopo05_iPrice / 11.0 *10.0));  // kopo05_Price를 부가세 붙기전의 물건의 총금액의 변수로 설정  
		int kopo05_Add = (int) ((kopo05_Price *0.1)+1);  // kopo05_Add를 물건의 총금액의 부가세(10%)로 설정 
		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###"); // kopo05_df를 통화 설정으로 ,가 붙게 변수 설정 
		Date kopo05_time = new Date(); // kopo05_time를 현재 시간의 변수로 설정  
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); // kopo05_date를 년도/월/일 시간:분:초의 형식으로 변수 설정 

		System.out.printf("금  액\t\t %23s\n", kopo05_df.format(kopo05_Price) + " 원"); // 물건의 총금액을 천의자리마다 ,가 붙는 형식으로 출력, %23s로 23번째 안에 총금액이 출력되게 설정하고 "원"을 붙힘
		System.out.printf("부가세\t\t %23s\n", kopo05_df.format(kopo05_Add) + " 원"); // 물건 총금액의 부가세를 천의자리마다 ,가 붙는 형식으로 출력, %23s로 23번째 안에 물건 총금액의 부가세가 출력되게 설정하고 "원"을 붙힘
		System.out.printf("합  계\t\t %23s\n", kopo05_df.format(kopo05_iPrice) + " 원"); // 물건 총금액에 부가세를 더한 합계를 통화로 ,가 붙는 형식으로 출력, %23s로 23번째 안에 물건 총금액이 출력되게 설정하고 "원"을 붙힘
		System.out.println("-----------------------------------------");

		System.out.println("우리카드"); // 우리카드 출력
		System.out.println("카드번호 : 5387-20**-****-4613(S)  일시불"); // 카드번호와 결제 방식 출력
		System.out.println("거래일시 : " + kopo05_date.format(kopo05_time));  // 현재시간에 설정해둔 시간 형식으로 출력 
		System.out.printf("승인번호 : " + "70404427\n");  // 승인번호 출력
		System.out.println("거래번호 : 357734873739");  // 거래번호 출력
		System.out.println("매입 : 비씨카드사   가맹 : 720068568");  // 매입과 가맹번호 출력
		System.out.println("알림 : EDC매출표");  // 알림 출력
		System.out.println("문의 : TEL)1544-4700");  // 문의 전화 번호 출력
		System.out.println("-----------------------------------------");  
		System.out.println("               * 감사합니다 *");    // 문구 출력
		System.out.println("                       표준v2.08_20200212");  // 표준 출력 

	}

}
