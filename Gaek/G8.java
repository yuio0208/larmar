package Gaek;

public class G8 {

	
	private int kopo05_limit_up_floor;  // �ְ��� 
	private int kopo05_limit_down_floor;   // ������ 
	private int kopo05_floor;   // ������ 
	private String kopo05_help;  // �ȳ����� 
	
	
	G8() {   // �����ڷ� ���� �ʱ�ȭ, Ŭ������ ȣ��Ǿ ������ ����ǰ� �޼ҵ� ���� 
		kopo05_limit_up_floor = 10; // �ְ��� ���� 
		kopo05_limit_down_floor = 1;  // ������ ���� 
		kopo05_floor = 1;    // ������ ���� 
		kopo05_help = "���������� �⺻ �ذ��Ϸ�"; // �ȳ����� ���� 
		
	}
	
	G8(int up_floor, int d_floor, int in_floor) { // �Է��� ���ڰ����� �ʱ�ȭ�ϴ� ������ 
		kopo05_limit_up_floor = up_floor;   // ù �Է°��� �ְ������� ���� 
		kopo05_limit_down_floor = d_floor;   // �ι�° �Է°��� ���������� ����
		kopo05_floor = in_floor; // ����° �Է°��� ���������� ����
		kopo05_help = "���������� ���� �ذ��Ϸ�";  // �ȳ����� ���� 
	}
	
	void kopo05_up() {   // ���������� �ø��� �޼ҵ� 
		if(kopo05_floor == kopo05_limit_up_floor) {  // �������� �ְ����� ��� 
			kopo05_help = "������ ���Դϴ�";   // �ȳ����� 
		}else {     // �ְ����� �̸��� ��� 
			kopo05_floor++;  // ������ +1�� 
			kopo05_help = String.format("[%d] ���Դϴ�", kopo05_floor); // �ȳ������� ������ ��� 
			
		}
	}
	void kopo05_down() {  // ���������� ������ �޼ҵ� 
		if(kopo05_floor == kopo05_limit_down_floor) {  // �������� �������� ��� 
			kopo05_help = "ó�� ���Դϴ�";   // �ȳ����� 
		}else {  // ������ �ʰ��� ��� 
			kopo05_floor--;   // ���� -1��
			kopo05_help = String.format("[%d] ���Դϴ�", kopo05_floor);  // �ȳ������� ������ ���
			
		}
	}
	
	void kopo05_up(int kopo05_u) {  // ���������� n�� �ø��� �޼ҵ� 
		for(int kopo05_i = 0; kopo05_i < kopo05_u; kopo05_i++) // n�� 
			this.kopo05_up();  // �� Ŭ������ ���� ���� ���������� �ø��� �޼ҵ� �ݺ� ���� 
		
	}
	
	void kopo05_down(int kopo05_u) {  // ���������� n�� ������ �޼ҵ�
		for(int kopo05_i = 0; kopo05_i < kopo05_u; kopo05_i++) // n��
			this.kopo05_down();  // �� Ŭ������ ���� ���� ���������� ������ �޼ҵ� �ݺ� ���� 
	

	}
	
	void kopo05_msg(String kopo05_id) {   //  �޼��� ��� �޼ҵ� 
		System.out.printf("%s =>[%s]  �ִ���[%d] �ּ���[%d]  ������[%d]\n", kopo05_id, kopo05_help, 
				kopo05_limit_up_floor, kopo05_limit_down_floor, kopo05_floor);
		// ���ڷ� ���� ���ڿ�, �ȳ�����, �ִ���, �ּ���, ������ ��� 
		
	}
	
	void Repair() {
		kopo05_help = String.format("�������Դϴ�");
		
	}
	
	
	
	
	
	
	
}
