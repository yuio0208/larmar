package variable;

public class V12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kopo05_i = 91234567; // kopo05_i�� 91234567�Է�  
		float kopo05_f = (float)kopo05_i; // kopo05_i�� float�������� ��ȯ�� kopo05_f�� �Է� 
		int kopo05_i2 = (int)kopo05_f; // kopo05_f�� int�� ��ȯ�� kopo05_i2�� �Է�
		
		double kopo05_d = (double)kopo05_i;  // kopo05_i�� double�������� ��ȯ�� kopo05_d�� �Է� 
		int kopo05_i3 = (int)kopo05_d; // kopo05_d�� int �������� ��ȯ �� kopo05_i3�� �Է� 
		
		float kopo05_f2 = 1.666f;   // kopo05_f2�� 1.666f �Է� 
		int kopo05_i4 = (int)kopo05_f2;  // kopo05_f2�� int�������� ��ȯ�� kopo05_i4�� �Է� 
		
		System.out.printf("kopo05_i = %d\n", kopo05_i);     // kopo05_i���
		System.out.printf("kopo05_f = %f kopo05_i2 = %d\n", kopo05_f, kopo05_i2);  // kopo05_f�� kopo05_i2 ��� 
		System.out.printf("kopo05_d = %f kopo05_i3 = %d\n", kopo05_d, kopo05_i3);  // kopo05_d�� kopo05_i3 ��� 
		System.out.printf("(int)%f = %d\n", kopo05_f2, kopo05_i4);  // kopo05_f2�� kopo05_i4 ��� 

		
		
		
	}

}
