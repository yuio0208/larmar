package Ch3_re;

import java.util.Calendar;
import java.util.Scanner;

public class react6 {



	public static void main765(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int year = sc.nextInt();  // 년도
		System.out.println("");
		int month = sc.nextInt();   //월
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.YEAR, 2021);  //입력받은 년도로 세팅 
		calendar.set(Calendar.MONTH,calendar.FEBRUARY);  // 입력받은 월로 세팅
		calendar.set(Calendar.DATE, 1);  
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		calendar.set(year,month-1,1);  //입력받은 월의 1로 세팅 month는 0부터 1월이므로 -1을 해준다
		int end = calendar.getActualMaximum(Calendar.DATE);  // 해당 월 마지막 날짜
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  // 해당 날짜의 요일 (1 : 일요일 2: 월요일 ...)
		for (int i = 1; i <= end; i++) { 
			if (i==1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    "); }
				} if (i < 10) {    // 한자리수일 경우 공백을 추가해서 줄 맞추기 
					System.out.print(" ");
			} System.out.print("" +  i  + "  "); // 날짜 사이를 띄어주는 출력문
			if (dayOfWeek % 7 == 0) {  // 7일이 끝나면 다음줄로 내려가게 
				System.out.println();
			} dayOfWeek++;
		} System.out.print("");
	}
}
