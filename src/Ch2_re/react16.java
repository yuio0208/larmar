package Ch2_re;

import java.util.Scanner;

public class react16 {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		int big, small;
		int a, b; int m, n;  //a�� �ִ������� ����, b�� �ּҰ������ ���� m�� ��, n�� �������� ���� 
		System.out.print("ù��° �� �Է� > ");
		int first = input.nextInt();
		System.out.print("�ι�° �� �Է� > ");
		
		int second = input.nextInt();
		if (first >= second) { 
			big = first;  // ù��°�� �Է��� ���ڰ� �ι�°�� �Է��� ���ں��� 
			small = second;    // ũ�ų����ٸ� first�� big�� ����, second�� small�� ���� 
		} else { 
			big = second;    //������ ���� �ݴ�� 
			small = first;
		}
		
		while(true) {
			m = big/small;     //if�� �Ἥ ū ���ڴ� ���� ���ڷ� ��Ե� �������� �� �װ� ��
			n = big-m*small;  // �������� ū ���ڿ��� ��� ���� ���ڸ� ���Ѱ��� ���� ����
			if (n == 0) {      
				a = small; 
				b = (first * second)/a; // ù��° �Է°��� �ι�° �Է°��� ���հ��� �ִ������� �����ָ� �ּҰ������ ���� 
					
				System.out.println("�ּҰ����: " + b);
				break;
			}
			big = small;
			small = n;
		}
	}
}

		
		
		
		
		
	


