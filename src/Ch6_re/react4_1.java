package Ch6_re;

import java.util.Arrays;
import java.util.Collections;

public class react4_1 {

	public static void main333(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] num
		= {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		Arrays.sort(num, Collections.reverseOrder());
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("[" + num[i] + "]");
		}
		
	}

}
