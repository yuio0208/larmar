package Ch2_re;

import java.util.Scanner;

public class react17 {

	public static void main7586(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
			int big, small;
			int a; int m, n;  //a�� �ִ������� ����, m�� ��, n�� �������� ���� 
			System.out.println("ù��° �� �Է� > ");
			int first = input.nextInt();
			System.out.println("�ι�° �� �Է� > ");
			
			int second = input.nextInt();
			if (first >= second) { 
				big = first;  // ù��°�� �Է��� ���ڰ� �ι�°�� �Է��� ���ں��� 
				small = second;    // ũ�ų����ٸ� first�� big�� ����, second�� small�� ���� 
			} else { 
				big = second;    //������ ���� �ݴ�� 
				small = second;
			}
			
			while(true) {
				m = big/small;     //if�� �Ἥ ū ���ڴ� ���� ���ڷ� ��Ե� �������� �� �װ� ��
				n = big-m*small;  // �������� ū ���ڿ��� ��� ���� ���ڸ� ���Ѱ��� ���� ����
				if (n == 0) {      // �ִ������� ���ö����� while���� ���� 
					a = small; 
					System.out.println("�ִ�����: " + a);	
					break;
				}
				big = small;
				small = n;
				}
		}
}
