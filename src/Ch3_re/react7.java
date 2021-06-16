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
		String format = "yyyyMMdd";  // ��Ÿ�� ������ ��Ÿ����
		
		SimpleDateFormat sc = new SimpleDateFormat(format); 
		
		try {    
			Date startDate = sc.parse(start);
			Date endDate = sc.parse(end);
			
			long diffday = (startDate.getTime() - endDate.getTime()) / (24*60*60*1000);
			// �γ�¥ ������ �ð� ���̸� �Ϸ��� (24�� * 60�� * 60�� * 1000�и���)�� ������
			System.out.println(diffday);
		} catch(ParseException e) {   // try catch�� ���� ó�� �ڵ� ����
			e.printStackTrace();
		}
		
	}

}
