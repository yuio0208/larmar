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
		String input = sc.next();    // �Է��� ���� ���ڿ��� 
		int add_date = sc.nextInt();   // ���� �Է��� ���� ���ڷ� 
		String format = "yyyyMMdd";    // ������ �⵵���Ϸ� 
		Calendar cal = Calendar.getInstance();   // getinstace�� ���� calendar������ ������ 
		SimpleDateFormat sdf = new SimpleDateFormat(format);  // date������ ��ü�� �ڽ��� ���ϴ� ������� ����ϰ� SimpleDateFormat��� 
		Date date = null;
		try { 
			date = sdf.parse(input);
			cal.setTime(date);		
		} catch (ParseException e) {  // ����ó�� 
			e.printStackTrace();   // ���� �޼����� �߻� �ٿ����� ã�� �ܰ躰�� ���� ��� 
		}
		
		cal.add(Calendar.DATE, add_date);  // �ι�°�� ���� ���ڸ� ������
		System.out.println(sdf.format(cal.getTime())); // �������� �������� ���
		
		
		
	}
}