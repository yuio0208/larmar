package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F3 {

	public static void main7(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\���������������2.csv"); // csv������ ������ kopo05_f�� �Է� 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f));  // ��뷮�̱⿡ BufferedReader�� �о� kopo05_br�� �Է� 

		String kopo05_readtxt;  // kopo05_readtxt ��Ʈ�� ���� ���� 

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) {   //  kopo05_br�� readLine���� �дµ� �� ���� ������� ��� 
			System.out.printf("�� �����Դϴ�\n");   // �� �����Դϴ� ��¹� ���� 
			return;
		}
		String[] kopo05_field_name = kopo05_readtxt.split(","); // ���� ������� ,�� �������� �ڸ��� �װ��� kopo05_field_name�� �迭�� ����   

		int kopo05_LineCnt = 0;  // kopo05_LineCnt���� ���� ��  
		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // ���� ������� ������� ���� ��� while ���ǹ����� 

			String[] kopo05_field = kopo05_readtxt.split(","); //  ���� ������� ,�� �������� �ڸ��� �װ��� kopo05_field�� �迭�� ����   
			System.out.printf("**[%d��° �׸�]************************************\n", kopo05_LineCnt+1); // �׸� ��ȣ �ο� 
			for (int kopo05_j = 0; kopo05_j < kopo05_field_name.length; kopo05_j++) {     // kopo05_j�� �ʱⰪ, kopo05_field_name.length���� �۰� �����ϰ� 1�� �����ϰ� ���� 
				System.out.printf(" %s : %s\n", kopo05_field_name[kopo05_j], kopo05_field[kopo05_j]); // kopo05_field_name�� kopo05_field�迭�� 0��°���� %s : %s�� csv������ �� ������ ǥ��
			}
			System.out.printf("****************************************************\n");
			if (kopo05_LineCnt == 99)  // 0���� �����̿����� 99�����ؼ� 100���� ������ �����  
				break;  // ����
			kopo05_LineCnt++; // while���� �ѹ��� �������� �����ٷ� �Ѿ�� �ٽ� while�� ���� 
		}
		kopo05_br.close();   // kopo05_br�� �ݾ��� 
	}

}
