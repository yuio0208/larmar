package Ch2_re;

import java.util.Scanner;

public class react15 {

	public static void main789(String[] args) {
		// TODO Auto-generated method stub



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(1);  // ������ ���μ��� 1�� �����ϱ⿡ ������ ������ ���ش�
        
        for (int i = 2; i < N; i++) {  // �׷��� 2���� �Է��� ������ ��� ���� 
        	if (N % i == 0) {   //���� ���� 0�϶� �� ���� ����ϰ� �Ѵ�
        		System.out.println(i);     
           }
       }
   }
}