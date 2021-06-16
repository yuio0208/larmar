package Ch2_re;

import java.util.Scanner;

public class react8 {

	public static void main123(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int a; 
		int sum = 0; 
		a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
