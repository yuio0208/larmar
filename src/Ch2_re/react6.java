package Ch2_re;

import java.util.Scanner;

public class react6 {

	public static void main33333(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =  new Scanner(System.in);
		String text; 
		text = sc.nextLine();
		
		if (text.equalsIgnoreCase("car") == true) {
			System.out.println("car is included in the input string.");				
		} else { 
			System.out.println("car is not included in the input string.");
		}
		
		System.out.println(text);
	}
}
