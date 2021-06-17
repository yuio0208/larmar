package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F2 {

	public class FileReadWrite {  // FileReadWrite 클래스 생성 

	}

	public static void kopo05_FileWrite() throws IOException {  // kopo05_FileWrite 함수 생성  예외처리까지 
		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\nHome.txt");  //  바탕화면에 값을 입력할 새로운 txt파일 생성 
		BufferedWriter kopo05_bw = new BufferedWriter(new FileWriter(kopo05_f));  // kopo05_f파일에 값 입력 BufferedWriter을 쓰는 이유는 대용량이 가능하기 때문   

		kopo05_bw.write("안녕 파일");   // 문구 입력
		kopo05_bw.newLine();        // 줄 띄우기 
		kopo05_bw.write("hello");    // 문구 입력 
		kopo05_bw.newLine();     // 줄 띄우기 
		kopo05_bw.write("Juice wrld");

		kopo05_bw.close(); // kopo05_bw 닫기 파일이 계속 열려있으면 제어할 수 없음

	}

	public static void kopo05_FileRead() throws IOException {  // kopo05_FileRead 함수 생성 예외처리도 
		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\nHome.txt");   // kopo05_f파일의 경로 설정 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f));  // kopo05_f를 읽음 

		String kopo05_readtxt;   // kopo05_readtxt String으로 설정 

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) {  //kopo05_readtxt를 readLine으로 한줄 단위로 읽는데 null이 아닐때까지 반복함
			System.out.printf("%s\n", kopo05_readtxt);   // 그 문구를 출력 

		}
		kopo05_br.close();  //  kopo05_br파일 닫기 

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		kopo05_FileWrite();  // kopo05_FileWrite 함수 실행
		kopo05_FileRead();   // kopo05_FileRead 함수 실행

	}

}
