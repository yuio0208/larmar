package project;

public class work3 { // class ����

	public static void main2222(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kopo05_MyWon = 1000000;        //ȯ���� �ݾ��� kopo05_MyWon�� ���� ���� 
		double kopo05_MoneyEx=1238.21;     // �޷�ȯ���� kopo05_MoneyEx�� ���� ����
 		double kopo05_commission = 0.3;    // ȯ�� ������ �ۼ�Ʈ�� kopo05_commission�� ���� ���� 
		

 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // ���� kopo05_usd�� ȯ���� �ݾ�/ȯ���� ���ְ� int�� �Ҽ����� ������, kopo05_usd�� ȯ���� �޷��� ��
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // ���� kopo05_remain�� ȯ���� �ݾ� - (ȯ��*ȯ���� �޷�)�� �Է�, �ܵ��� �Ҽ����� ���͵� �� �� ���⿡ int��  ������ �ؾ��Ѵ� 
 		
 		
 		double kopo05_ComPerOne = kopo05_MoneyEx * kopo05_commission; // kopo05_ComPerOne(1�޷� �� ������) = �޷�ȯ�� * ȯ�� ������ �ۼ�Ʈ
 		
 		double kopo05_totalcom = kopo05_usd * kopo05_ComPerOne;    // kopo05_totalcom (�� �޷����� ������) = 1�޷��� ������ * ȯ���� �޷� 
 		
 		System.out.println("*************************************************************************\n"); // �� ��� �� �ٶ��� 
 		System.out.println("*                               ������ ���                              *\n");        // ���� �ۼ� �� �� ���� 
 		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�,   �޷��� ������: %f��\n", kopo05_totalcom, kopo05_usd, kopo05_ComPerOne);  // �� ������� �� �����Ḧ ȯ���� �޷�, �޷��� ������ ��� 
 		System.out.println("*************************************************************************\n");   // �� ��� �� �ٶ��� 
		
		
	}

}
