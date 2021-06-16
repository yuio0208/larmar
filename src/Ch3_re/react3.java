package Ch3_re;

import java.util.Scanner;

public class react3 {


	public static void main25(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		
		// typo스트링의 글자수 만큼 list에 
		for (int i = 0; i < type.length(); i++) {
			char comVal = (char) (type.charAt(i) - 0xAC00);

			if (comVal >= 0 && comVal <= 11172){
				// 한글일경우 
				
					// 초성만 입력 했을 시엔 초성은 무시해서 List에 추가
					char uniVal = (char)comVal;

					// 유니코드 표에 맞추어 초성 중성 종성을 분리
					char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
					char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
					char jong = (char) ((uniVal % 28) + 0x11a7);

					if (cho != 4519){
						System.out.print(cho+" ");
					}
					if (jung != 4519){
						System.out.print(jung+" ");
					}
					if (jong != 4519){
						System.out.print(jong+" ");
					}

			} else {  // 한글이 아닐경우
				comVal = (char) (comVal + 0xAC00);
				System.out.print(comVal + " ");
			}
		}
		
		
	}
}
		
		
	


