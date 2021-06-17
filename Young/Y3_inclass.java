package Young;

import java.io.UnsupportedEncodingException;

public class Y3_inclass {

	String[] kopo05_ItemName = { "샴푸", "린스", "체리블라썸", "메이플 시럽", "콘칩", "립밤", "제주 삼다수", "새우라면", "김치라면", "포도주스", 
			"페스츄리", "네일", "크림치즈", "립스틱", "나가사끼 짬뽕", "장우산", "양말", "부채", "핸드크림", "이어폰",
			"커피", "선글라스", "콜라", "사이다", "자몽소다", "커튼", "손전등", "삼양라면", "삼겹살", "쌈장" };   // 각 품목들 설정 

	int[] kopo05_Price = { 12000, 15000, 10000, 2000, 2000, 1000, 1300, 1200, 1500, 2000,
			4000, 4000, 4000, 3000, 3000, 8000, 2000, 2000, 4000, 9000,
			1000, 40000, 2000, 2000, 1700, 70000, 3000, 2000, 16000, 5000 };   // 각 품목별 가격 설정 

	int[] kopo05_SuRyang = { 1, 1, 1, 10, 5, 2, 7, 8, 9, 9, 
			1, 1, 5, 3, 9, 1, 2, 4, 7, 8, 
			5, 2, 1, 9, 8, 4, 2, 1, 3, 6 };    // 각 품목별 수량 설정 
	
	boolean [] kopo05_TaxFree = {true, true, false, false, false, true, false, true, false, false, 
			false, true, true, false, true, false, true, true, false, true,
			false, true, false, true, true, false, true, false, true, true};   // 각 품목별 면세 여부 설정 
	
	
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
