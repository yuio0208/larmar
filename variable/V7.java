package variable;

public class V7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String kopo05_url = "www.codechobo.com";
		
		float kopo05_f1 = .10f; // kopo05_f1�� 0.10
		float kopo05_f2 = 1e1f;  // 10.0 , 1.0e1 , 1.0e+1 
		float kopo05_f3 = 3.14e3f;  // 3140.0 , 3.140
		double kopo05_d = 1.23456789; // �Ҽ� 1.23456789�Է� 
		
		System.out.printf("f1 = %f, %e, %g%n", kopo05_f1, kopo05_f1, kopo05_f1);  //kopo05_f1�� %f�� �Ҽ��� �������� ���, %e�� ����ǥ���� �������� ���, %g�� ����� ��� ���� %e �Ǵ� %f ���·� ���  
		System.out.printf("f2 = %f, %e, %g%n", kopo05_f2, kopo05_f2, kopo05_f2);  //kopo05_f2�� %f�� �Ҽ��� �������� ���, %e�� ����ǥ���� �������� ���, %g�� ����� ��� ���� %e �Ǵ� %f ���·� ��� 
		System.out.printf("f3 = %f, %e, %g%n", kopo05_f3, kopo05_f3, kopo05_f3);  //kopo05_f3�� %f�� �Ҽ��� �������� ���, %e�� ����ǥ���� �������� ���, %g�� ����� ��� ���� %e �Ǵ� %f ���·� ��� 

		System.out.printf("d=%f%n", kopo05_d);      // kopo05_d�� %f �Ҽ��� �������� ��� 
		System.out.printf("d=%14.10f%n", kopo05_d); // kopo05_d�� %f �Ҽ��� �������� ��ü 14�ڸ� �� �Ҽ��� 10�ڸ��� ��� 
		
		System.out.printf("[12345678901234567890]%n");  // [12345678901234567890]��� �� �� ����  
		System.out.printf("[%s]%n", kopo05_url);    // [] �ȿ� kopo05_url ���  
		System.out.printf("[%20s]%n", kopo05_url);   // []�ȿ� kopo05_url ���� ���ķ� 20��° �ȿ� ��� 
		System.out.printf("[%-20s]%n", kopo05_url);  // []�ȿ� kopo05_url ������ ���ķ� 20��° �ȿ� ���
		System.out.printf("[%.8s]%n", kopo05_url);   // []�ȿ��� kopo05_url�� ���� 8���ڸ� ��� 
		
		
	}

}
