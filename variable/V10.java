package variable;

public class V10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_i = 10;  // kopo05_i 10���� ���� 
		byte kopo05_b = (byte)kopo05_i; // kopo05_i�� byte���·� byte ������ kopo05_b�� �Է� 
		System.out.printf("[int -> byte] kopo05_i=%d -> kopo05_b = %d%n", kopo05_i, kopo05_b); // kopo05_i�� kopo05_b ��� 
		
		kopo05_i = 300; // kopo05_i�� 300 �Է� 
		kopo05_b = (byte)kopo05_i;  // kopo05_i�� byte �������� kopo05_b�� �Է� 
		System.out.printf("[int -> byte] kopo05_i=%d -> kopo05_b = %d%n", kopo05_i, kopo05_b); // kopo05_i�� kopo05_b ��� byte�� ������ 127����
		
		kopo05_b = 10; // kopo05_b�� 10�Է� 
		kopo05_i = (int)kopo05_b; //kopo05_b�� int�������� kopo05_i�� �Է� 
		System.out.printf("[byte -> int] kopo05_b = %d -> kopo05_i = %d%n", kopo05_b, kopo05_i);  // kopo05_b�� kopo05_i ��� 
		
		kopo05_b = -2; // kopo05_b�� -2 �Է� 
		kopo05_i = (int)kopo05_b; // kopo05_b�� int�������� kopo05_i�� �Է� 
		System.out.printf("[byte -> int] kopo05_b = %d -> kopo05_i =%d%n", kopo05_b, kopo05_i);  // kopo05_b�� kopo05_i��� 
		
		
		System.out.println("kopo05_i = " +Integer.toBinaryString(kopo05_i));  // kopo05_i�� 2�������� ��� 
		
	}

}
