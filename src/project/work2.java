package project;

public class work2 {  // class ����

	public static void main78(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int kopo05_MyWon = 1000000;        //ȯ���� �ݾ��� kopo05_MyWon�� ���� ���� 
		double kopo05_MoneyEx=1238.21;     // �޷�ȯ���� kopo05_MoneyEx�� ���� ����
 		double kopo05_commission = 0.3;    // ȯ�� ������ �ۼ�Ʈ�� kopo05_commission�� ���� ���� 
		
		
 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // ���� kopo05_usd�� ȯ���� �ݾ�/ȯ���� ���ְ� int�� �Ҽ����� ������, kopo05_usd�� ȯ���� �޷��� ��
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // ���� kopo05_remain�� ȯ���� �ݾ� - (ȯ��*ȯ���� �޷�)�� �Է�, �ܵ��� �Ҽ����� ���͵� �� �� ���⿡ int��  ������ �ؾ��Ѵ� 
 		
 		System.out.println("****************************************************\n");  // *��� �� \n���� �ٶ���
 		System.out.println("*                   ��������� ���                 *\n");   // ���� �Է� �� \n���� �ٶ���
 		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => %d�޷�,    �ܵ� : %d��\n", kopo05_MyWon,kopo05_usd, kopo05_remain);  // ȯ���� �ѱݾװ� �� �ݾ��� �޷��� ȯ���� ���� �ܵ��� ���  
 		
 		System.out.println("****************************************************\n");  // *��� �� \n���� �ٶ���
		
		
	}

}
