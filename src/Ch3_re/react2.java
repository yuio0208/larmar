package Ch3_re;

import java.util.Scanner;

public class react2 {

	public static void main222(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			String text = sc.nextLine();
			
			for (int i = 0; i < text.length(); i++) { // text�� ���̸�ŭ �ݺ� 
				if (text.charAt(i) >= (int)'A' && text.charAt(i) <= (int)'Z') {  // text�� ù�ں��� ��ҹ��� ����
					System.out.print((char)(text.charAt(i) + 32));			// �빮�ڶ�� �ҹ��ڷ� ���� �� ���		
				} else if (text.charAt(i) >= (int)'a' && text.charAt(i) <= (int)'z') {
					System.out.print((char)(text.charAt(i) - 32));  // �ҹ��ڸ� �빮�ڷ� ���� �� ��� 
				
				} else if (text.charAt(i) == ' ') {           // ���⾲�� ��� �� ��µǰ�  
					System.out.print((char)text.charAt(i));   //
				}
					
			}  
	}
}
