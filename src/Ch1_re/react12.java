package Ch1_re;

import java.util.Scanner;

public class react12 {

	public static void main1231(String[] args) {
		// TODO Auto-generated method stub

			
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();  // ������ �� ���� 
			int b = sc.nextInt();  // ������ ����  10���� ��ȯ���� 
			int ret1 = 0;   // ret1�� �� 
			int ret2 = 0;  // ret2�� ������ 
			String ret ="";   // ������ ���� ret�� �־���
			while(true) {
				ret1 = a/b;  // ������ ���� ret1�� ���� �� 
				ret2 = a%b;
				a = ret1;  // �ٽ� ������� �ϱ⶧���� a�� ���� 
				String ret1s = Integer.toString(ret1);  
				String ret2s = Integer.toString(ret2);
				ret = ret+ret2s;  //ret�� �������� �����ؼ� �־��� 
				if(ret1 == 1 && ret2 == 0) {  // if������ ��� �������� ���̻� ���� �� ���� ������ 
					ret = ret+ret1s; // ���� ����, �̰��� �ݴ�� ����ؾ� �� 
					break;
				}
				
			}
			for (int i = ret.length()-1; i>=0; i--) {  // ret�� �ݴ�� ��� 
				System.out.print(ret.charAt(i));
		}
	}		
}


