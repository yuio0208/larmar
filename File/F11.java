package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F11 {

	public static void main14(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv");  // �о�� ���� ������ ��ü ���� 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // ���� �б� ��ü kopo05_br ���� 
		// �ұ� ���� ������ ���� Charset.forName("MS949")�� ���ڵ� ����
		

		File kopo05_f1 = new File("C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\MaxMin.csv"); // �ۼ��� ���ϰ�ü ���� 
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_f1)); // ���� ���� ��ü ���� 

		String kopo05_readtxt; // �о�� ���� �ӽ÷� ������ ���ڿ� 
		
		int kopo05_Cnt = 0;  // ������ �� 
		int kopo05_wcnt = 0;  // ��ȿ������ �� 

		int kopo05_Min = Integer.MIN_VALUE;
		int kopo05_Max = Integer.MAX_VALUE;
		
		
		
		
		while ((kopo05_readtxt = kopo05_br.readLine()) != null) {  // ���� ������ 
 
			StringBuffer kopo05_s = new StringBuffer();   // ���ڿ� ������ ���� 
			String[] kopo05_field = kopo05_readtxt.split(",");    // "%_%"�� �����Ͽ� ������ ������ �迭�� ���� 

			if (kopo05_field.length > 2 && kopo05_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { // Ư������ ���� �� 3��° �ʵ尡 A�� �����ϴ� ��� 
				kopo05_s.append("," + kopo05_field[0].replace("^", "").trim()); // ù��° �ʵ� ���ۿ� �߰� 
				for (int kopo05_j = 1; kopo05_j < kopo05_field.length; kopo05_j++) {    // ������ �ʵ� 
					kopo05_s.append("," + kopo05_field[kopo05_j].replace("^", "").trim());  // �޸��� �����Ͽ� ���ۿ� �߰� 

				}
				kopo05_bw.write(kopo05_s.toString()); // ������� �� ���� �����͸� ���Ͽ� �ۼ� 
				kopo05_bw.newLine();   // ���� 
				kopo05_wcnt++;   // ��ȿ ������ ī��Ʈ 

				
				
				
			}
			

			kopo05_Cnt++;   // �о�� ������ ī��Ʈ 
		}
		kopo05_br.close();  // ���� ������ ��ü ���� 
		kopo05_bw.close();  // ���� �ۼ� ��ü ���� 

		System.out.printf("Program End[&d][%d]records\n", kopo05_Cnt, kopo05_wcnt);  // �� ������, ��ȿ������ �� ��� 

	}

}

