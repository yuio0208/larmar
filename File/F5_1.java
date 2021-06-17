package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F5_1 {

	public static void main4(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\전국무료와이파이표준데이터.txt");  // 읽어올 파일 가져올 객체 생성 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // 파일 읽기 객체 kopo05_br 생성 
		// 할글 깨짐 방지를 위해 Charset.forName("MS949")로 인코딩 설정
		String kopo05_readtxt; // 읽어온 파일 임시로 저장할 문자열 

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) {  // 첫줄 읽기(필드)
			System.out.printf("빈 파일입니다\n");  // 첫줄이 null이면 빈 파일 
			return; // 아래 코드 실행하지 않고 종료 

		}
		String[] kopo05_field_name = kopo05_readtxt.split("\t");  // 첫줄을 탭으로 나눠서 필드 명 배열이 생성 

		double kopo05_lat = 37.3860521;  // 현재 위도 설정 
		double kopo05_lng = 127.1214038;  // 현재 경도 설정 

		int kopo05_LineCnt = 0; // 읽어온 줄 수 
		
		double kopo05_min = Double.MAX_VALUE;   // kopo05_min값을 지정해 계속 비교해줄 값 설정 
		double kopo05_max = Double.MIN_VALUE;   // kopo05_max값을 지정해 계속 비교해줄 값 설정
		String kopo05_minadd = "";               // kopo05_minadd을 최소거리 주소설정 
		String kopo05_maxadd = "";				// kopo05_maxadd을 최대거리 주소설정
		

		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // 더이상 읽어올 내용이 없을 때까지 while문으로 반복 

			String[] kopo05_field = kopo05_readtxt.split("\t");  // 읽어온 줄을 탭으로 나눠서 kopo05_field의 배열로 저장 
			if ((kopo05_field[12].equals("") || kopo05_field[12] == null)   // kopo05_field[12]는 위도, 위도 정보가 공백이거나 
					|| (kopo05_field[13].equals("") || kopo05_field[13] == null)) { // kopo05_field[13]는 경도, 경도 정보가 공백이면  

				System.out.printf("예외 : %s 번째\n", kopo05_LineCnt);  //예외사항 출력 
				kopo05_LineCnt++;  // 줄 수 추가해서 다음 열 출력  
				continue;  // 아래 코드 실행하지 않고 while문 처음으로 

			}
			
			if (kopo05_field[8].isEmpty()) {  // 만약 kopo05_field의 배열 8번째가 비어있다면  
				kopo05_field[8] = kopo05_field[9];   // kopo05_field의 배열 8번째의 값에 kopo05_field의 배열 9번째 값을 넣는다 
			}
			

			System.out.printf("************[%d번째 항목]*****************************\n", kopo05_LineCnt + 1); // 몇번째 항목인지 출력 
			System.out.printf("%s : %s\n", kopo05_field_name[9], kopo05_field[9]);                             // 아까 나눠서 kopo05_field_name에 배열로 넣어준 값을 제목으로해서 kopo05_field[9]의 값인 주소를 넣어줌  
			System.out.printf("%s : %s\n", kopo05_field_name[12], kopo05_field[12]);							// 아까 나눠서 kopo05_field_name에 배열로 넣어준 값을 제목으로해서 kopo05_field[12]의 값인 위도를 넣어줌 
			System.out.printf("%s : %s\n", kopo05_field_name[13], kopo05_field[13]);							// 아까 나눠서 kopo05_field_name에 배열로 넣어준 값을 제목으로해서 kopo05_field[13]의 값인 경도를 넣어줌 
			double kopo05_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo05_field[12]) - kopo05_lat, 2)      
					+ Math.pow(Double.parseDouble(kopo05_field[13]) - kopo05_lng, 2));
			// 거리 = sqrt(pow(목적지 위도 - 현재 위도), 2) + pow(목적지 경도 - 현재 경도), 2))
						// 피타고라스 정리 sqrt(pow(a-c),2) + pow((b-d), 2))
			
			if (kopo05_min > kopo05_dist) {   // kopo05_min이 kopo05_dist보다 크면 
				kopo05_min = kopo05_dist;    // kopo05_dist값이 kopo05_min값으로 들어가도록 계속해서 비교
				kopo05_minadd = kopo05_field[8];  //  kopo05_min이 kopo05_dist보다 크면 kopo05_field의 배열 8번째 값을  kopo05_minadd 최소거리 주소 변수에 넣어줌 
				
			} 
			if (kopo05_max < kopo05_dist) {  // kopo05_max가 kopo05_dist보다 작으면 
				kopo05_max = kopo05_dist;   // kopo05_dist값이 kopo05_max값으로 들어가도록 계속해서 비교
				kopo05_maxadd = kopo05_field[8];  //  kopo05_max이 kopo05_dist보다 작으면 kopo05_field의 배열 8번째 값을  kopo05_maxadd 최대거리 주소 변수에 넣어줌 
				
			}
			
			

			
			
			System.out.printf("현재지점과 거리 : %f\n", kopo05_dist);  // 거리 출력 
			System.out.printf("*********************************************************\n");   // 구분선 출력 
			kopo05_LineCnt++;   // 항목 번호 1

		}
		System.out.printf("최소거리: %f, 최소거리 주소 : %s\n", kopo05_min, kopo05_minadd);   // 최소거리, 최소거리 주소 출력 
		
		System.out.printf("최대거리: %f, 최대거리 주소 : %s\n", kopo05_max, kopo05_maxadd);   // 최대거리, 최대거리 주소 출력 

		kopo05_br.close();  // 파일 읽기 객체 종료 

	}

}
