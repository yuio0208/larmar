package Ch2_re;

import java.util.Scanner;

public class react7 {

	public static void main44(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		
		
		if (a < 10) {     //a�� 10�̸����� �ؼ� ���ܱ��� ������
			for (int i =2; i<10; i++) {  //i�� 2���� �����ؼ� 9���� +1�� �ö󰡰� ���� 
				System.out.println(a + "X" + i + "=" + (a-4)*i );  // ���� �����ܰ� ����� �ٸ��� ���ͼ� ����� ������ 
			
				
			}	
		}
	}
}
