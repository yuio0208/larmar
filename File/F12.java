package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class F12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\download_2021-05-04_17-16-44\\day_data\\StockDailyPrice.csv");  // 읽어올 파일 가져올 객체 생성 주식의 전체 데이터를 가져옴 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f, Charset.forName("MS949"))); // 파일 읽기 객체 kopo05_br 생성 
		// 할글 깨짐 방지를 위해 Charset.forName("MS949")로 인코딩 설정
		
		
		
		String kopo05_readtxt;  // 읽어온 파일 임시로 저장할 문자열 
		
		int kopo05_Max = Integer.MIN_VALUE;  // kopo05_Max값을 구하기 위해선 최소값을 넣어줘서 비교해준다 kopo05_Max값보다 크면 그 값을 kopo05_Max에 넣어줘서 최대값을 구한다 
		int kopo05_Min = Integer.MAX_VALUE;  // kopo05_Min값을 구하기 위해선 최대값을 넣어줘서 비교해줘서 kopo05_Min값보다 작으면 그값을 kopo05_Min값에 넣어준다 
		

		
		while((kopo05_readtxt = kopo05_br.readLine()) != null){ // 읽어온 파일을 readLine로 한줄씩 읽어 
			String [] kopo05_field = kopo05_readtxt.split(","); // , 로 나눠서 kopo05_field 배열에 넣어준다 
			
			
	
			
			if (kopo05_field[2].equals("A005930") && kopo05_field[1].contains("2007")) { // 배열의 3번째 값이 삼성전자 종목코드이면서 2번째 값이 2007년인 자료
																							 

				if (kopo05_Min > Integer.parseInt(kopo05_field[3])) { // 배열의 4번째 값은 주가 그값이 kopo05_Min과 비교해서 가장 작아질때까지 비교 
					kopo05_Min = Integer.parseInt(kopo05_field[3]);   //  계속 반복해서 가장 작은 값을 kopo05_Min에 넣어줌

				} else if (kopo05_Max < Integer.parseInt(kopo05_field[3])) {  // kopo05_Max를 배열의 4번째와 비교해서 kopo05_Max값이 가장 큰값을 만들어 줄려면 kopo05_Max값을 최소값으로 설정해서 계속 비교해줘서 키워야 함 
					kopo05_Max = Integer.parseInt(kopo05_field[3]);    // 가장 큰값을 kopo05_Max에 넣어줌 

				}

			}

		}
		kopo05_br.close();  // kopo05_br 종료 
		System.out.println("최대값" + kopo05_Max);  // 주가 최대값 출력 
		System.out.println("최소값" + kopo05_Min);  // 주가 최소값 출력 

	}

}
