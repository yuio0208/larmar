package wkqk;

import java.util.Scanner;

public class amuse {

		private Scanner sc = null; 
		
		public amuse() {
			sc = new Scanner(System.in);
			
		}
		
		public int inputFromConsoleType() {
			int tic;
			System.out.println("������ �����ϼ���.\n 1. �ְ��� \n 2. �߰���");
			tic = sc.nextInt();
			return tic; 
	
		}
		
		public int inputFromConsoleNumber() {
			int num;
			System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���.\n");
			num = sc.nextInt();
			return num; 		
		}

		public int inputFromConsoleTh() {
			int Th;
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�? \n");
			Th = sc.nextInt();
			return Th;  
			
		}
		
		public int inputFromConsoleWu() {
			int Wu;
			System.out.println("�������� �����ϼ���. "
					+ "1. ���� (���� ���� �ڵ�ó��)"
					+ "2. ����� "
					+ "3. ����������"
					+ "4. ���ڳ�"
					+ "5. �ӻ��\n");
			Wu = sc.nextInt();
			return Wu; 
		
		}
		
		
}		
		
		
	


