package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F5_1 {

	public static void main4(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\���������������ǥ�ص�����.txt");  // �о�� ���� ������ ��ü ���� 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // ���� �б� ��ü kopo05_br ���� 
		// �ұ� ���� ������ ���� Charset.forName("MS949")�� ���ڵ� ����
		String kopo05_readtxt; // �о�� ���� �ӽ÷� ������ ���ڿ� 

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) {  // ù�� �б�(�ʵ�)
			System.out.printf("�� �����Դϴ�\n");  // ù���� null�̸� �� ���� 
			return; // �Ʒ� �ڵ� �������� �ʰ� ���� 

		}
		String[] kopo05_field_name = kopo05_readtxt.split("\t");  // ù���� ������ ������ �ʵ� �� �迭�� ���� 

		double kopo05_lat = 37.3860521;  // ���� ���� ���� 
		double kopo05_lng = 127.1214038;  // ���� �浵 ���� 

		int kopo05_LineCnt = 0; // �о�� �� �� 
		
		double kopo05_min = Double.MAX_VALUE;   // kopo05_min���� ������ ��� ������ �� ���� 
		double kopo05_max = Double.MIN_VALUE;   // kopo05_max���� ������ ��� ������ �� ����
		String kopo05_minadd = "";               // kopo05_minadd�� �ּҰŸ� �ּҼ��� 
		String kopo05_maxadd = "";				// kopo05_maxadd�� �ִ�Ÿ� �ּҼ���
		

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // ���̻� �о�� ������ ���� ������ while������ �ݺ� 

			String[] kopo05_field = kopo05_readtxt.split("\t");  // �о�� ���� ������ ������ kopo05_field�� �迭�� ���� 
			if ((kopo05_field[12].equals("") || kopo05_field[12] == null)   // kopo05_field[12]�� ����, ���� ������ �����̰ų� 
					|| (kopo05_field[13].equals("") || kopo05_field[13] == null)) { // kopo05_field[13]�� �浵, �浵 ������ �����̸�  

				System.out.printf("���� : %s ��°\n", kopo05_LineCnt);  //���ܻ��� ��� 
				kopo05_LineCnt++;  // �� �� �߰��ؼ� ���� �� ���  
				continue;  // �Ʒ� �ڵ� �������� �ʰ� while�� ó������ 

			}
			
			if (kopo05_field[8].isEmpty()) {  // ���� kopo05_field�� �迭 8��°�� ����ִٸ�  
				kopo05_field[8] = kopo05_field[9];   // kopo05_field�� �迭 8��°�� ���� kopo05_field�� �迭 9��° ���� �ִ´� 
			}
			

			System.out.printf("************[%d��° �׸�]*****************************\n", kopo05_LineCnt + 1); // ���° �׸����� ��� 
			System.out.printf("%s : %s\n", kopo05_field_name[9], kopo05_field[9]);                             // �Ʊ� ������ kopo05_field_name�� �迭�� �־��� ���� ���������ؼ� kopo05_field[9]�� ���� �ּҸ� �־���  
			System.out.printf("%s : %s\n", kopo05_field_name[12], kopo05_field[12]);							// �Ʊ� ������ kopo05_field_name�� �迭�� �־��� ���� ���������ؼ� kopo05_field[12]�� ���� ������ �־��� 
			System.out.printf("%s : %s\n", kopo05_field_name[13], kopo05_field[13]);							// �Ʊ� ������ kopo05_field_name�� �迭�� �־��� ���� ���������ؼ� kopo05_field[13]�� ���� �浵�� �־��� 
			double kopo05_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo05_field[12]) - kopo05_lat, 2)      
					+ Math.pow(Double.parseDouble(kopo05_field[13]) - kopo05_lng, 2));
			// �Ÿ� = sqrt(pow(������ ���� - ���� ����), 2) + pow(������ �浵 - ���� �浵), 2))
						// ��Ÿ��� ���� sqrt(pow(a-c),2) + pow((b-d), 2))
			
			if (kopo05_min > kopo05_dist) {   // kopo05_min�� kopo05_dist���� ũ�� 
				kopo05_min = kopo05_dist;    // kopo05_dist���� kopo05_min������ ������ ����ؼ� ��
				kopo05_minadd = kopo05_field[8];  //  kopo05_min�� kopo05_dist���� ũ�� kopo05_field�� �迭 8��° ����  kopo05_minadd �ּҰŸ� �ּ� ������ �־��� 
				
			} 
			if (kopo05_max < kopo05_dist) {  // kopo05_max�� kopo05_dist���� ������ 
				kopo05_max = kopo05_dist;   // kopo05_dist���� kopo05_max������ ������ ����ؼ� ��
				kopo05_maxadd = kopo05_field[8];  //  kopo05_max�� kopo05_dist���� ������ kopo05_field�� �迭 8��° ����  kopo05_maxadd �ִ�Ÿ� �ּ� ������ �־��� 
				
			}
			
			

			
			
			System.out.printf("���������� �Ÿ� : %f\n", kopo05_dist);  // �Ÿ� ��� 
			System.out.printf("*********************************************************\n");   // ���м� ��� 
			kopo05_LineCnt++;   // �׸� ��ȣ 1

		}
		System.out.printf("�ּҰŸ�: %f, �ּҰŸ� �ּ� : %s\n", kopo05_min, kopo05_minadd);   // �ּҰŸ�, �ּҰŸ� �ּ� ��� 
		
		System.out.printf("�ִ�Ÿ�: %f, �ִ�Ÿ� �ּ� : %s\n", kopo05_max, kopo05_maxadd);   // �ִ�Ÿ�, �ִ�Ÿ� �ּ� ��� 

		kopo05_br.close();  // ���� �б� ��ü ���� 

	}

}
