package Akira;

public class Nuck7 {

	public static void main123(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_weekday = 5; // �ʱⰪ ���� 
		int[] kopo05_end = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    // ���� ���� ������ ���� �迭�� kopo05_end�� �Է� 
		
		for (int kopo05_Mon = 0; kopo05_Mon < 12; kopo05_Mon++ ) {    // ���� ����  
			System.out.printf("\n\n                       %d��\n", kopo05_Mon + 1);   // 0������ �����̾ +1�� ���ش� 
			System.out.printf("===================================================\n");    // head ���� 
			System.out.printf(" ��\t ��\t ȭ\t ��\t ��\t ��\t �� \n");    // ���� ���� 
			for (int kopo05_i = 1; kopo05_i <= kopo05_end[kopo05_Mon] + kopo05_weekday; kopo05_i++) {    // �迭�� �־��� ���������� �޺��� ����ؾ� �Ѵ� �ٵ� + kopo05_weekday�� ���ִ� ������ 
				if (kopo05_i <= kopo05_weekday) {       //  if������ 1���� 5������ ���� ���ֱ� ������ ���ڰ� ���������� �̸� ���صδ� �� 
				System.out.printf(" \t");   
				
				
			} else {
				System.out.printf("%3d\t", kopo05_i - kopo05_weekday);   // kopo05_i - kopo05_weekday����  kopo05_i�� 6���� �����ؼ� kopo05_weekday�� ���ֱ� ������ ���ڴ� 1�Ϻ��� �����ϰ� �ȴ� 
			
				if (kopo05_i % 7 == 0) {  // �׸��� 7�� ���� �������� 0�� ��쿣 
				System.out.println();   // �Ʒ� ĭ���� ���� ���� ��� �ش� 
	
				
				}
			}
		}
		kopo05_weekday = (kopo05_weekday + (kopo05_end[kopo05_Mon] % 7)) % 7;   // for�� �ȿ��� kopo05_end[kopo05_Mon]�� 7�� ���� �������� kopo05_weekday�� ���� �� �ٽ� 7�� ���� ���� kopo05_weekday�� �־��ش� 
		// �� ���� ���� kopo05_weekday�� �Ǿ� �� ���� ���ڰ� �̾����� ������ �ȴ�   
	}
}

}
