package Ch2_re;

import java.util.Scanner;

public class react14 {

	public static void main123124(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int a; 
		a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {   // i�� a(�Էµ� ����)���� Ŀ���� ���� 
			for (int j = 1; j <= i-1; j++) {  // int j�� �ʱⰪ�� 1�κ��� i-1���� ������ ���
				System.out.print(" ");
				} for (int j = 2*a-1; j >= 2*i-1; j--) {  // �ʱⰪ�� 2*a-1�� �����ϰ� 2*i-1���� ū ������ ���� 
					System.out.print("*");  // ����� 
				}
				System.out.println();
		}	
	}
}
