package variable;

public class V6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		byte kopo05_b = 1;  // kopo05_b ������ 1 �Է�  
		short kopo05_s = 2; // kopo05_s ������ 2 �Է�
		char kopo05_c = 'A'; // kopo05_c ������ A �Է�
		
		int kopo05_finger = 10;   // kopo05_finger ������ 10 �Է�
		long kopo05_big = 1000000000000000L;  // kopo05_big ������ 10000000000000000L �Է�
		long kopo05_hex = 0xFFFFFFFFFFFFFFL;  // kopo05_hex ������ 0xFFFFFFFFFFFFFFFL�Է�
		
		int kopo05_octNum = 010;    // kopo05_octNum�� 010 �Է�  
		int kopo05_hexNum = 0x10;   // kopo05_hexNum�� 0x10 �Է�
		int kopo05_binNum = 0b10;   // kopo05_binNum�� 0b10 �Է� 
		
		System.out.printf("b=%d%n", kopo05_b);  // kopo05_b ��� %d�� ���� ����ϰ� %n���� �ٶ��� 
		System.out.printf("s=%d%n", kopo05_s);  // kopo05_s ��� %d�� ���� ����ϰ� %n���� �ٶ���
		System.out.printf("c=%c, %d %n", kopo05_c, (int)kopo05_c);  // kopo05_c ��� %d�� ���� ����ϰ� %n���� �ٶ���
		System.out.printf("finger = [%5d]%n", kopo05_finger);  // kopo05_finger ��� %5d�� 5��° �ȿ� ����ϰ� %n���� �ٶ���
		System.out.printf("finger = [%-5d]%n", kopo05_finger); // kopo05_finger ��� %-5d�� ����� ������ 5��°���� ����ϰ� %n���� �ٶ���
		System.out.printf("finger = [%05d]%n", kopo05_finger); // %05d�� 5��°���� kopo05_finger ����ϰ� ������ 0���� ä�� %n���� �ٶ���
		System.out.printf("big=%d%n", kopo05_big);  // kopo05_big ������ ��� 
		System.out.printf("hex=%#x%n", kopo05_hex);  // kopo05_hex�� %x�� 16���� ������ ��� 
		System.out.printf("octNum=%o, %d%n", kopo05_octNum, kopo05_octNum);  // %o�� 8���� ������������ ��� 
		System.out.printf("hexNum=%x, %d%n", kopo05_hexNum, kopo05_hexNum);  // %x�� 16���� ������ ��� 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(kopo05_binNum),kopo05_binNum);  // kopo05_binNum�� toBinaryString���� �������� ���  
		
	}

}
