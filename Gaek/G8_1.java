package Gaek;

public class G8_1 {

	static G8 kopo05_elev1;  
	static G8 kopo05_elev2;
	static G8 kopo05_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kopo05_elev1 = new G8();   // �⺻ ���������� 
		kopo05_elev2 = new G8(20, 1, 8);  // �����ڷ� ���� 3���϶� �޼ҵ带 �����س��
		kopo05_elev3 = new G8(50, -3, 5);  // �����ڷ� ���� 3���϶� �޼ҵ带 �����س�� 

		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0���� 20���� ��� ��� 
			kopo05_elev1.kopo05_up();  //  kopo05_up �޼ҵ� ȣ�� 
			kopo05_elev1.kopo05_msg("1������ ���� ������"); // �ȳ����� ��� 

		}
		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0���� 20���� ��� ��� 
			kopo05_elev2.kopo05_up(2);  //  kopo05_up �޼ҵ� ȣ�� 
			kopo05_elev2.kopo05_msg("1������ 2���� ������"); // �ȳ����� ��� 
 
		}
		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0���� 20���� ��� ��� 
			kopo05_elev3.kopo05_up(3);  //  kopo05_up �޼ҵ� ȣ�� 
			kopo05_elev3.kopo05_msg("1������ 3���� ������"); // �ȳ����� ��� 

		}
	}

}
