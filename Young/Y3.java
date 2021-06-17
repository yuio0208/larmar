package Young;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Y3 {

	public static void main77(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		Y3_inclass kopo05_inclass = new Y3_inclass();  // kopo05_inclass��ü �����ؼ�  Y3_inclass ������ 
		int kopo05_freePrice = 0;   // �鼼ǰ�� ���հ�
		int kopo05_taxPrice = 0;    // ����ǰ�� ���հ�

		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###");  // ���� ��� ���� ���� 
		Date kopo05_Time = new Date();  // ���� ��¥ ���� 
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy-MM-dd hh:mm");  // ��¥ ��� ���� 
		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // ��¥ ��� ����
		SimpleDateFormat kopo05_date2 = new SimpleDateFormat("yyyy-MM-dd"); // ��¥ ��� ����

		System.out.println("emart");   // �̸�Ʈ ��� 
		System.out.println("�̸�Ʈ ������ (031)888-1234");  // ������� ��ȭ��ȣ ��� 
		System.out.println("206-85-50913 ����");        //  ������ 
		System.out.println("���� ������ ������� 552");    // �ּ� ��� 

		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");  // ��ȯ/ȯ������ ��� 
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");  //  ��ȯ/ȯ������ ���
		System.out.println("���Ϻ� �귣����� ����(���� ����������");  //  ��ȯ/ȯ������ ���
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n"); //  ��ȯ/ȯ������ ���

		System.out.printf("[�� ��]%10s", kopo05_date.format(kopo05_Time)); // ���� ��¥�� kopo05_date�� �����ص� �������� ���  
		System.out.println("     POS:0011-9861");  // ������ ���
		System.out.printf("-----------------------------------------\n"); // ���м� ���
		System.out.println("  ��ǰ��                �ܰ� ����    �ݾ�");  // ���� ���� 
		System.out.printf("-----------------------------------------\n"); // ���м� ���

		for (int kopo05_i = 0; kopo05_i < kopo05_inclass.kopo05_ItemName.length; kopo05_i++) {  // �迭�� ǰ����� �־���� ������ �װ� �ϳ��� �����;��ϱ⿡ length�� kopo05_ItemName�� ����ִ� ���� ��ŭ �����´� 
			if (kopo05_inclass.kopo05_TaxFree[kopo05_i]) { // kopo05_TaxFree�迭�� ����ִ� ������ true���  (boolean�� true, false�� ������ ���� �����൵ ��) 
				System.out.printf("*");  // �鼼ǰ���� �տ� *��� ��
				kopo05_freePrice += (kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i]); // kopo05_freePrice�� ǰ�񺰷� ���ݰ� ������ ���� ������ �̰��� for���� �迭�̱⿡ ��� ������ �ݺ��ؼ� ���   
			} else {
				System.out.printf(" ");  // ����ǰ���� �տ� ������� 
				kopo05_taxPrice += (kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i]); // kopo05_freePrice�� ǰ�񺰷� ���ݰ� ������ ���� ������ �̰��� for���� �迭�̱⿡ ��� ������ �ݺ��ؼ� ���  
			}

			System.out.printf("%s%9.9s%3s%10.10s\n", // %s%10.8s�̶�� �տ� 10�� ������ ���� �ڿ� 8�� ��Ÿ�� �ڸ��� ���� 
					kopo05_inclass.kopo05_stringByBytes(kopo05_inclass.kopo05_ItemName[kopo05_i], 18), // kopo05_stringByBytes �Լ� ������ ǰ��� ��� 
					kopo05_df.format(kopo05_inclass.kopo05_Price[kopo05_i]), // ���� ���� ���
					kopo05_df.format(kopo05_inclass.kopo05_SuRyang[kopo05_i]),  // ���� ���� ��� 
					kopo05_df.format(kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i])); // ǰ�� ���� * ������ ���Ѱ��� ���� ��� 
																														
																							
			if (kopo05_i % 5 == 4) {  // 0���� kopo05_i�� �����ϱ� ������ 5�� ���� �������� 4��� 5���� �� ��� 
				System.out.printf("-----------------------------------------\n"); // ���� ���� 
			
			}

		}

		System.out.printf(" %3s �� ǰ�� ���� %23s\n", " ", kopo05_df.format(kopo05_inclass.kopo05_SuRyang.length)); // ǰ����� �� � �ִ��� ����ϱ� ���� kopo05_SuRyang�� length�� ��� 

		int kopo05_MyeonSe = 0;  // �鼼��ǰ �Ѱ���
		int kopo05_GwaSe = 0;   // ������ǰ �Ѱ��� 
		for (int kopo05_i = 0; kopo05_i < kopo05_inclass.kopo05_ItemName.length; kopo05_i++) {  // �迭�� ǰ����� �־���� ������ �װ� �ϳ��� �����;��ϱ⿡ length�� kopo05_ItemName�� ����ִ� ���� ��ŭ �����´� 
			if (kopo05_inclass.kopo05_TaxFree[kopo05_i]) {   //  �鼼��ǰ�� ���ݵ��� �� �� ���ֱ� ���� 
				kopo05_MyeonSe += kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i];  // �鼼�� true�̱⶧���� true�϶� ���ݰ� ������ ���Ѱ� kopo05_MyeonSe�� �Է�
			} else {
				kopo05_GwaSe += kopo05_inclass.kopo05_Price[kopo05_i] * kopo05_inclass.kopo05_SuRyang[kopo05_i];  // ������ false�̱� ������ false�϶� ǰ����� ���ݰ� ���� ���Ѱ� kopo05_GwaSe�� �Է� 
			}

		}
		System.out.printf(" %3s (*)�鼼 ��ǰ%24s%14s\n", " ", kopo05_df.format(kopo05_MyeonSe), " "); // for������ kopo05_MyeonSe�� ����ؼ� ������ ���� for�� �ۿ� �Ἥ �����Ȱ��� �� ���Ѱ��� ����Ѵ�																					 
		System.out.printf(" %3s    ���� ��ǰ%24s%14s\n", " ", kopo05_df.format(kopo05_GwaSe), " ");  // for������ kopo05_GwaSe�� ����ؼ� ������ ���� for�� �ۿ� �Ἥ �����Ȱ��� �� ���Ѱ��� ����Ѵ�
		System.out.printf(" %3s    ��  �� ��%24s%15s\n", " ", kopo05_df.format((int) (kopo05_GwaSe * 0.1)), " ");  // �ΰ����� ������ǰ���� �����տ� 10�ۼ�Ʈ�� ���� �� 
		System.out.printf(" %3s    ��     ��%24s%14s\n", " ",
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)), " ");  // �鼼��ǰ + ������ǰ + �ΰ����� ��� ���Ѱ��� �հ�� ��� 
		System.out.printf("�������ݾ�%29s%14s\n",
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)), " ");  //  �鼼��ǰ + ������ǰ + �ΰ����� ��� ���Ѱ��� �������ݾ����� ��� 
		System.out.printf("-----------------------------------------\n"); // ���� ���� 
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");  // ī��� ī���ȣ 
		System.out.printf("ī�����(IC)             �Ͻú� /%8s\n",    // ������� 
				kopo05_df.format(kopo05_MyeonSe + kopo05_GwaSe + (int) (kopo05_GwaSe * 0.1)));  // ���� �ݾ� ���
		System.out.printf("-----------------------------------------\n"); // ���� ����
		System.out.println("[�ż�������Ʈ ����]"); // ����Ʈ ����
		System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�."); 

		int kopo05_PayPoint = 164;    // �߻�����Ʈ ���� 
		int kopo05_SumPoint = 5473;   // ���� ����Ʈ ���� 
		System.out.printf("��ȸ�߻�����Ʈ            9350**9995%5s\n", kopo05_df.format(kopo05_PayPoint));  // ���������� �߻��� ����Ʈ 
		System.out.printf("����(����)����Ʈ     %8s%1s%10s%1s\n", ( kopo05_df.format(kopo05_SumPoint + kopo05_PayPoint)), "(", kopo05_df.format(kopo05_SumPoint), ")");  // ��������Ʈ�� �߻��� ����Ʈ�� ���� ���� ����Ʈ ��� 
		System.out.println("���ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("-----------------------------------------\n");
		System.out.println("   ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.println("������ȣ :                       34��**** ");
		System.out.printf("�����ð� :            %7s\n", kopo05_date1.format(kopo05_Time));  // �����ð� ���
		System.out.printf("-----------------------------------------\n");
		System.out.println("ĳ��:084599 ��OO                     1150");
		System.out.println("      |||||||||||||||||||||||||||||"); // ���ڵ� ���� 
		System.out.println("      |||||||||||||||||||||||||||||");
		System.out.println("     " + kopo05_date2.format(kopo05_Time) + "/00119861/00164980/31");  // ���ð� ��� 

	}

}
