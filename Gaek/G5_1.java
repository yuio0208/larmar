package Gaek;

public class G5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		G5 kopo05_remote = new G5();  // ������ ��ü ���� 

		System.out.println("===== ä�κ��� =====");  // ���� ���� 

		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {   // ä�� �ø��� 10����
			kopo05_remote.kopo05_Channelup();   // ä�� �ø��� �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);   // �ȳ��� ��� 
		}
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {  // ä�� ������ 10���� 
			kopo05_remote.kopo05_Channeldown();   // ä�� ������ �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // �ȳ��� ��� 

		}

		System.out.println("===== �������� =====");   // ���� ���� 

		for (int kopo05_i = 0; kopo05_i < 5; kopo05_i++) {   // ���� �ø��� 5���� 
			// 0���� 4�������� kopo05_Volup �޼ҵ忡�� �ִ뺼�� kopo05_Vol_up�� 5�� �ɶ����� +1�� ������ 5���Ǹ� �ȳ��� ��� 
			kopo05_remote.kopo05_Volup();    // ���� �ø��� �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // �ȳ��� ��� 
		}
		for (int kopo05_i = 0; kopo05_i < 5; kopo05_i++) {   // ���� ������ 5���� 
			kopo05_remote.kopo05_Voldown();    // ���� ������ �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // �ȳ��� ��� 

		}

	}

}
