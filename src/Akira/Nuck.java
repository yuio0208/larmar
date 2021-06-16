package Akira;

public class Nuck {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_sum = 0; // kopo05_sum 인수 설정 
		for(int kopo05_i = 0; kopo05_i<10; kopo05_i++) {    // kopo05_i 반복문 설정 
			kopo05_sum=kopo05_sum+kopo05_i;   // kopo05_sum을 누적으로 1씩 늘려감
		}
		System.out.printf("kopo05_sum %d\n",kopo05_sum);  // kopo05_sum 0부터 9 더한값 출력 
		
		
		
		for(int kopo05_i =2; kopo05_i<10; kopo05_i++) {    //kopo05_i 반복문으로 2단부터 9단 출력 
			System.out.printf("******************************\n",kopo05_i);  // 
			System.out.printf("  구구단 %d  단\n",kopo05_i);
			System.out.printf("******************************\n",kopo05_i);
			for(int kopo05_j =2; kopo05_j<10; kopo05_j++) {
				
				System.out.printf(" %d * %d = %d \n", kopo05_i,kopo05_j, kopo05_i*kopo05_j);
			}
			
		}
		
		
	}

}
