package Ch6_re;

public class react2 {

	public static void main77(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] numbers = new int[3][5];  // 3�� 5���� �迭 ���� 
		int str = 0;  
		for (int i = 0; i < 3; i++) {   // i(��)�� 0���� 2���� 1���� ���� 
			for (int j = 0; j < 5; j++) {  // j(��) 0���� 4���� 
				
				numbers[i][j] = str;  // ��� �� ���� i�� j�� ���� = str
				str++;  //str�� 1�� ���� 
				System.out.print(numbers[i][j] + " ");  // j�� ���� ���
			}
				System.out.println();  // i�� ���� ��� , �������� �� 
		}
		
	}

}
 


