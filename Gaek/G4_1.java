package Gaek;

public class G4_1 {

	private static int kopo05_inVal;  // �������� kopo05_inVal����  

	public static void kopo05_up() {  // �޼ҵ� ���� 
		kopo05_inVal++;   // �������� kopo05_inVal�� 1�� ���� 
		System.out.printf("�޼ҵ�[%d]\n", kopo05_inVal); // kopo05_inVal�� ��� 
	}

	public static void main45(String[] args) {
		// TODO Auto-generated method stub

		kopo05_inVal = 0;   // kopo05_inVal�� ���� 0 ���� 
		G4 kopo05_elev;    // kopo05_elev ��ü ���� 

		kopo05_elev = new G4();  // kopo05_elev ��ü ���� 

		kopo05_up(); // ���� Ŭ�������� �޼ҵ� ȣ�� �ʱⰪ�� 0���� �߰� ++�� ���༭ 1�� ���� �� 
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) { // 10�� �ݺ� 
			kopo05_elev.kopo05_up();   // G4 Ŭ������ �޼ҵ� 
			// 0���� 9���� 10�� �ݺ��ϴµ� kopo05_up�� �ʱⰪ�� 1�� ++�� 2���� �����ؼ� 10�� ���� ���������Դϴ� ��±��� �� 10�� �ݺ�  
			// �ֻ����� �ƴ� �� �� ���� �ö� 
			System.out.printf("MSG[%s}\n", kopo05_elev.kopo05_help); // G4 Ŭ������ ���� ���

		}
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {   // 10�� �ݺ� 
			kopo05_elev.kopo05_down();     // G4 Ŭ������ �޼ҵ� 
			// kopo05_down �޼ҵ带 ������ ���µ� ������ ����ϱ������� --�� 1�� �پ��� ��� 
			// �������� �ƴ� �� ���� �� �ö� 
			System.out.printf("MSG[%s]\n", kopo05_elev.kopo05_help); // G4 Ŭ������ ���� ���

		}

	}

}
