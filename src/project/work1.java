package project;

public class work1 {

	
	public static int kopo05_netprice(int kopo05_price, double kopo05_rate) {
		//kopo05_netprice�� �Լ� ���� �׾ȿ� int kopo05_price, double kopo05_rate �μ� ���� 
		return (int)(kopo05_price/(1+kopo05_rate));
		// return ���� ���� ����/(1+����) = ��������
	}
	
	
	
	
	public static void main444(String[] args) { //static�̹Ƿ� main���� �ٷ� ��� ���� 
		// TODO Auto-generated method stub

	int kopo05_price =1234;    // ���� ����
	double kopo05_tax_rate = 0.1;  // ���� ���� 
	
	
	int kopo05_finprice = kopo05_netprice(kopo05_price,kopo05_tax_rate);  // kopo05_netprice(��������)��� �Լ��� kopo05_finprice��� ������ �Է�
	int kopo05_tax = kopo05_price - kopo05_finprice; // ������ ���� - �������� 
	// ���ظ� �Ⱥ��� ���ؼ� 1���̶� �ø��� �ϱ� ���ؼ� ���������� �������� ó���Ͽ� �Һ��ڰ����� �ø���
	
		
	System.out.println("**********************************************\n");
	System.out.println("�Һ��ڰ�,           ��������,         ���� ���                  \n");
	System.out.printf("�Һ��ڰ���: %d,   ��������: %d,   ����: %d\n", kopo05_price,kopo05_finprice, kopo05_tax);  // �Һ��ڰ���, ��������, ������ ���� ��� 
	System.out.println("**********************************************\n");
		
		
		
		
		
	}

}
