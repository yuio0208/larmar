package Akira;

public class Nuck_case {

	public static void main654(String[] args) {
		// TODO Auto-generated method stub

		
		for (int kopo05_i = 1; kopo05_i < 13; kopo05_i++) {  // 12���ޱ��� ǥ�� 
			System.out.printf("%d�� =>", kopo05_i);  // ��¹� ����
			LOOP:for (int kopo05_j = 1; kopo05_j < 32; kopo05_j++) {   // �ִ� 31�ϱ��� �ݺ��� ���� ����
				System.out.printf("%d," , kopo05_j);  // ��¹� ����
				
				switch(kopo05_i) {  
				case 4:case 6:case 9:case 7:case 11:  // 4�� 6�� 7�� 9�� 11���� 
					if (kopo05_j == 30) break LOOP;  // 30�Ͽ��� ���߰� ���� 
					break;  
				case 2:
					if (kopo05_j == 28) break LOOP;  // 2���� 28�Ͽ� ���߰� ���� 
					break;
				}
			}
			System.out.println("\n");
		}
		
		
		
	}

}
