package Ch3_re;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class react7 {

	public static void main797(String[] args) {
		// TODO Auto-generated method stub

		
		String start = "20210406";
		String end = "20210403";
		String format = "yyyyMMdd";  // 나타낼 형식을 나타내줌
		
		SimpleDateFormat sc = new SimpleDateFormat(format); 
		
		try {    
			Date startDate = sc.parse(start);
			Date endDate = sc.parse(end);
			
			long diffday = (startDate.getTime() - endDate.getTime()) / (24*60*60*1000);
			// 두날짜 사이의 시간 차이를 하루인 (24시 * 60분 * 60초 * 1000밀리초)로 나눈다
			System.out.println(diffday);
		} catch(ParseException e) {   // try catch로 예외 처리 코드 생성
			e.printStackTrace();
		}
		
	}

}
