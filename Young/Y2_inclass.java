package Young;

import java.io.UnsupportedEncodingException;

public class Y2_inclass {
	
	String kopo05_itemname1 = "아이깨끗해A 500ml";     //  kopo05_itemname1에 품목1의 품목명 입력
	String kopo05_itemname2 = "니베아 쉐이빙폼";			//  kopo05_itemname2에 품목2의 품목명 입력
	String kopo05_itemname3 = "녹차실감 INTENSIV TONIC";    //  kopo05_itemname3에 품목3의 품목명 입력

	String kopo05_itemcode1 = "[6815484]";               // kopo05_itemcode1에 품목1의 품목코드 입력 
	String kopo05_itemcode2 = "[6515321]";				// kopo05_itemcode2에 품목2의 품목코드 입력
	String kopo05_itemcode3 = "[9841531]";				// kopo05_itemcode3에 품목3의 품목코드 입력

	int kopo05_price1 = 5000;							//kopo05_price1에 품목1의 가격 입력                  
	int kopo05_price2 = 9000;							//kopo05_price2에 품목2의 가격 입력
	int kopo05_price3 = 13000;							//kopo05_price3에 품목3의 가격 입력 

	int kopo05_amount1 = 10;								//kopo05_amount1에 품목1의 가격 입력
	int kopo05_amount2 = 3;								//kopo05_amount2에 품목2의 가격 입력
	int kopo05_amount3 = 2;								//kopo05_amount3에 품목3의 가격 입력

	
	public static String kopo05_stringByBytes(String kopo05_inputString, int kopo05_stringWidth) throws UnsupportedEncodingException {
		for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth; kopo05_i++) { // 빈 문자열 방지를 위해 kopo05_stringWidth으로 기존 문자열의 너비를 설정 
			kopo05_inputString += " ";   // 기존 문자열에 설정 너비만큼 없는 글자만큼 공백을 더함
		}

		int kopo05_widthByte = 0; // 바이트 기준 가로너비
		int kopo05_cutIndex = 0;   // 잘라낼 인덱스 
		char kopo05_temp = ' ';   // 문자열 중 한 글자 
		for (int kopo05_i = 0; kopo05_i < kopo05_inputString.length(); kopo05_i++) {  //문자열 전체 
			kopo05_temp = kopo05_inputString.charAt(kopo05_i);  // 한 글자를 char로 받아서 kopo05_temp에 입력  
			if (Character.getType(kopo05_temp) == 5) {    //  kopo05_temp의 값의 character type이 5인 경우 한글 
				kopo05_widthByte += 2;   // 한글 글자 너비 2 추가 
			} else {    // 한글이 아닌 경우 
				kopo05_widthByte += 1;  // 한글 외 글자 너비 1 추가 
			}
			kopo05_cutIndex++;     // 잘라낼 인덱스 1 추가 
			if (kopo05_widthByte > kopo05_stringWidth) {  // 설정한 최대 너비보다 클 경우 
				kopo05_cutIndex--;  // 한글자 앞에서 자르도록 함 
				break; // 종료 
			}
		}
		String kopo05_rename = kopo05_inputString.substring(0, kopo05_cutIndex); // 지정한 인덱스 앞까지 자르기 

		//최종 너비 체크 
		int kopo05_newWidth = kopo05_rename.getBytes("EUC-KR").length; // 한글 2바이트로 간주한 너비 = 바이트 길이  
		if (kopo05_newWidth < kopo05_stringWidth) {  // 설정한 최대 너비보다 작은 경우 
			for (int kopo05_i = 0; kopo05_i < kopo05_stringWidth - kopo05_newWidth; kopo05_i++) { // 남는 자리 만큼 
				kopo05_rename += " ";  // 공백 추가 
			}
		}
		return kopo05_rename;  //새로운 품목명 반환

	}

}
