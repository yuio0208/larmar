package Ch3_re;

import java.util.Scanner;

public class react15 {

	public static void main48(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.next();	// input text
		double cal = 0;		// initialize cal
				
		if (text.contains("+")) {	// case of text includes "+"
		String[] t = text.split("[+]");	// split by "+"
		String str1 = (t[0]);	// text before "+"
		String str2 = (t[1]);	// text after "+"
		double a = Double.parseDouble(str1); // casting str1
		double b = Double.parseDouble(str2); // casting str2
		cal = a + b;
		System.out.println(cal);
		}	else if (text.contains("-")) {	// case of text includes "-"
			String[] t = text.split("[-]");	// split by "-"
			String str1 = (t[0]);	// text before "-"
			String str2 = (t[1]);	// text after "-"
			double a = Double.parseDouble(str1);	// casting str1
			double b = Double.parseDouble(str2);	// casting str2
			cal = a - b;
			System.out.println(cal); 
		}	else if (text.contains("*")) {	// case of text includes "*"
			String[] t = text.split("[*]");	// split by "*"
			String str1 = (t[0]);	// text before "*"
			String str2 = (t[1]);	// text after "*"
			double a = Double.parseDouble(str1);	// casting str1
			double b = Double.parseDouble(str2);	// casting str2
			cal = a * b;
			System.out.println(cal); 
		}	else if (text.contains("/")) { // case of text includes "/"
			String[] t = text.split("[/]");	// split by "/"
			String str1 = (t[0]);	// text before "/"
			String str2 = (t[1]);	// text after "-"
			double a = Double.parseDouble(str1);	// casting str1
			double b = Double.parseDouble(str2);	// casting str2
			cal = a / b;
			System.out.println(cal);
		}	else {
			System.out.println("error"); // exception
		}
	}
}