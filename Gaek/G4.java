package Gaek;

public class G4 {

	int kopo05_limit_up = 10;  // �ִ� �� 10������ ���� 
	int kopo05_limit_down = 1;  // �ּ� �� 1������ ���� 
	int kopo05_floor = 1;  	// ���� �� 
	String kopo05_help;    // �ȳ����� 

	void kopo05_up() {  // �ö󰡴� ���������� �޼ҵ� ����  
		if (kopo05_floor == kopo05_limit_up) {  // �������� �ִ� ���̶�� 
			kopo05_help = "���������Դϴ�";    // ������ �� ��� 

		} else {   // �׿ܿ��� 
			kopo05_floor++;  // �������� 1���� �ö󰥶� ���� 
			kopo05_help = String.format("%d���Դϴ�", kopo05_floor);  // ���� �������� ��� 

		}
	}

	void kopo05_down() { // �������� ���������� �޼ҵ� ���� 
		if (kopo05_floor <= kopo05_limit_down) { // ���� �������� ���  
			kopo05_help = "�������Դϴ�";   // ������ ��� 
		} else {  // ������ �̻��� ��� 
			kopo05_floor--;  // ������ ������������ 
			kopo05_help = String.format("%d���Դϴ�", kopo05_floor); // �������� ��� 
		}
	}

}
