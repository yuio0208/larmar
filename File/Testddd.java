package File;

public class Testddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while(true) {  // 
			cnt++; // 
			System.out.println(cnt);  // 
			if (cnt == 10) break;  // break�� ���� ������ �����ϰ� �ݺ��� Ż�� 
		}
		System.out.println("�ݺ��� Ż��");
		
		int cnt2 = 0;
		while(true) { 
			cnt2++;
			
			if ((cnt2 % 2) == 0) {  // ¦����� 
				continue;    // continue�� ¦�� �����ϰ� Ȧ�� ��� 
				// continue�� ���� ������ �����ϰ� ��� while������ ���ư� 
				
			}
			System.out.println(cnt2); 
			
			if (cnt2 == 11) break;  // 11�̸� ���� 
		}
		
	}

}
