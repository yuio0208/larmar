package Ch2_re;

public class react10 {

	public static void main75(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;  // 구구단이니 초기값 2 설정 
		if (a >= 2) {  // 2부터 시작 
			for (int i = 2; i < 10; i++) {  //i는 2부터 9까지 돌게 설정
				for (int j = 2; j <10; j++) {  //j는 2부터 9까지 돌게 설정
					System.out.println(i + "x" + j + "=" + j*i);  // 형식설정 
				
				}
			}
		}
	}
}