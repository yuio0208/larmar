package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { // try catch���� ������ ��� ��¹� ����
			File kopo05_f = new File("C:\\Users\\�����\\Desktop\\sense.txt"); // ��� ���� �� ���� kopo05_f�� ����
			FileWriter kopo05_fw = new FileWriter(kopo05_f); // FileWriter�� kopo05_fw�� ���� �Է�

			kopo05_fw.write("�ȳ� ����\n"); // kopo05_fw�� ���� �Է�
			kopo05_fw.write("hello ���\n"); // kopo05_fw�� ���� �Է�

			kopo05_fw.close(); // kopo05_fw ����

			FileReader kopo05_fr = new FileReader(kopo05_f); // kopo05_fr�� ���� ����

			int kopo05_n = -1; // kopo05_n�� -1�� ����
			char[] kopo05_ch; // �ѱ��ھ� �ִ� kopo05_ch �迭 ����

			while (true) { // while�� ����
				kopo05_ch = new char[100]; // kopo05_ch �迭�� 100���� �迭�� ����
				kopo05_n = kopo05_fr.read(kopo05_ch); // kopo05_ch�� �о� kopo05_n�� �Է�

				if (kopo05_n == -1)
					break; // �Է¹��� ���� -1�̸� ���߰� ����

				for (int kopo05_i = 0; kopo05_i < kopo05_n; kopo05_i++) { // kopo05_i�� �ʱⰪ�� 0, kopo05_i�� kopo05_n���� �۰�,
																			// kopo05_i�� 1�� �����ϰ� for�� ����
					System.out.printf("%c", kopo05_ch[kopo05_i]); // kopo05_ch�迭�� kopo05_i�� ���� �Է��ѵ� ���, %c�� ���� ���
				}
			}
			kopo05_fr.close(); // kopo05_fr ����

			System.out.printf("\n FILE READ END"); // ��¹� ����

		} catch (Exception e) { // ������ ����, ������ ���� ���ܽ�
			System.out.printf("���� [%s]\n, e"); // ���� ��¹� ����
		}

	}

}
