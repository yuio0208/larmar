package Ch3_re;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class react8 {

	public static void main555(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);   
		String input = sc.next();    // 입력할 것을 문자열로 
		int add_date = sc.nextInt();   // 다음 입력할 것은 숫자로 
		String format = "yyyyMMdd";    // 형식은 년도월일로 
		Calendar cal = Calendar.getInstance();   // getinstace로 현재 calendar정보를 가져옴 
		SimpleDateFormat sdf = new SimpleDateFormat(format);  // date형식의 객체를 자신이 원하는 방식으로 출력하게 SimpleDateFormat사용 
		Date date = null;
		try { 
			date = sdf.parse(input);
			cal.setTime(date);		
		} catch (ParseException e) {  // 예외처리 
			e.printStackTrace();   // 에러 메세지의 발생 근원지를 찾아 단계별로 에러 출력 
		}
		
		cal.add(Calendar.DATE, add_date);  // 두번째로 넣은 숫자를 더해줌
		System.out.println(sdf.format(cal.getTime())); // 지정해준 형식으로 출력
		
		
		
	}
}