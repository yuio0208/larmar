package Young;

import java.io.UnsupportedEncodingException;

public class Y2_inclass {
	
	String kopo05_itemname1 = "���̱�����A 500ml";     //  kopo05_itemname1�� ǰ��1�� ǰ��� �Է�
	String kopo05_itemname2 = "�Ϻ��� ���̺���";			//  kopo05_itemname2�� ǰ��2�� ǰ��� �Է�
	String kopo05_itemname3 = "�����ǰ� INTENSIV TONIC";    //  kopo05_itemname3�� ǰ��3�� ǰ��� �Է�

	String kopo05_itemcode1 = "[6815484]";               // kopo05_itemcode1�� ǰ��1�� ǰ���ڵ� �Է� 
	String kopo05_itemcode2 = "[6515321]";				// kopo05_itemcode2�� ǰ��2�� ǰ���ڵ� �Է�
	String kopo05_itemcode3 = "[9841531]";				// kopo05_itemcode3�� ǰ��3�� ǰ���ڵ� �Է�

	int kopo05_price1 = 5000;							//kopo05_price1�� ǰ��1�� ���� �Է�                  
	int kopo05_price2 = 9000;							//kopo05_price2�� ǰ��2�� ���� �Է�
	int kopo05_price3 = 13000;							//kopo05_price3�� ǰ��3�� ���� �Է� 

	int kopo05_amount1 = 10;								//kopo05_amount1�� ǰ��1�� ���� �Է�
	int kopo05_amount2 = 3;								//kopo05_amount2�� ǰ��2�� ���� �Է�
	int kopo05_amount3 = 2;								//kopo05_amount3�� ǰ��3�� ���� �Է�

	
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
