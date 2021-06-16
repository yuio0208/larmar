package Ch3_re;

import java.util.Calendar;

public class react5 {

	public static void main888(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();  
		System.out.println(calendar.getTime());   // 현재 정확한 날짜와 시간을 알려줌 
		System.out.println(calendar.get(Calendar.YEAR));  // 년도를 알려줌 
		System.out.println(calendar.get(Calendar.YEAR) + 1);
		System.out.println(calendar.get(Calendar.MONTH));  // 월을 알려줌 
		System.out.println(calendar.get(Calendar.MONTH) + 3);
		System.out.println(calendar.get(Calendar.DATE));  // 일을 알려줌 
		System.out.println(calendar.get(Calendar.DATE) - 7);
		System.out.println(calendar.get(Calendar.HOUR));     // 시간을 알려줌 
		System.out.println(calendar.get(Calendar.HOUR) + 10);
		
	}

}
