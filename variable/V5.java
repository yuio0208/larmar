package variable;

import java.util.Scanner;

public class V5 {

	public static void main45(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kopo05_sc = new Scanner(System.in); // Scanner로 kopo05_sc 객체 생성 
		
		
		System.out.println("두자리 정수를 하나 입력해주세요. >");  // 출력문 설정 
		
		String kopo05_input = kopo05_sc.next();        // kopo05_sc 뒤에 적을 글자를 kopo05_input에 넣어줌 
		int kopo05_num = Integer.parseInt(kopo05_input);    // kopo05_input을 int로 바꾼것을 kopo05_num에 넣어줌 
		
		System.out.println("입력내용 :" + kopo05_input);  // kopo05_input 결과를 출력 
		System.out.printf("num = %d%n", kopo05_num);  // kopo05_num결과 출력 
		
		
		
	}

}
