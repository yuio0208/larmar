package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class F5 {

	public static void main75(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\전국무료와이파이표준데이터.txt"); // 읽어올 파일 가져올 객체 생성 파일 읽기 객체 kopo05_br 생성
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949")));  
																											 
																											
		// 할글 깨짐 방지를 위해 Charset.forName("MS949")로 인코딩 설정
		String kopo05_readtxt; // 읽어온 파일 임시로 저장할 문자열

		ArrayList<String> kopo05_distList = new ArrayList<String>();

		double kopo05_lat = 37.3860521; // 현재 위도 설정
		double kopo05_lng = 127.1214038; // 현재 경도 설정
		double kopo05_dist = 0;
		double kopo05_near = 0;
		String kopo05_nearAddr = "";
		double kopo05_far = 0;
		String kopo05_farAddr = "";

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) { // 첫줄 읽기(필드)
			System.out.printf("빈 파일입니다\n"); // 첫줄이 null이면 빈 파일
			return; // 아래 코드 실행하지 않고 종료

		}

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // 더이상 읽어올 내용이 없을 때까지 while문으로 반복

			String[] kopo05_field = kopo05_readtxt.split("\t"); // 읽어온 줄을 탭으로 나눠서 kopo05_field의 배열로 저장
			if ((kopo05_field[12].equals("") || kopo05_field[12] == null) // kopo05_field[12]는 위도, 위도 정보가 공백이거나
					|| (kopo05_field[13].equals("") || kopo05_field[13] == null)) { // kopo05_field[13]는 경도, 경도 정보가 공백이면
				continue;

			}

			kopo05_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo05_field[12]) - kopo05_lat, 2)
					+ Math.pow(Double.parseDouble(kopo05_field[13]) - kopo05_lng, 2));

			// 거리 = sqrt(pow(목적지 위도 - 현재 위도), 2) + pow(목적지 경도 - 현재 경도), 2))
			// 피타고라스 정리 sqrt(pow(a-c),2) + pow((b-d), 2))

			if ((kopo05_field[8].equals("") || kopo05_field[8] == null) // kopo05_field[12]는 위도, 위도 정보가 공백이거나
					|| (kopo05_field[8].equals("") || kopo05_field[9] == null)) {

			}

			kopo05_distList.add((float) kopo05_dist + "@" + kopo05_field[8]);

		}
	
		
	}

	
	

}
