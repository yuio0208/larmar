package variable;

import java.util.Scanner;

public class V5 {

	public static void main45(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kopo05_sc = new Scanner(System.in); // Scanner�� kopo05_sc ��ü ���� 
		
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���. >");  // ��¹� ���� 
		
		String kopo05_input = kopo05_sc.next();        // kopo05_sc �ڿ� ���� ���ڸ� kopo05_input�� �־��� 
		int kopo05_num = Integer.parseInt(kopo05_input);    // kopo05_input�� int�� �ٲ۰��� kopo05_num�� �־��� 
		
		System.out.println("�Է³��� :" + kopo05_input);  // kopo05_input ����� ��� 
		System.out.printf("num = %d%n", kopo05_num);  // kopo05_num��� ��� 
		
		
		
	}

}
