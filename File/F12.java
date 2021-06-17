package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class F12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv");  // �о�� ���� ������ ��ü ���� �ֽ��� ��ü �����͸� ������ 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // ���� �б� ��ü kopo05_br ���� 
		// �ұ� ���� ������ ���� Charset.forName("MS949")�� ���ڵ� ����
		
		
		
		String kopo05_readtxt;  // �о�� ���� �ӽ÷� ������ ���ڿ� 
		
		int kopo05_Max = Integer.MIN_VALUE;  // kopo05_Max���� ���ϱ� ���ؼ� �ּҰ��� �־��༭ �����ش� kopo05_Max������ ũ�� �� ���� kopo05_Max�� �־��༭ �ִ밪�� ���Ѵ� 
		int kopo05_Min = Integer.MAX_VALUE;  // kopo05_Min���� ���ϱ� ���ؼ� �ִ밪�� �־��༭ �����༭ kopo05_Min������ ������ �װ��� kopo05_Min���� �־��ش� 
		

		
		while((kopo05_readtxt = kopo05_br.readLine()) != null){ // �о�� ������ readLine�� ���پ� �о� 
			String [] kopo05_field = kopo05_readtxt.split(","); // , �� ������ kopo05_field �迭�� �־��ش� 
			
			
	
			
			if (kopo05_field[2].equals("A005930") && kopo05_field[1].contains("2007")) { // �迭�� 3��° ���� �Ｚ���� �����ڵ��̸鼭 2��° ���� 2007���� �ڷ�
																							 

				if (kopo05_Min > Integer.parseInt(kopo05_field[3])) { // �迭�� 4��° ���� �ְ� �װ��� kopo05_Min�� ���ؼ� ���� �۾��������� �� 
					kopo05_Min = Integer.parseInt(kopo05_field[3]);   //  ��� �ݺ��ؼ� ���� ���� ���� kopo05_Min�� �־���

				} else if (kopo05_Max < Integer.parseInt(kopo05_field[3])) {  // kopo05_Max�� �迭�� 4��°�� ���ؼ� kopo05_Max���� ���� ū���� ����� �ٷ��� kopo05_Max���� �ּҰ����� �����ؼ� ��� �����༭ Ű���� �� 
					kopo05_Max = Integer.parseInt(kopo05_field[3]);    // ���� ū���� kopo05_Max�� �־��� 

				}

			}

		}
		kopo05_br.close();  // kopo05_br ���� 
		System.out.println("�ִ밪" + kopo05_Max);  // �ְ� �ִ밪 ��� 
		System.out.println("�ּҰ�" + kopo05_Min);  // �ְ� �ּҰ� ��� 

	}

}
