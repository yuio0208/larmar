package Akira;

public class Nuck {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_sum = 0; // kopo05_sum �μ� ���� 
		for(int kopo05_i = 0; kopo05_i<10; kopo05_i++) {    // kopo05_i �ݺ��� ���� 
			kopo05_sum=kopo05_sum+kopo05_i;   // kopo05_sum�� �������� 1�� �÷���
		}
		System.out.printf("kopo05_sum %d\n",kopo05_sum);  // kopo05_sum 0���� 9 ���Ѱ� ��� 
		
		
		
		for(int kopo05_i =2; kopo05_i<10; kopo05_i++) {    //kopo05_i �ݺ������� 2�ܺ��� 9�� ��� 
			System.out.printf("******************************\n",kopo05_i);  // 
			System.out.printf("  ������ %d  ��\n",kopo05_i);
			System.out.printf("******************************\n",kopo05_i);
			for(int kopo05_j =2; kopo05_j<10; kopo05_j++) {
				
				System.out.printf(" %d * %d = %d \n", kopo05_i,kopo05_j, kopo05_i*kopo05_j);
			}
			
		}
		
		
	}

}
