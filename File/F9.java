package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class F9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_StockDailyPrice = new File(
				"C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv"); // �о�� ���� ��ü ����
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_StockDailyPrice)); // ���� �б� ��ü ����

		File kopo05_A005930 = new File("C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\A005930.csv"); // �ۼ���
																														// ���ϰ�ü
																														// ����
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_A005930)); // ���� ���� ��ü ����

		String kopo05_readtxt; // �о�� ������ �ӽ� ������ ����

		int kopo05_Cnt = 0; // ������ ��

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // ���� ������

			StringBuffer kopo05_s = new StringBuffer(); // ���ڿ� ������ ����
			String[] kopo05_field = kopo05_readtxt.split(","); // ","�� �����Ͽ� ������ ������ �迭�� ����

			if (kopo05_field[2].equals("A005930")) {    // ��ǥ�� �ڸ� �迭�� 3��°�� �ִ� ���� �Ｚ���� �����ڵ常�� �����´�
				kopo05_s.append( kopo05_field[0].trim()); // ù��° �ʵ� �߰� 
				for (int kopo05_i = 1; kopo05_i < kopo05_field.length; kopo05_i++) {  // ������ �ʵ� �߰�  
					kopo05_s.append("," + kopo05_field[kopo05_i].trim());  // ,�� �����ؼ� �߰� 

				}
				kopo05_bw.write(kopo05_s.toString()); // ������� �� ���� �����͸� ���Ͽ� �ۼ�
				kopo05_bw.newLine(); // ����
				kopo05_Cnt++; // ��ȿ ������ ī��Ʈ

			}

		}
		kopo05_br.close(); // ���� �б� ��ü ����
		kopo05_bw.close(); // ���� �ۼ� ��ü ����

		System.out.printf("Program End[&d]records\n", kopo05_Cnt); // ������ ��� 

	}

}
