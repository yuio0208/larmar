package Ch3_re;

import java.util.Scanner;

public class react13 {
	   public static Scanner scanner = new Scanner(System.in);
	   public static void main764(String[] args) {
	      // TODO Auto-generated method stub
	      while(true) {
	      System.out.println("");
	      String input1 = scanner.nextLine();
	      System.out.printf("");
	      String input2 = scanner.nextLine();
	      
	      charat(input1, input2);
	      }
	   }
	   
	   
	   public static void charat(String a , String b) {
	      char [] input2 = new char[b.length()];
	      char [] input1 = new char[a.length()];
	      for (int i = 0; i < b.length(); i++) {
	         input2 [i] = b.charAt(i); 
	      }
	      
	      for (int i = 0; i < a.length(); i++) {
	         input1 [i] = a.charAt(i);
	      }
	         int min = Integer.MAX_VALUE;
	         int cnt = 0;
	         int cnt2 = 0;
	      for (int i = 0; i < b.length(); i++) {
	         cnt = 0;
	         for (int j = 0; j < a.length(); j++) {
	            if (input2[i] == input1[j]) {
	               cnt ++;
	            }
	            cnt2 = 0;
	            for (int k = 0; k < b.length();k++) {
	               if (input2[i] == input2[k]) {
	                  cnt2 ++;
	               }
	               
	             }   
	            
	         } if (cnt2 != 0) {
	            cnt = (int) (cnt / cnt2);
	         }
	         
	         if (cnt < min ) {
	            min = cnt;
	         }
	         
	      }  System.out.printf("you can make %s outof sentence %d times ",b,min); 
	   } 
	      
	         
	}

