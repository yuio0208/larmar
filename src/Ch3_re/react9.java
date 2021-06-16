package Ch3_re;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class react9 {

	public static void main99(String[] args) {
		// TODO Auto-generated method stub

		
		TimeZone time;  
		Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 형식설정
			
			time = TimeZone.getTimeZone("Asia/Seoul"); // 서울시각 추출
			dateFormat.setTimeZone(time);
			System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));  // 그 지역의 시각 출력
		
			time = TimeZone.getTimeZone("America/New_York");
			dateFormat.setTimeZone(time);
			System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		
	}

}
