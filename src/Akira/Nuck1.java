package Akira;

public class Nuck1 {  // class ���� 

	public static void main5(String[] args) {
		// TODO Auto-generated method stub

	
		int kopo05_iA, kopo05_iB;   // kopo05_iA, kopo05_iB ���� ���� ���� 
		
		kopo05_iA =0;    // kopo05_iA �ʱⰪ ���� 
		while(true) {     //while���� ���ǹ� ���� 
			
			kopo05_iB=0;    // kopo05_iB �ʱⰪ ���� 
			while(true) {        //while�� ���ǹ� ���� ���� while�� ���� 
				System.out.printf("*");   //�� ��� ����
				
				if(kopo05_iA == kopo05_iB) break;   // // kopo05_iA�� kopo05_iB�� ������ ���߰� if�� ���� 
				kopo05_iB++;  // kopo05_iB�� �� 1�� ���ذ��� ������  
			}
			
			System.out.printf("\n");  // �� ���پ� ��� ���
			kopo05_iA++;  // kopo05_iA�� �� 1�� ���ذ��� �� ��� ��
			if(kopo05_iA ==30)break;  // kopo05_iA�� 30 ���̵Ǹ� ���߰� ���� 
		}
		
		
		
		
		
	}

}
