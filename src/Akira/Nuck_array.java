package Akira;

public class Nuck_array {

	public static void main658(String[] args) {
		// TODO Auto-generated method stub

		
		int [] kopo05_lmd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // �޸��� ���� �ұ�Ģ�ϴ� ������ ��¥�� ����Ʈ�� �迭�� �־��ش�
		// �迭�� 0������ ���� 
		
		
		for (int kopo05_i = 1; kopo05_i < 13; kopo05_i++) {   // �� ����
			System.out.printf(" %d�� =>", kopo05_i);            // ���� ���� ���� 
			for (int kopo05_j = 1; kopo05_j <32; kopo05_j++) {   // �� ���� 
				System.out.printf("%d", kopo05_j);             // �� ���� ���� 
				
				if(kopo05_lmd[kopo05_i-1] == kopo05_j) break;    // kopo05_lmd�� �迭�ȿ��� kopo05_i-1 ����, �迭�� 0���� �����̱⿡ kopo05_i�� 1���� �����ϰ� ������������ -1�� ����� �´� 
				
				System.out.printf(",");  // , ���� 
			}
			System.out.printf("\n");
		}
		
		
		
		
	}

}
