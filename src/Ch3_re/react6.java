package Ch3_re;

import java.util.Calendar;
import java.util.Scanner;

public class react6 {



	public static void main765(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int year = sc.nextInt();  // �⵵
		System.out.println("");
		int month = sc.nextInt();   //��
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.YEAR, 2021);  //�Է¹��� �⵵�� ���� 
		calendar.set(Calendar.MONTH,calendar.FEBRUARY);  // �Է¹��� ���� ����
		calendar.set(Calendar.DATE, 1);  
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		calendar.set(year,month-1,1);  //�Է¹��� ���� 1�� ���� month�� 0���� 1���̹Ƿ� -1�� ���ش�
		int end = calendar.getActualMaximum(Calendar.DATE);  // �ش� �� ������ ��¥
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  // �ش� ��¥�� ���� (1 : �Ͽ��� 2: ������ ...)
		for (int i = 1; i <= end; i++) { 
			if (i==1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    "); }
				} if (i < 10) {    // ���ڸ����� ��� ������ �߰��ؼ� �� ���߱� 
					System.out.print(" ");
			} System.out.print("" +  i  + "  "); // ��¥ ���̸� ����ִ� ��¹�
			if (dayOfWeek % 7 == 0) {  // 7���� ������ �����ٷ� �������� 
				System.out.println();
			} dayOfWeek++;
		} System.out.print("");
	}
}
