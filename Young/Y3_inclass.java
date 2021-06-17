package Young;

import java.io.UnsupportedEncodingException;

public class Y3_inclass {

	String[] kopo05_ItemName = { "��Ǫ", "����", "ü������", "������ �÷�", "��Ĩ", "����", "���� ��ټ�", "������", "��ġ���", "�����ֽ�", 
			"�佺��", "����", "ũ��ġ��", "����ƽ", "�����糢 «��", "����", "�縻", "��ä", "�ڵ�ũ��", "�̾���",
			"Ŀ��", "���۶�", "�ݶ�", "���̴�", "�ڸ��Ҵ�", "Ŀư", "������", "�����", "����", "����" };   // �� ǰ��� ���� 

	int[] kopo05_Price = { 12000, 15000, 10000, 2000, 2000, 1000, 1300, 1200, 1500, 2000,
			4000, 4000, 4000, 3000, 3000, 8000, 2000, 2000, 4000, 9000,
			1000, 40000, 2000, 2000, 1700, 70000, 3000, 2000, 16000, 5000 };   // �� ǰ�� ���� ���� 

	int[] kopo05_SuRyang = { 1, 1, 1, 10, 5, 2, 7, 8, 9, 9, 
			1, 1, 5, 3, 9, 1, 2, 4, 7, 8, 
			5, 2, 1, 9, 8, 4, 2, 1, 3, 6 };    // �� ǰ�� ���� ���� 
	
	boolean [] kopo05_TaxFree = {true, true, false, false, false, true, false, true, false, false, 
			false, true, true, false, true, false, true, true, false, true,
			false, true, false, true, true, false, true, false, true, true};   // �� ǰ�� �鼼 ���� ���� 
	
	
	public static String kopo05_stringByBytes(String kopo05_inputString, int kopo05_stringWidth) throws UnsupportedEncodingException {
		for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth; kopo05_i++) { // �� ���ڿ� ������ ���� kopo05_stringWidth���� ���� ���ڿ��� �ʺ� ���� 
			kopo05_inputString += " ";   // ���� ���ڿ��� ���� �ʺ�ŭ ���� ���ڸ�ŭ ������ ����
		}

		int kopo05_widthByte = 0; // ����Ʈ ���� ���γʺ�
		int kopo05_cutIndex = 0;   // �߶� �ε��� 
		char kopo05_temp = ' ';   // ���ڿ� �� �� ���� 
		for (int kopo05_i = 0; kopo05_i < kopo05_inputString.length(); kopo05_i++) {  //���ڿ� ��ü 
			kopo05_temp = kopo05_inputString.charAt(kopo05_i);  // �� ���ڸ� char�� �޾Ƽ� kopo05_temp�� �Է�  
			if (Character.getType(kopo05_temp) == 5) {    //  kopo05_temp�� ���� character type�� 5�� ��� �ѱ� 
				kopo05_widthByte += 2;   // �ѱ� ���� �ʺ� 2 �߰� 
			} else {    // �ѱ��� �ƴ� ��� 
				kopo05_widthByte += 1;  // �ѱ� �� ���� �ʺ� 1 �߰� 
			}
			kopo05_cutIndex++;     // �߶� �ε��� 1 �߰� 
			if (kopo05_widthByte > kopo05_stringWidth) {  // ������ �ִ� �ʺ񺸴� Ŭ ��� 
				kopo05_cutIndex--;  // �ѱ��� �տ��� �ڸ����� �� 
				break; // ���� 
			}
		}
		String kopo05_rename = kopo05_inputString.substring(0, kopo05_cutIndex); // ������ �ε��� �ձ��� �ڸ��� 

		//���� �ʺ� üũ 
		int kopo05_newWidth = kopo05_rename.getBytes("EUC-KR").length; // �ѱ� 2����Ʈ�� ������ �ʺ� = ����Ʈ ����  
		if (kopo05_newWidth < kopo05_stringWidth) {  // ������ �ִ� �ʺ񺸴� ���� ��� 
			for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth - kopo05_newWidth; kopo05_i++) { // ���� �ڸ� ��ŭ 
				kopo05_rename += " ";  // ���� �߰� 
			}
		}
		return kopo05_rename;  //���ο� ǰ��� ��ȯ

	}

}
