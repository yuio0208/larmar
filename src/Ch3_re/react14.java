package Ch3_re;

import java.util.Scanner;

public class react14 {



	public static void main565(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();   // 입력한 문장을
		String [] words = sentence.split(" ");     // " "로 공백을 기준으로 나눠서 words배열에 넣는다 
		char [] aeiou = {'a','e','o','u','i'};    // 모음을 aeiou의 배열에 넣음
				for (int i = 0; i < words.length; i++) {  // words에 넣은 단어들 중에 
					if(words[i].equals("a") || words[i].equals("an")){   // a 이거나 an이라면 
						String target = words[i+1];   // target은 다음단어 
						char D =target.charAt(0);    // D는 다음단어의 첫글자를 확인하는 것 
						
						
						if (D =='a' || D =='e'|| D =='o'|| D =='i'|| D =='u') {  //만약 D(다음단어의 첫글자)가 a,e,o,i,u이라면 
							String newsentence = sentence.replace(words[i], "an"); // 본단어를 an으로 바꾼 문장을 newsentence에 입력
									System.out.printf("%s",newsentence); 
						} else {
							String newsentence = sentence.replace(words[i], "a");  // 그 반대라면 an을 a로 바꿈 
							System.out.printf("%s",newsentence);
						}
					}
				} 

	}
}