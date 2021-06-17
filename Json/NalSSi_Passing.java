package Json;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class NalSSi_Passing {

	

		
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
