package Gaek;

public class G5 {

	int kopo05_Channel_up = 10; // �ִ� ä��
	int kopo05_Channel_down = 1; // �ּ� ä�� 
	int kopo05_Ch =1;  // �� ä�� 
	int kopo05_Vol_up = 5;  // �ִ� ����
	int kopo05_Vol_down = 1;  // �ּ� ���� 
	int kopo05_Vol = 1;   // ������ 

	String kopo05_help; // �ȳ�����

	void kopo05_Channelup() { // ä�� �ø��� �޼ҵ� 
		if (kopo05_Ch == kopo05_Channel_up) { // ���� ä���� �ִ�ä���� ��� 
			kopo05_help = "������ ä���Դϴ�"; // �ȳ����� ���� 

		} else { // ���� ������ �ִ� ������ �̸��� ��� 
			kopo05_Ch++; // ������ ++�� 1�� ���ذ� 
			kopo05_help = String.format("CHANNEL : %d", kopo05_Ch); // ���� ���� ä������ ���

		}
	}

	void kopo05_Channeldown() { // ä�� ������ �޼ҵ� 
		if (kopo05_Ch == kopo05_Channel_down) { // ���� ä���� �ּ�ä���� ��� 
			kopo05_help = "ù ä���Դϴ�"; // �ȳ����� ����
		} else { // ���� ä���� �ּ�ä�κ��� Ŭ ��� 
			kopo05_Ch--; // ä�� -1
			kopo05_help = String.format("CHANNEL : %d", kopo05_Ch); // ���� ���� ä������ ��� 
		}
	}
	

	void kopo05_Volup() { // ���� �ø��� �޼ҵ� 
		if (kopo05_Vol == kopo05_Vol_up) { // ���� �ִ� ������ ���
			kopo05_help = "�ִ� �����Դϴ�"; // �ȳ����� ���� 
		} else { // ���� ������ �ִ� �������� ���� ��� 
			kopo05_Vol++; // ä�ο� 1�� ���� 
			kopo05_help = String.format("Vol : %d", kopo05_Vol); // ���� ���� ��� 
		}
	}
	

	void kopo05_Voldown() { // ���� ������ �޼ҵ� 
		if (kopo05_Vol == kopo05_Vol_down) { // ���� ������ �ּ� ������ ��� 
			kopo05_help = "�ּ� �����Դϴ�"; // �ȳ����� ����
		} else { // ���� ������ �ּҺ������� Ŭ ��� 
			kopo05_Vol--; // ä�ο� -1�� �� 
			kopo05_help = String.format("Vol : %d", kopo05_Vol); // ���� ���� ���
		}
	}

}
