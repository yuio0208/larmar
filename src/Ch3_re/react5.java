package Ch3_re;

import java.util.Calendar;

public class react5 {

	public static void main888(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();  
		System.out.println(calendar.getTime());   // ���� ��Ȯ�� ��¥�� �ð��� �˷��� 
		System.out.println(calendar.get(Calendar.YEAR));  // �⵵�� �˷��� 
		System.out.println(calendar.get(Calendar.YEAR) + 1);
		System.out.println(calendar.get(Calendar.MONTH));  // ���� �˷��� 
		System.out.println(calendar.get(Calendar.MONTH) + 3);
		System.out.println(calendar.get(Calendar.DATE));  // ���� �˷��� 
		System.out.println(calendar.get(Calendar.DATE) - 7);
		System.out.println(calendar.get(Calendar.HOUR));     // �ð��� �˷��� 
		System.out.println(calendar.get(Calendar.HOUR) + 10);
		
	}

}
