package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F3 {

	public static void main7(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File kopo05_f = new File("C:\\Users\\김범주\\Desktop\\무료와이파이정보2.csv"); // csv파일을 가져와 kopo05_f에 입력 
		BufferedReader kopo05_br = new BufferedReader(new FileReader(kopo05_f));  // 대용량이기에 BufferedReader로 읽어 kopo05_br에 입력 

		String kopo05_readtxt;  // kopo05_readtxt 스트링 변수 설정 

		if ((kopo05_readtxt = kopo05_br.readLine()) == null) {   //  kopo05_br을 readLine으로 읽는데 그 값이 비어있을 경우 
			System.out.printf("빈 파일입니다\n");   // 빈 파일입니다 출력문 설정 
			return;
		}
		String[] kopo05_field_name = kopo05_readtxt.split(","); // 읽은 문장들을 ,을 기준으로 자르고 그것을 kopo05_field_name에 배열로 넣음   

		int kopo05_LineCnt = 0;  // kopo05_LineCnt변수 설정 후  
		while ((kopo05_readtxt = kopo05_br.readLine()) != null) { // 읽은 문장들이 비어있지 않을 경우 while 조건문으로 

			String[] kopo05_field = kopo05_readtxt.split(","); //  읽은 문장들을 ,을 기준으로 자르고 그것을 kopo05_field에 배열로 넣음   
			System.out.printf("**[%d번째 항목]************************************\n", kopo05_LineCnt+1); // 항목 번호 부여 
			for (int kopo05_j = 0; kopo05_j < kopo05_field_name.length; kopo05_j++) {     // kopo05_j의 초기값, kopo05_field_name.length보다 작게 설정하고 1씩 증가하게 설정 
				System.out.printf(" %s : %s\n", kopo05_field_name[kopo05_j], kopo05_field[kopo05_j]); // kopo05_field_name과 kopo05_field배열에 0번째부터 %s : %s로 csv파일의 한 가로줄 표현
			}
			System.out.printf("****************************************************\n");
			if (kopo05_LineCnt == 99)  // 0부터 시작이였으니 99까지해서 100개의 데이터 출력후  
				break;  // 멈춤
			kopo05_LineCnt++; // while문이 한바퀴 돌았으니 다음줄로 넘어가서 다시 while문 시작 
		}
		kopo05_br.close();   // kopo05_br을 닫아줌 
	}

}
