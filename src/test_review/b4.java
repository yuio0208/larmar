package test_review;

import java.util.Scanner;

public class b4 {


	
	public static void main255(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		
		
		String ret1 = a.substring(0,a.indexOf("*"));
		String ret2 = a.substring(a.indexOf("*") + 1);
		
		int k = Integer.parseInt(ret1);
		int h = Integer.parseInt(ret2);
		
		
		System.out.println(k);
		// ¾ÈÇÑ´Ù 
		
		
		
	}
		
	

}
