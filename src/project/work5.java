package project;

public class work5 {

	public static void main44444(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_MyWon = 1000000;        //ȯ���� �ݾ��� kopo05_MyWon�� ���� ���� 
		double kopo05_MoneyEx=1238.21;     // �޷�ȯ���� kopo05_MoneyEx�� ���� ����
 		double kopo05_commission = 0.003;    // ȯ�� ������ �ۼ�Ʈ�� kopo05_commission�� ���� ���� 
		
		

 		int kopo05_usd = (int)(kopo05_MyWon/kopo05_MoneyEx);   // ���� kopo05_usd�� ȯ���� �ݾ�/ȯ���� ���ְ� int�� �Ҽ����� ������, kopo05_usd�� ȯ���� �޷��� ��
 		int kopo05_remain = (int) (kopo05_MyWon - kopo05_usd * kopo05_MoneyEx); // ���� kopo05_remain�� ȯ���� �ݾ� - (ȯ��*ȯ���� �޷�)�� �Է�, �ܵ��� �Ҽ����� ���͵� �� �� ���⿡ int��  ������ �ؾ��Ѵ� 
 		
 		
 		double kopo05_ComPerOne = kopo05_MoneyEx * kopo05_commission; // 1�޷� �� ������ = �޷�ȯ�� * ȯ�� ������ �ۼ�Ʈ
 		
 		double kopo05_totalcom = kopo05_usd * kopo05_ComPerOne;    // �� �޷����� ������ = 1�޷��� ������ * ȯ���� �޷� 
 		
 		int kopo05_i_totalcom ;   // ������ û���Ḧ kopo05_i_totalcom�� ���� 
 		
 	
 		
 		
 		kopo05_usd = (int) (kopo05_MyWon/(kopo05_MoneyEx + kopo05_ComPerOne)); //���� kopo05_usd�� ȯ���� �ݾ�/ȯ���� ���ְ� int�� �Ҽ����� ������
 		kopo05_totalcom = kopo05_usd * kopo05_ComPerOne;   // �� �޷����� ������ = 1�޷��� ������ * ȯ���� �޷� 
 		
 		
 		
 		if(kopo05_totalcom != (double)((int)kopo05_totalcom))  // kopo05_totalcom���� �Ҽ������Ϸ� ���ڰ� ���´ٸ� 
 				kopo05_i_totalcom = (int)kopo05_totalcom+1;  // +1�� ���༭ int, �� �ø��� ���ش� ���غ� �� �����ϱ�
 				else
 				kopo05_i_totalcom= (int)kopo05_totalcom;  // ���� �Ҽ��� ���Ϸ� ���ڰ� �ȳ����� �Ǽ���� �״�� ��� 
 			       
 	
 		
 		
 	
 		System.out.println("************************************************************************************\n"); // �� ��� �� �ٶ��� 
 		System.out.println("*                          (��Ȯ��) ������ ����ȯ��                                  *\n");        // ���� �ۼ� �� �� ���� 
 		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�,   �޷��� ������: %f��\n", kopo05_i_totalcom, kopo05_usd, kopo05_ComPerOne);  // �� ������� �� �����Ḧ ȯ���� �޷�, �޷��� ������ ���
 		
 		kopo05_remain= (int) (kopo05_MyWon-kopo05_usd*kopo05_MoneyEx - kopo05_i_totalcom);  // kopo05_remain(�ܵ�) = �ܵ� ������ ȯ���� �ݾ� - (ȯ���� �޷� * ȯ��) - ������ û���ݾ� ���
 		
 		System.out.printf("�� ��ȭȯ���ݾ�: %d��  =>  ��ȭ:  %d�޷�,    ������ û��:%d��     �ܵ� :  %d��\n", kopo05_MyWon,kopo05_usd, kopo05_i_totalcom, kopo05_remain);  // �� ȯ���� �ݾװ� �� �ݾ��� ȯ���� �޷�, ������ ������ û����, ���� �� ��� 
 		System.out.println("************************************************************************************\n");   // �� ��� �� �ٶ���
		
		
		
		
		
	}

}
