package project;

public class work {  //class ���� 

	

		
	
		private static int kopo05_taxcal(int kopo05_val, int kopo05_rate){ // kopo05_taxcal �Լ��� int kopo05_val, int kopo05_rate�μ� �Է� 
			int kopo05_ret; // kopo05_ret���� ����  
			
		 if(((double)kopo05_val * (double)kopo05_rate/100.0) == kopo05_val * kopo05_rate/100)
			 //  (double)kopo05_val * (double)kopo05_rate�� 100.0���� ���������� �Ǽ��� ���� �纯�� �������� �Ҽ����� ������ �ȵ� 
			kopo05_ret = kopo05_val * kopo05_rate/100; // �Ҽ��� �ȳ����� �״�� ���
		 else
			 kopo05_ret = kopo05_val * kopo05_rate/100 +1; // �Ҽ��� ������ ���ظ� �� �ްԲ� +1�� ���༭ int�� ������ ���� �ᱹ �ø�
		 // ���ظ� �ȹޱ� ���ؼ� �ø����� ����� �� 
		 return kopo05_ret;   // ���ϰ��� �Һ��ڰ��� * ���� 
			
			
		}
			public static void main125(String[] args) {
				// TODO Auto-generated method stub
			
			int kopo05_val =1121; // ���������� �����̹Ƿ� 
			// ���� = �Һ��� ���� - �������ݿ��� �Һ��� ������ �ø��� ���� �� ����, ���� ���� = �Һ��ڰ���/(1+0.1)
			int kopo05_rate = 10;  // ������ 10�ۼ�Ʈ
				
			int kopo05_tax= kopo05_taxcal(kopo05_val,kopo05_rate); // kopo05_taxcal�� �Լ��� kopo05_tax�Լ��� �����ͼ� �μ� kopo05_val, kopo05_rate�� �ִ� �� �Է�
			
			System.out.println("**********************************************\n");  // *��� �� \n���� �ٶ���
			System.out.println("*             �ܼ� ���� ���                  *\n");  // ���� �Է� �� \n���� �ٶ���
			System.out.printf("���� ���ݰ��: %f\n", kopo05_val *kopo05_rate/100.0); //���� ���� �ݾ���  �Һ��ڰ��� * ����/100.0���� ��� �Ǽ��� ���   (%f�� �Ҽ� ���)
			System.out.printf("��������: %d    ���� :%d    �����԰���: %d\n", kopo05_val,kopo05_tax,kopo05_val+kopo05_tax);  // ��������, ����, ������ ����(�������� + ����)�� ���� ���  (%d�� ���� ���)
			System.out.println("**********************************************\n"); // *��� �� \n���� �ٶ���
			
		
		
		
	}

}
