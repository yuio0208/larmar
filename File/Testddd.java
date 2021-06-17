package File;

public class Testddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while(true) {  // 
			cnt++; // 
			System.out.println(cnt);  // 
			if (cnt == 10) break;  // break는 위의 조건을 충족하고 반복문 탈출 
		}
		System.out.println("반복문 탈출");
		
		int cnt2 = 0;
		while(true) { 
			cnt2++;
			
			if ((cnt2 % 2) == 0) {  // 짝수라면 
				continue;    // continue로 짝수 제외하고 홀수 출력 
				// continue는 위의 조건을 제외하고 출력 while문으로 돌아감 
				
			}
			System.out.println(cnt2); 
			
			if (cnt2 == 11) break;  // 11이면 멈춤 
		}
		
	}

}
