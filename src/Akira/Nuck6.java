package Akira;

public class Nuck6 {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		String [] kopo05_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"}; //  �迭�� kopo05_units�� �ѱ� ���� 
		for (int kopo05_i = 0; kopo05_i < 101; kopo05_i++ ) {    // 1���� 100������ ǥ��  
			
			if(kopo05_i >= 0 && kopo05_i < 10) {  // 1���� 9������ ���� �ڸ��ϱ� 
				System.out.printf("���� �ڸ� : %s\n",kopo05_units[kopo05_i]);  // �迭�� 0���� 9������ �迭 ������ �״�� ��� 
			}
			else if (kopo05_i >= 10 && kopo05_i < 100) {  // 10���� 99������ 
				int kopo05_i10, kopo05_i0;           // �켱 �μ� ���� 
				kopo05_i10 = kopo05_i/10;          //   kopo05_i10�� kopo05_i�� 10�� ������ ������ 
				kopo05_i0 = kopo05_i%10;         // kopo05_i0�� kopo05_i�� 10�� ������ ��, ���⼭ ���� 10�� �ڸ� ���� ���� 
				if (kopo05_i0==0) {         // kopo05_i0�� 0�̶�� 10���ڸ����� ��
					System.out.printf("���� �ڸ� : %s��\n", kopo05_units[kopo05_i10]);  // 10�� �ڸ� ���� kopo05_i10���� ���� ������ %s�� ���� �״�� ��µǰ� kopo5_units�迭�� ���ڸ� ���� �ٿ��� ���� 
				} else { 
					System.out.printf("���� �ڸ� : %s��%s\n", kopo05_units[kopo05_i10],kopo05_units[kopo05_i0]);  // ���� 10�� ����� �ƴ϶�� kopo05_i10���� ���� ���� %s�� �״�� kopo05_units�迭�� �ִ´�� ����ϰ� 
					// ���� ������ kopo05_i0���� ���� ���������� kopo05_units�迭�� �ִ´�� ��� 
				}
				
			}
			else System.out.printf("==>%d\n", kopo05_i);  // �ƽ��� 100�� �״�� ��� 
		}
		
	}

}
