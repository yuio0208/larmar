package Ch3_re;

import java.util.Scanner;

public class react3 {


	public static void main25(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		
		// typo��Ʈ���� ���ڼ� ��ŭ list�� 
		for (int i = 0; i < type.length(); i++) {
			char comVal = (char) (type.charAt(i) - 0xAC00);

			if (comVal >= 0 && comVal <= 11172){
				// �ѱ��ϰ�� 
				
					// �ʼ��� �Է� ���� �ÿ� �ʼ��� �����ؼ� List�� �߰�
					char uniVal = (char)comVal;

					// �����ڵ� ǥ�� ���߾� �ʼ� �߼� ������ �и�
					char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
					char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
					char jong = (char) ((uniVal % 28) + 0x11a7);

					if (cho != 4519){
						System.out.print(cho+" ");
					}
					if (jung != 4519){
						System.out.print(jung+" ");
					}
					if (jong != 4519){
						System.out.print(jong+" ");
					}

			} else {  // �ѱ��� �ƴҰ��
				comVal = (char) (comVal + 0xAC00);
				System.out.print(comVal + " ");
			}
		}
		
		
	}
}
		
		
	


