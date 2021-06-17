package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class F5 {

	public static void main75(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\���������������ǥ�ص�����.txt"); // �о�� ���� ������ ��ü ���� ���� �б� ��ü kopo05_br ����
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949")));  
																											 
																											
		// �ұ� ���� ������ ���� Charset.forName("MS949")�� ���ڵ� ����
		String kopo05_readtxt; // �о�� ���� �ӽ÷� ������ ���ڿ�

		ArrayList<String> kopo05_distList = new ArrayList<String>();

		double kopo05_lat = 37.3860521; // ���� ���� ����
		double kopo05_lng = 127.1214038; // ���� �浵 ����
		double kopo05_dist = 0;
		double kopo05_near = 0;
		String kopo05_nearAddr = "";
		double kopo05_far = 0;
		String kopo05_farAddr = "";

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) { // ù�� �б�(�ʵ�)
			System.out.printf("�� �����Դϴ�\n"); // ù���� null�̸� �� ����
			return; // �Ʒ� �ڵ� �������� �ʰ� ����

		}

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // ���̻� �о�� ������ ���� ������ while������ �ݺ�

			String[] kopo05_field = kopo05_readtxt.split("\t"); // �о�� ���� ������ ������ kopo05_field�� �迭�� ����
			if ((kopo05_field[12].equals("") || kopo05_field[12] == null) // kopo05_field[12]�� ����, ���� ������ �����̰ų�
					|| (kopo05_field[13].equals("") || kopo05_field[13] == null)) { // kopo05_field[13]�� �浵, �浵 ������ �����̸�
				continue;

			}

			kopo05_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo05_field[12]) - kopo05_lat, 2)
					+ Math.pow(Double.parseDouble(kopo05_field[13]) - kopo05_lng, 2));

			// �Ÿ� = sqrt(pow(������ ���� - ���� ����), 2) + pow(������ �浵 - ���� �浵), 2))
			// ��Ÿ��� ���� sqrt(pow(a-c),2) + pow((b-d), 2))

			if ((kopo05_field[8].equals("") || kopo05_field[8] == null) // kopo05_field[12]�� ����, ���� ������ �����̰ų�
					|| (kopo05_field[8].equals("") || kopo05_field[9] == null)) {

			}

			kopo05_distList.add((float) kopo05_dist + "@" + kopo05_field[8]);

		}
	
		
	}

	
	

}
