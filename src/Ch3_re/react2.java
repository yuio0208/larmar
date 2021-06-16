package Ch3_re;

import java.util.Scanner;

public class react2 {

	public static void main222(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			String text = sc.nextLine();
			
			for (int i = 0; i < text.length(); i++) { // text의 길이만큼 반복 
				if (text.charAt(i) >= (int)'A' && text.charAt(i) <= (int)'Z') {  // text의 첫자부터 대소문자 구분
					System.out.print((char)(text.charAt(i) + 32));			// 대문자라면 소문자로 변경 후 출력		
				} else if (text.charAt(i) >= (int)'a' && text.charAt(i) <= (int)'z') {
					System.out.print((char)(text.charAt(i) - 32));  // 소문자면 대문자로 변경 후 출력 
				
				} else if (text.charAt(i) == ' ') {           // 띄어쓰기쓰면 띄어 쓴 출력되게  
					System.out.print((char)text.charAt(i));   //
				}
					
			}  
	}
}
