package Young;

import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Y1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.printf("�ſ����\n");  // �ſ���� ���
		System.out.println("�ܸ��� : 2NG8665898     ��ǥ��ȣ : 041218");  // ����� ĭ�� �°� ��¹� ����  
		System.out.println("������ : �Ѿ��ġ�");   // �������� ���
		System.out.println("��  �� : ��⵵ ������ �д籸 Ȳ�����351\n���� 10 , 1��"); // �� �ּ� ���, �߰��� �� �ٶ���� ĭ�� �°� ���
		System.out.println("��ǥ�� : ��â��");  // ��ǥ�� ���
		System.out.println("����� : 752-53-00558 \t    Tel : 7055695");
		System.out.println("-----------------------------------------"); // head ��¹����� ����

		int kopo05_iPrice = 80000;  //  kopo05_iPrice�� �ѱݾ��� ������ ���� 
		int kopo05_Price = (int) ((double)(kopo05_iPrice / 11.0 *10.0));  // kopo05_Price�� �ΰ��� �ٱ����� ������ �ѱݾ��� ������ ����  
		int kopo05_Add = (int) ((kopo05_Price *0.1)+1);  // kopo05_Add�� ������ �ѱݾ��� �ΰ���(10%)�� ���� 
		DecimalFormat kopo05_df = new DecimalFormat("###,###,###,###"); // kopo05_df�� ��ȭ �������� ,�� �ٰ� ���� ���� 
		Date kopo05_time = new Date(); // kopo05_time�� ���� �ð��� ������ ����  
		SimpleDateFormat kopo05_date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); // kopo05_date�� �⵵/��/�� �ð�:��:���� �������� ���� ���� 

		System.out.printf("��  ��\t\t %23s\n", kopo05_df.format(kopo05_Price) + " ��"); // ������ �ѱݾ��� õ���ڸ����� ,�� �ٴ� �������� ���, %23s�� 23��° �ȿ� �ѱݾ��� ��µǰ� �����ϰ� "��"�� ����
		System.out.printf("�ΰ���\t\t %23s\n", kopo05_df.format(kopo05_Add) + " ��"); // ���� �ѱݾ��� �ΰ����� õ���ڸ����� ,�� �ٴ� �������� ���, %23s�� 23��° �ȿ� ���� �ѱݾ��� �ΰ����� ��µǰ� �����ϰ� "��"�� ����
		System.out.printf("��  ��\t\t %23s\n", kopo05_df.format(kopo05_iPrice) + " ��"); // ���� �ѱݾ׿� �ΰ����� ���� �հ踦 ��ȭ�� ,�� �ٴ� �������� ���, %23s�� 23��° �ȿ� ���� �ѱݾ��� ��µǰ� �����ϰ� "��"�� ����
		System.out.println("-----------------------------------------");

		System.out.println("�츮ī��"); // �츮ī�� ���
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)  �Ͻú�"); // ī���ȣ�� ���� ��� ���
		System.out.println("�ŷ��Ͻ� : " + kopo05_date.format(kopo05_time));  // ����ð��� �����ص� �ð� �������� ��� 
		System.out.printf("���ι�ȣ : " + "70404427\n");  // ���ι�ȣ ���
		System.out.println("�ŷ���ȣ : 357734873739");  // �ŷ���ȣ ���
		System.out.println("���� : ��ī���   ���� : 720068568");  // ���԰� ���͹�ȣ ���
		System.out.println("�˸� : EDC����ǥ");  // �˸� ���
		System.out.println("���� : TEL)1544-4700");  // ���� ��ȭ ��ȣ ���
		System.out.println("-----------------------------------------");  
		System.out.println("               * �����մϴ� *");    // ���� ���
		System.out.println("                       ǥ��v2.08_20200212");  // ǥ�� ��� 

	}

}
