package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { // try catch으로 예외일 경우 출력문 설정
			File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\sense.txt"); // 경로 설정 후 파일 kopo05_f로 설정
			FileWriter kopo05_fw = new FileWriter(kopo05_f); // FileWriter로 kopo05_fw에 내용 입력

			kopo05_fw.write("안녕 파일\n"); // kopo05_fw에 문구 입력
			kopo05_fw.write("hello 헬로\n"); // kopo05_fw에 문구 입력

			kopo05_fw.close(); // kopo05_fw 닫음

			FileReader kopo05_fr = new FileReader(kopo05_f); // kopo05_fr의 내용 읽음

			int kopo05_n = -1; // kopo05_n은 -1로 설정
			char[] kopo05_ch; // 한글자씩 넣는 kopo05_ch 배열 설정

			while (true) { // while문 설정
				kopo05_ch = new char[100]; // kopo05_ch 배열은 100개의 배열을 잡음
				kopo05_n = kopo05_fr.read(kopo05_ch); // kopo05_ch를 읽어 kopo05_n에 입력

				if (kopo05_n == -1)
					break; // 입력받은 값이 -1이면 멈추게 설정

				for (int kopo05_i = 0; kopo05_i < kopo05_n; kopo05_i++) { // kopo05_i의 초기값을 0, kopo05_i는 kopo05_n보다 작고,
																			// kopo05_i는 1씩 증가하게 for문 설정
					System.out.printf("%c", kopo05_ch[kopo05_i]); // kopo05_ch배열에 kopo05_i의 값을 입력한뒤 출력, %c는 문자 출력
				}
			}
			kopo05_fr.close(); // kopo05_fr 닫음

			System.out.printf("\n FILE READ END"); // 출력문 설정

		} catch (Exception e) { // 파일이 없든, 권한이 없든 예외시
			System.out.printf("에러 [%s]\n, e"); // 예외 출력문 설정
		}

	}

}
