package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class F8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\THTSKS010H00.dat"); // ���� ��ü ���� 
																														
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f)); // ���� �б� ��ü ����

		int kopo05_LineCnt = 0; // �о�� ������ �� ��
		int kopo05_n = -1; // �о�� ���� ����

		StringBuffer kopo05_s = new StringBuffer(); // ���ڿ� ������ ���� �ν��Ͻ� s

		while (true) { // �ݺ���

			char[] kopo05_ch = new char[1000]; // �о�� ���ڿ��� �ӽ÷� ������ �迭 kopo05_ch ��ü

			kopo05_n = kopo05_br.read(kopo05_ch); // �迭 ���·� �о�� ���� ����

			if (kopo05_n == -1) break; // ���̻� �о�� ���ڰ� ���� ���

			for (char kopo05_c : kopo05_ch) { // �о�� ��� ���ڿ�
				if (kopo05_c == '\n') { // ���๮���� ���
					System.out.printf("[%s]***\n", kopo05_s.toString()); // �ۼ��� ��Ʈ�� ���� ���
					kopo05_s.delete(0, kopo05_s.length()); // ���� �ʱ�ȭ
				} else { // ���๮�� ������
					kopo05_s.append(kopo05_c); // ��Ʈ�����ۿ� �о�� ���� �߰� 
					// append �޼ҵ�� �μ��� ���޵� ���� ���ڿ��� ��ȯ�� �ش� ���ڿ��� �������� �߰� 
				}

			}

			kopo05_LineCnt++; // �о�� �� �� ī��Ʈ 

		}

		System.out.printf("[%s]***\n", kopo05_s.toString());  // ������ �� ��� 
		kopo05_br.close();  // ���� �б� ���� 

	}
}