package Ch2_re;

public class react18 {

	public static void main444(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		for (int i = 2; i <= 11; i++) {   // 1은 소수가 아니므로 2부터 시작 
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {  // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
				System.out.println(i+" ");
			}	
			
			count = 0;
		
		}
	}
}
