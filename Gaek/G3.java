package Gaek;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class G3 {

	public static String[] kopo05_ItemName = { "��������", "�ٳ�������", "��Ϲ���Ĩ", "����Ĩ", "������ �÷�", "��ī�ݶ�", "���", "��������Ʈ", "�Ŷ��",
			"�����", "ƴ�����", "��۶�", "����", "�䱸��Ʈ", "�ϴú���", "����", "���ڿ�", "���� ��", "Ȩ����", "�Ϳ청", "��Ÿ500", "Ŀ��", "Ŀ�ǿ���", "���",
			"�ﰢ���", "���ö�", "��«��", "��ȭ��", "�ʱ���", "���ĸ�" };  // ��ǰ�� ��� ��������

	public static int[] kopo05_Price = { 2000, 1000, 1500, 1500, 1500, 2000, 1700, 1700, 1500, 1500, 1500, 5000, 4000,
			3000, 2000, 1000, 1000, 1000, 1500, 1000, 1000, 5000, 2000, 3000, 1500, 4000, 1000, 2000, 1500, 2000 };  // ��ǰ���� ��� ��������

	public static int[] kopo05_SuRyang = { 1, 2, 3, 5, 6, 8, 9, 3, 4, 2, 4, 6, 2, 1, 5, 7, 10, 5, 5, 15, 10, 5, 7, 9, 8,
			4, 15, 2, 3, 6 }; // ��ǰ���� ��� ��������

	public static boolean[] kopo05_TaxFree = { true, false, true, false, false, false, false, true, false, true, false,
			false, true, false, true, true, true, true, false, false, false, false, true, true, true, true, true, false,
			false, true };  // �鼼���� ��� ��������

	public static DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###");  // ���� ���� ���� kopo05_df ��ü ���� ��������

	public static Date kopo05_Time = new Date(); // ���� ��¥ kopo05_Time ��ü ���� ��������

	public static void kopo05_prtTop() {  // kopo05_prtTop �޼ҵ� ���� 
		SimpleDateFormat kopo05_date = new SimpleDateFormat("YYYY-MM-dd HH:mm");  // ��¥ ��� ���� ���� 
		System.out.println("emart");   // �̸�Ʈ 
		System.out.println("�̸�Ʈ ������ (031)888-1234");  // ����, ��ȭ��ȣ 
		System.out.println("206-85-50913 ����");   // ������
		System.out.println("���� ������ ������� 552");  // �ּ� 
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");  // ��ȯ ȯ�� ���� 
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");  // ��ȯ ȯ�� ����
		System.out.println("���Ϻ� �귣����� ����(���� ����������");  // ��ȯ ȯ�� ����
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");  // ��ȯ ȯ�� ����

		System.out.printf("[�� ��]%10s", kopo05_date.format(kopo05_Time));  // // ���� ��¥�� kopo05_date�������� ���  
		System.out.println("     POS:0011-9861");                  
		System.out.printf("-----------------------------------------\n");  // ���� ����
		System.out.println("  ��ǰ��           �ܰ�     ����     �ݾ�");    // �׸� 
		System.out.printf("-----------------------------------------\n");  // ���� ���� 

	}

	public static void kopo05_prtList() throws Exception {      // kopo05_prtList�޼ҵ� ����  

		for (int kopo05_i = 0; kopo05_i < kopo05_ItemName.length; kopo05_i++) {   // kopo05_ItemName ��ǰ��� ��ü�� ��� 
			if (kopo05_TaxFree[kopo05_i]) {  // ���� �鼼����̸� 
				System.out.printf("*");  // *ǥ�� 
			} else {   // ��������̸� 
				System.out.printf(" ");  // ���� ��� 
			}
			System.out.printf("%s%1s%7d%10s\n", kopo05_stringByBytes(kopo05_ItemName[kopo05_i], 18), // ��ǰ���� 8�ڷ� ������ kopo05_stringByBytes �޼ҵ� ��� 
					kopo05_df.format(kopo05_Price[kopo05_i]), kopo05_SuRyang[kopo05_i], // ��ǰ����, ��ǰ ���� 
					kopo05_df.format(kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i]));  // ��ǰ �հ� ���� ��� 

			if ((kopo05_i + 1) % 5 == 0) {  // �ټ��� �׸񸶴� ���м� ��� ����, +1�� 0���� �����ϴϱ�  
				System.out.printf("-----------------------------------------\n");  // ���м� ��� 
			}
		}

	}

	public static int[] kopo05_calToralPriceTaxAndFree() {  // kopo05_calRoralPriceTaxAndFree �޼ҵ� ���� �������ο� ���� �� ���� ��� 
		int kopo05_resultPrice[] = new int[2]; //  �鼼, ���� ǰ�� ���հ� ������ �迭 
		int kopo05_taxPrice = 0;   // ����ǰ�� ����
		int kopo05_freePrice = 0;   // ��üǰ�� ���� 
		for (int kopo05_i = 0; kopo05_i < kopo05_ItemName.length; kopo05_i++) { // ǰ����ü ���
			if (kopo05_TaxFree[kopo05_i]) {  // boolean�� true false�θ� ����ϴµ� true�� �鼼 ǰ�� 
				kopo05_freePrice += kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i];  // �鼼�հ迡 ǰ�� �ݾ� �߰� 

			} else { // ���� ǰ���� ��� 
				kopo05_taxPrice += kopo05_Price[kopo05_i] * kopo05_SuRyang[kopo05_i]; // �����հ迡 ǰ�� �ݾ� �߰� 

			}
		}
		kopo05_resultPrice[0] = kopo05_freePrice;  // �ε��� 0�� �鼼ǰ�� ���հ� ���� 
		kopo05_resultPrice[1] = kopo05_taxPrice;   // �ε��� 1�� ����ǰ�� ���հ� ���� 
		return kopo05_resultPrice;  // �迭 ��ȯ 

	}

	public static void kopo05_prtCalResult(int[] kopo05_resultPrice) {  // kopo05_prtCalResult �޼ҵ� ����  �� �ݾ� ��� �� ��� 

		int kopo05_freePrice = kopo05_resultPrice[0];  // �鼼ǰ�� ���հ�
		int kopo05_taxPrice = kopo05_resultPrice[1];   // ����ǰ�� ���հ� 
		int kopo05_totalPrice = 0;     // ��ü �հ�� 
		int kopo05_netPrice;             // ���� ��ǰ  
		int kopo05_tax;                // �ΰ��� 

		kopo05_totalPrice = kopo05_freePrice + kopo05_taxPrice; // ��ü �հ� = �鼼���� + �������� 
		kopo05_netPrice = kopo05_getNetPrice(kopo05_taxPrice);   // ������ǰ ���ް��� ���
		kopo05_tax = kopo05_taxPrice - kopo05_netPrice;      // �ΰ��� = ���� - ���ް��� 

		System.out.printf(" %3s �� ǰ�� ���� %23s\n", " ", kopo05_df.format(kopo05_SuRyang.length)); // �� ��ǰ ���� 

		System.out.printf(" %3s (*)�鼼 ��ǰ%24s%14s\n", " ", kopo05_df.format(kopo05_freePrice), " ");  //  ���� �������� �鼼 ��ǰ �Ѿ� 

		System.out.printf(" %3s    ���� ��ǰ%24s%14s\n", " ", kopo05_df.format(kopo05_netPrice), " ");  //  ���� �������� ���� ��ǰ �Ѿ�
		System.out.printf(" %3s    ��  �� ��%24s%15s\n", " ", kopo05_df.format(kopo05_tax), " ");		// ���� �������� �ΰ��� ��� 
		System.out.printf(" %3s    ��     ��%24s%14s\n", " ", kopo05_df.format(kopo05_totalPrice), " ");  // ���� �������� ��ü �հ��  

		System.out.printf("�������ݾ�%29s%14s\n", kopo05_df.format(kopo05_totalPrice), " ");  // ���� ��� ���� ��� ���� �ݾ� 
		System.out.printf("-----------------------------------------\n");   // ���� ���� 
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");   // ī�� ���� 
		System.out.printf("ī�����(IC)             �Ͻú� /%8s\n", kopo05_df.format(kopo05_totalPrice), " ");  // ���� �������� �����ݾ� 
		System.out.printf("-----------------------------------------\n");  // ���� ���� 

	}

	public static void kopo05_prtBottom() {  // ������ �ϴ� ��� �޼ҵ� 

		SimpleDateFormat kopo05_date1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");  // ��¥ ��� 
		SimpleDateFormat kopo05_date2 = new SimpleDateFormat("YYYYMMdd");    // ��¥ ��� ���� 

		System.out.println("[�ż�������Ʈ ����]");    // ������ ���� 
		System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ������ ����

		int kopo05_PayPoint = 164;  // ����Ʈ 
		int kopo05_SumPoint = 5637; // ���� ����Ʈ 
		System.out.printf("��ȸ�߻�����Ʈ            9350**9995%5s\n", kopo05_df.format(kopo05_PayPoint));  // �߻� ����Ʈ ��� 
		System.out.printf("����(����)����Ʈ     %8s%1s%10s%1s\n", kopo05_df.format(kopo05_SumPoint), "(",   // ���� ����Ʈ�� 
				kopo05_df.format(kopo05_SumPoint - kopo05_PayPoint), ")");    // ���� ����Ʈ ��� 
		System.out.println("���ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");      // ������ ���� 
		System.out.printf("-----------------------------------------\n");  // ���м��� 
		System.out.println("   ���űݾױ��� ���������ð� �ڵ��ο�");    // ������ ���� 
		System.out.println("������ȣ :                       34��**** ");  // ���� ��ȣ ��� 
		System.out.printf("�����ð� :            %7s\n", kopo05_date1.format(kopo05_Time)); // �����ð� ��� 
		System.out.printf("-----------------------------------------\n");  // ���� ���� 
		System.out.println("ĳ��:084599 ��OO                     1150");   // ĳ�� ���� 
		System.out.println("      |||||||||||||||||||||||||||||");    // ���ڵ� 
		System.out.println("      |||||||||||||||||||||||||||||");
		System.out.println("     " + kopo05_date2.format(kopo05_Time) + "/00119861/00164980/31"); // ���ڵ� �ð� ��� 

	}

	public static int kopo05_getNetPrice(int kopo05_Price) {  // �ΰ����� �������� �ʴ� ��ǰ�� ������ ���ϴ� �޼ҵ�  
		double kopo05_taxRate = 10.0 / 11.0;   // �ΰ����� 10%, �ε��Ҽ��� ���� ������ ���� 10.0, 11.0���� ��� 
		double kopo05_netPrice = kopo05_Price * kopo05_taxRate;  // �ΰ��� ������ ���� = �� ���� / (1 + �ΰ�����)
 
		return (int) kopo05_netPrice;   // ������ �ΰ��� ������ ���� ��ȯ 

	}

	public static String kopo05_stringByBytes(String kopo05_inputString, int kopo05_stringWidth) throws Exception {
		for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth; kopo05_i++) { // kopo05_stringWidth���� ���� ���ڿ��� �ʺ� ����
			kopo05_inputString += " "; // ���� ���ڿ��� ���� �ʺ�ŭ ������ ����
		}

		int kopo05_widthByte = 0;  // ����Ʈ ���� ���γʺ� 
		int kopo05_cutIndex = 0;   // �߶� �ε��� 
		char kopo05_temp = ' ';    // ���ڿ� �� �� ���� 
		for (int kopo05_i = 0; kopo05_i < kopo05_inputString.length(); kopo05_i++) {   // ���ڿ� ��ü 
			kopo05_temp = kopo05_inputString.charAt(kopo05_i);    // �ѱ��ڸ� char�� �޾ƿ� 
			if (Character.getType(kopo05_temp) == 5) {    // character type�� 5�� ��� 
				kopo05_widthByte += 2; // �ѱ� ���� �ʺ� 2 �߰� 
			} else {  // �ѱ��� �ƴ� ��� 
				kopo05_widthByte += 1;  // �ʺ� 1 �߰� 
			}
			kopo05_cutIndex++;  // �߶� �ε��� 1 �߰� 
			if (kopo05_widthByte > kopo05_stringWidth) { // ������ �ִ� �ʺ񺸴� Ŭ ��� 
				kopo05_cutIndex--;  // �ѱ��� �տ��� �ڸ� �� 
				break;   // ���� 
			}
		}
		String kopo05_rename = kopo05_inputString.substring(0, kopo05_cutIndex);  // ������ �ε��� �ձ��� �ڸ��� 

		int kopo05_newWidth = kopo05_rename.getBytes("EUC-KR").length;  // �ѱ� 2����Ʈ�� ������ �ʺ� = ����Ʈ ���� 
		if (kopo05_newWidth < kopo05_stringWidth) {    // ������ �ִ� �ʺ񺸴� ���� ��� 
			for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth - kopo05_newWidth; kopo05_i++) {  // ���� �ڸ� ��ŭ 
				kopo05_rename += " ";  // ���� �߰� 
			}
		}
		return kopo05_rename;  // ���ο� ��ǰ�̸� ��ȯ 

	}

	public static void main45(String[] args) throws Exception {  // ���� 

		kopo05_prtTop();   // ������ ��� ��� 
		kopo05_prtList();  // ǰ�� ����Ʈ ��� 
		int[] calResult = kopo05_calToralPriceTaxAndFree(); // ���� ��ȯ 
		kopo05_prtCalResult(calResult);   // �� �ݾ� ��� 
		kopo05_prtBottom();    // ������ �ϴ� ��� 

	}

}
