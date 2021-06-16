package Ch6_re;

public class react2 {

	public static void main77(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] numbers = new int[3][5];  // 3행 5열로 배열 설정 
		int str = 0;  
		for (int i = 0; i < 3; i++) {   // i(행)가 0부터 2까지 1부터 증가 
			for (int j = 0; j < 5; j++) {  // j(열) 0부터 4까지 
				
				numbers[i][j] = str;  // 행과 열 각각 i와 j로 설정 = str
				str++;  //str을 1씩 증가 
				System.out.print(numbers[i][j] + " ");  // j에 대한 출력
			}
				System.out.println();  // i에 대한 출력 , 다음열에 띄어씀 
		}
		
	}

}
 


