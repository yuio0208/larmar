package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F2 {

	public class FileReadWrite {  // FileReadWrite Ŭ���� ���� 

	}

	public static void kopo05_FileWrite() throws IOException {  // kopo05_FileWrite �Լ� ����  ����ó������ 
		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\nHome.txt");  //  ����ȭ�鿡 ���� �Է��� ���ο� txt���� ���� 
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_f));  // kopo05_f���Ͽ� �� �Է� BufferedWriter�� ���� ������ ��뷮�� �����ϱ� ����   

		kopo05_bw.write("�ȳ� ����");   // ���� �Է�
		kopo05_bw.newLine();        // �� ���� 
		kopo05_bw.write("hello");    // ���� �Է� 
		kopo05_bw.newLine();     // �� ���� 
		kopo05_bw.write("Juice wrld");

		kopo05_bw.close(); // kopo05_bw �ݱ� ������ ��� ���������� ������ �� ����

	}

	public static void kopo05_FileRead() throws IOException {  // kopo05_FileRead �Լ� ���� ����ó���� 
		File kopo05_f = new File("C:\\Users\\�����\\Desktop\\nHome.txt");   // kopo05_f������ ��� ���� 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f));  // kopo05_f�� ���� 

		String kopo05_readtxt;   // kopo05_readtxt String���� ���� 

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) {  //kopo05_readtxt�� readLine���� ���� ������ �дµ� null�� �ƴҶ����� �ݺ���
			System.out.printf("%s\n", kopo05_readtxt);   // �� ������ ��� 

		}
		kopo05_br.close();  //  kopo05_br���� �ݱ� 

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		kopo05_FileWrite();  // kopo05_FileWrite �Լ� ����
		kopo05_FileRead();   // kopo05_FileRead �Լ� ����

	}

}
