package Young;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Y2 {

	public static void main45(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		Y2_inclass kopo05_Runclass = new Y2_inclass(); // Y2_inclass Ŭ������ �����ͼ� kopo05_Runclass ��ü����

		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###"); // kopo05_df�� ��ȭ �������� ,�� �ٰ� ���� ����
		Date kopo05_Time = new Date(); // kopo05_time�� ���� �ð��� ������ ����
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss"); // kopo05_date�� �⵵.��.�� �ð�:��:���� �������� ���� ����																					// 
		int kopo05_Sum1 = kopo05_Runclass.kopo05_price1 * kopo05_Runclass.kopo05_amount1; // kopo05_Runclass��ü���� ������ ù��° ǰ���� ù��° ���ݰ� ������ ������ ���� kopo05_Sum1�� ���� ����
																						

		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("MM�� dd��"); // ȯ�Ұ��� ��¥�� �˷��ֱ� ���� ����
		Calendar kopo05_cal = Calendar.getInstance(); // kopo05_cal�̶� ��ü�� ���� ��¥�� �������� ���� ����
		kopo05_cal.setTime(new Date()); // ���ο� ��¥�� ����
		kopo05_cal.add(Calendar.DATE, 14); // ���� ��¥�� 14�� ���ĸ� ������ֱ� ���� ����

		int kopo05_Sum2 = kopo05_Runclass.kopo05_price2 * kopo05_Runclass.kopo05_amount2; // kopo05_Runclass��ü���� ������ �ι�° ǰ���� �ι�° ���ݰ� ������ ������ ���� kopo05_Sum2�� ���� ����
																							
		int kopo05_Sum3 = kopo05_Runclass.kopo05_price3 * kopo05_Runclass.kopo05_amount3; // kopo05_Runclass��ü���� ������ ����° ǰ���� ����° ���ݰ� ������ ������ ���� kopo05_Sum3�� ���� ����
																							
		int kopo05_GwaSeHabGye = (int) ((double) (kopo05_Sum1 + kopo05_Sum2 + kopo05_Sum3) / 11.0 * 10.0);
		// �����հ踦 ���ϱ� ���� kopo05_Sum1 + kopo05_Sum2 + kopo05_Sum3�� ���� 11�� �����ְ� 10�� ������
		// �ֳ��ϸ� �̹� 10�ۼ�Ʈ�� �ΰ����� �߰��� �Ǿ��� ������ �ΰ����� ���ֱ� ���ؼ�
		// �̰��� kopo05_GwaSeHabGye ������ ����
		int kopo05_BuGaSe = (int) ((kopo05_GwaSeHabGye * 0.1) + 1); // �ΰ����� �����հ迡�� 10�ۼ�Ʈ�� ������ ���� kopo05_BuGaSe ������ ����

		System.out.println("            " + "\"���ΰ���" + "," + " " + "���̼�\"" + " "); // ���ΰ��� ���̼�
		System.out.println("(��)�Ƽ����̼�_�д缭����"); // ��ȣ�� ���
		System.out.println("��ȭ:031-702-6016"); // ��ȭ��ȣ ���
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)"); // �����ּ� ���
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063"); // ��ǥ�� ���
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11\n (������)"); // ������ �ּ� ���
		System.out.println("========================================="); // ������� head ����
		System.out.println("      �Һ����߽ɰ濵(CCM) �������"); // ���� ��� ���
		System.out.println("     ISO 9001 ǰ���濵�ý��� �������"); // ǰ���濵�ý��� ������� ���
		System.out.println("=========================================");
		System.out.printf("      ��ȯ/ȯ�� 14��(%5s)�̳�,\n", kopo05_date1.format(kopo05_cal.getTime()));// ��ȯ ȯ�� ���� �Ⱓ�� ���
		System.out.println("(����)������, ����ī�� ���� �� ���Ը���\n���� ����"); // ��ȯ/ȯ�� ���� ���
		System.out.println("   ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ� "); // ��ȯ/ȯ�� ���� ���
		System.out.println("    üũī�� ��� �� �ִ� 7�� �ҿ� "); // ��ȯ/ȯ�� �ð��ҿ� ���
		System.out.println("=========================================");
		System.out.printf("[POS 1058231]\t %25s", kopo05_date.format(kopo05_Time) + "\n"); // �����⿡�� ����ð��� �����ص� �ð� �������� ���																					
		System.out.println("=========================================");

		
		
		
		// ��ǰ�� �ִ� ���� 8���ڷ�
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname1, 18),  // kopo05_stringByBytes �Լ� ������
				kopo05_df.format(kopo05_Runclass.kopo05_price1), kopo05_df.format(kopo05_Runclass.kopo05_amount1),  
				kopo05_df.format(kopo05_Runclass.kopo05_price1 * kopo05_Runclass.kopo05_amount1)  );  // ǰ��1 �̸�, ����, ����, �ݾ� kopo05_Runclass�� ������
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode1); // ǰ��1�� ��ǰ�ڵ� ���

		
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname2, 18), // kopo05_stringByBytes �Լ��� ������
				kopo05_df.format(kopo05_Runclass.kopo05_price2), kopo05_df.format(kopo05_Runclass.kopo05_amount2),  
				kopo05_df.format(kopo05_Runclass.kopo05_price2 * kopo05_Runclass.kopo05_amount2)  );    // ǰ��2 �̸�, ����, ����, �ݾ��� kopo05_Runclass�� ������
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode2);  // ǰ��2�� ��ǰ�ڵ� ���
		
		
		System.out.printf("%s%9.9s%3.3s%11.11s\n", kopo05_Runclass.kopo05_stringByBytes(kopo05_Runclass.kopo05_itemname3, 18),  // kopo05_stringByBytes �Լ��� ������
				kopo05_df.format(kopo05_Runclass.kopo05_price3), kopo05_df.format(kopo05_Runclass.kopo05_amount3),     // ǰ��3 �̸�, ����, ����, �ݾ� kopo05_Runclass�� ������
				kopo05_df.format(kopo05_Runclass.kopo05_price3 * kopo05_Runclass.kopo05_amount3)  );  
		System.out.printf("%s\n",kopo05_Runclass.kopo05_itemcode3); // // ǰ��3�� ��ǰ�ڵ� ���

		
		
		System.out.printf(" \t  �����հ� %22s\n", kopo05_df.format(kopo05_GwaSeHabGye)); // �Ʊ� �����ص� kopo05_GwaSeHabGye������
																						// ��ȭ�������� ����° �ڸ����� , �� �ִ� ��������
																						// ���
		System.out.printf(" \t    �ΰ��� %22s\n", kopo05_df.format(kopo05_BuGaSe)); // �Ʊ� �����ص� kopo05_BuGaSe������ ��ȭ�������� ����°
																					// �ڸ����� , �� �ִ� �������� ���
		System.out.println("-----------------------------------------");
		System.out.printf("�Ǹ��հ�   %30s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // ���� �հ�� �ΰ����� ���Ѱ���
																									// �Ǹ��հ踦
																									// kopo05_df�������� ���
		System.out.println("=========================================");
		System.out.printf("�ſ�ī��   %30s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // �ſ�ī�� ���� �ݾ��� �����հ� +
																									// �ΰ����� ���
		System.out.println("-----------------------------------------");
		System.out.printf("�츮ī�� %32s\n", "538720**********"); // �츮ī��, ī���ȣ ��� 
		System.out.printf("���ι�ȣ 77982843(0)  ���αݾ� %10s\n", kopo05_df.format(kopo05_GwaSeHabGye + kopo05_BuGaSe)); // ���ι�ȣ, ���αݾ��� %9�� �°� ��� �ݾ��� �������� ĭ�� �°�
																													
																													
		System.out.println("=========================================");
		System.out.printf("     %12s%7s", kopo05_date.format(kopo05_Time), "�д缭����" + "\n"); // ���� �ð� ��� , ������ ���
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400"); // ��ǰ �� ��Ÿ ���� ��ȭ��ȣ ���
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211"); // ����� �� �����̼� ���� ���� ��ȭ��ȣ ���
		System.out.println("      |||||||||||||||||||||||||||||"); // ���ڵ�
		System.out.println("      |||||||||||||||||||||||||||||"); // ���ڵ�
		System.out.println("             2112820610158231"); // ���ڵ� ��ȣ
		System.out.println("-----------------------------------------");
		System.out.println("�� ���̼� ����� �� �Ǵ� Ȩ�������� ����\n�ϼż� ȸ������ �� �پ��� ������ ����\n������!��"); // Ȩ������ ���� ���� ����

	}

}
