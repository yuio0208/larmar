package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F11 {

	public static void main14(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv");  // 읽어올 파일 가져올 객체 생성 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // 파일 읽기 객체 kopo05_br 생성 
		// 할글 깨짐 방지를 위해 Charset.forName("MS949")로 인코딩 설정
		

		File kopo05_f1 = new File("C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\MaxMin.csv"); // 작성할 파일객체 생성 
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_f1)); // 파일 쓰기 객체 생성 

		String kopo05_readtxt; // 읽어온 파일 임시로 저장할 문자열 
		
		int kopo05_Cnt = 0;  // 데이터 수 
		int kopo05_wcnt = 0;  // 유효데이터 수 

		int kopo05_Min = Integer.MIN_VALUE;
		int kopo05_Max = Integer.MAX_VALUE;
		
		
		
		
		while ((kopo05_readtxt = kopo05_br.readLine()) != null) {  // 문서 끝까지 
 
			StringBuffer kopo05_s = new StringBuffer();   // 문자열 생성할 버퍼 
			String[] kopo05_field = kopo05_readtxt.split(",");    // "%_%"로 구분하여 각각의 데이터 배열로 저장 

			if (kopo05_field.length > 2 && kopo05_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { // 특수문자 제거 후 3번째 필드가 A로 시작하는 경우 
				kopo05_s.append("," + kopo05_field[0].replace("^", "").trim()); // 첫번째 필드 버퍼에 추가 
				for (int kopo05_j = 1; kopo05_j < kopo05_field.length; kopo05_j++) {    // 나머지 필드 
					kopo05_s.append("," + kopo05_field[kopo05_j].replace("^", "").trim());  // 콤마로 구분하여 버퍼에 추가 

				}
				kopo05_bw.write(kopo05_s.toString()); // 만들어진 한 줄의 데이터를 파일에 작성 
				kopo05_bw.newLine();   // 개행 
				kopo05_wcnt++;   // 유효 데이터 카운트 

				
				
				
			}
			

			kopo05_Cnt++;   // 읽어온 데이터 카운트 
		}
		kopo05_br.close();  // 파일 ㅇ릭기 객체 종료 
		kopo05_bw.close();  // 파일 작성 객체 종료 

		System.out.printf("Program End[&d][%d]records\n", kopo05_Cnt, kopo05_wcnt);  // 총 데이터, 유효데이터 수 출력 

	}

}

