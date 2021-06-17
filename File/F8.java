package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class F8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\THTSKS010H00.dat"); // 파일 객체 생성 
																														
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f)); // 파일 읽기 개체 생성

		int kopo05_LineCnt = 0; // 읽어온 데이터 줄 수
		int kopo05_n = -1; // 읽어온 문자 개수

		StringBuffer kopo05_s = new StringBuffer(); // 문자열 생성을 위한 인스턴스 s

		while (true) { // 반복문

			char[] kopo05_ch = new char[1000]; // 읽어온 문자열을 임시로 저장할 배열 kopo05_ch 객체

			kopo05_n = kopo05_br.read(kopo05_ch); // 배열 형태로 읽어온 문자 개수

			if (kopo05_n == -1) break; // 더이상 읽어올 문자가 없는 경우

			for (char kopo05_c : kopo05_ch) { // 읽어온 모든 문자열
				if (kopo05_c == '\n') { // 개행문자인 경우
					System.out.printf("[%s]***\n", kopo05_s.toString()); // 작성된 스트링 버퍼 출력
					kopo05_s.delete(0, kopo05_s.length()); // 버퍼 초기화
				} else { // 개행문자 전까지
					kopo05_s.append(kopo05_c); // 스트링버퍼에 읽어온 문자 추가 
					// append 메소드는 인수로 전달된 값을 문자열로 변환후 해당 문자열의 마지막에 추가 
				}

			}

			kopo05_LineCnt++; // 읽어온 줄 수 카운트 

		}

		System.out.printf("[%s]***\n", kopo05_s.toString());  // 데이터 수 출력 
		kopo05_br.close();  // 파일 읽기 종료 

	}
}