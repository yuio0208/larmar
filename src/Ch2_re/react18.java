package Ch2_re;

public class react18 {

	public static void main444(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		for (int i = 2; i <= 11; i++) {   // 1�� �Ҽ��� �ƴϹǷ� 2���� ���� 
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {  // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
				System.out.println(i+" ");
			}	
			
			count = 0;
		
		}
	}
}
