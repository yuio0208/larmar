package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class F9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_StockDailyPrice = new File(
				"C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv"); // 읽어올 파일 객체 생성
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_StockDailyPrice)); // 파일 읽기 객체 생성

		File kopo05_A005930 = new File("C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\A005930.csv"); // 작성할
																														// 파일객체
																														// 생성
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_A005930)); // 파일 쓰기 객체 생성

		String kopo05_readtxt; // 읽어온 데이터 임시 저장할 변수

		int kopo05_Cnt = 0; // 데이터 수

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // 문서 끝까지

			StringBuffer kopo05_s = new StringBuffer(); // 문자열 생성할 버퍼
			String[] kopo05_field = kopo05_readtxt.split(","); // ","로 구분하여 각각의 데이터 배열로 저장

			if (kopo05_field[2].equals("A005930")) {    // 쉼표로 자른 배열에 3번째에 있는 값이 삼성전자 단축코드만을 가져온다
				kopo05_s.append( kopo05_field[0].trim()); // 첫번째 필드 추가 
				for (int kopo05_i = 1; kopo05_i < kopo05_field.length; kopo05_i++) {  // 나머지 필드 추가  
					kopo05_s.append("," + kopo05_field[kopo05_i].trim());  // ,로 구분해서 추가 

				}
				kopo05_bw.write(kopo05_s.toString()); // 만들어진 한 줄의 데이터를 파일에 작성
				kopo05_bw.newLine(); // 개행
				kopo05_Cnt++; // 유효 데이터 카운트

			}

		}
		kopo05_br.close(); // 파일 읽기 객체 종료
		kopo05_bw.close(); // 파일 작성 객체 종료

		System.out.printf("Program End[&d]records\n", kopo05_Cnt); // 데이터 출력 

	}

}
