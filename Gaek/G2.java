package Gaek;

public class G2 {

	static int kopo05_static;  // class���� ���� ���� kopo05_static ���� 

	public static void main5(String[] args) {
		// TODO Auto-generated method stub

		int kopo05_main = 1; // kopo05_main�� 1�� ����  �������� ����, ����
		kopo05_static = 1; // kopo05_static�� 1�� ����  �������� ����   

		System.out.printf("***********************************************\n");  // ���� ���� 
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> kopo05_static=[%d]\n", kopo05_static); // �ռ� �����ص� 1�� [] �ȿ� ������ �� �������� ��� 
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> kopo05_main=[%d]\n", kopo05_main); // �����ص� 1��[]�ȿ� ������ ��  �������� ���
		System.out.printf("***********************************************\n"); // ���м��� 

		add(kopo05_main); // add �޼ҵ忡 kopo05_main ���� �־ ȣ��
		// add �޼ҵ忡�� ++�� 1�� ���Ѱ� ���
		
		
		System.out.printf("***********************************************\n");  // ���м���
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> kopo05_static=[%d]\n", kopo05_static);   // ���������� Ŭ���������� ��밡���� ������ 2
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> kopo05_main=[%d]\n", kopo05_main); // ���������� �Լ��ӿ����� ��밡���� ������ 1
		System.out.printf("***********************************************\n");  // ���м���
		
		
		

		kopo05_main = add2(kopo05_main);  // add2 �޼ҵ忡 �������� kopo05_main ���� ���� �� �Է� 
		// add2 �޼ҵ忡�� ++�� 1�� ���� kopo05_main�� 1�� ���� 2 ��� kopo05_static�� 1 ���� 3 ��� 

		System.out.printf("***********************************************\n");  // ���м���
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> kopo05_static=[%d]\n", kopo05_static); // add2 �޼ҵ�� return���� ��¹��� ���� ����ؼ� 3
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> kopo05_main=[%d]\n", kopo05_main);  // add2 �޼ҵ�� return���� ��¹��� ���� ����ؼ� 2
		System.out.printf("***********************************************\n");  // ���м���

	}

	public static void add(int kopo05_i) {  // ���ϱ� �޼ҵ� 
		kopo05_static++;  //  �������� + 1
		kopo05_i++;  // �޼ҵ尡 �޾ƿ� ���� +1 
		System.out.printf("add�޼ҵ忡�� -> kopo05_static=[%d]\n", kopo05_static); // ������ ��� 
		System.out.printf("add�޼ҵ忡�� -> kopo05_i=[%d]\n", kopo05_i);  // ������ ��� 

	}

	public static int add2(int kopo05_i) {  // ���ϱ� �޼ҵ� 2
		kopo05_static++; //  �������� + 1
		kopo05_i++;  // �޼ҵ尡 �޾ƿ� ���� +1
		System.out.printf("add2�޼ҵ忡�� -> kopo05_static=[%d]\n", kopo05_static);  // ������ ��� 
		System.out.printf("add2�޼ҵ忡�� -> kopo05_i=[%d]\n", kopo05_i);  // ������ ��� 
		return kopo05_i;  // ���ڰ� ��ȯ 
	}
}
