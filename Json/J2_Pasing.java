package Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class J2_Pasing {

	public static void main45(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser kopo05_parser = new JSONParser();  // kopo05_parser객체 생성 

		Object kopo05_obj = kopo05_parser.parse(new FileReader("C:\\Users\\김범주\\Desktop\\test.json")); // test.json의 파일을 FileReader로 읽고  kopo05_obj에 입력 

		JSONArray kopo05_array = (JSONArray)kopo05_obj; // kopo05_array로 배열 설정 

		System.out.println("****************************************");  // 구분 설정 
		for (int kopo05_i = 0; kopo05_i < kopo05_array.size(); kopo05_i++) { // 배열안에 있는만큼 반복
			JSONObject kopo05_result = (JSONObject) kopo05_array.get(kopo05_i); // Array에서 가져온 자료를  kopo05_result에 입력  
			System.out.println("이름 :" + kopo05_result.get("name")); // 이름을 가져와서 출력 
			System.out.println("학번 :" + kopo05_result.get("studentid"));  // 학번을 가져와서 출력 

			JSONArray kopo05_score = (JSONArray) kopo05_result.get("score"); // 성적도 배열로 가져와서 kopo05_score에 입력 
			long kopo05_kor = (long) kopo05_score.get(0); //kopo05_score의 0번째있는 값을 kopo05_kor에 입력 
			long kopo05_eng = (long) kopo05_score.get(1);  //kopo05_score의 1번째있는 값을 kopo05_eng에 입력
			long kopo05_mat = (long) kopo05_score.get(2);  //kopo05_score의 2번째있는 값을 kopo05_mat에 입력
			System.out.println("국어 : " + kopo05_kor); // kopo05_kor를 출력
			System.out.println("영어 : " + kopo05_eng); // kopo05_eng를 출력
			System.out.println("수학 : " + kopo05_mat); // kopo05_mat를 출력
			System.out.println("총점 : " + (kopo05_kor + kopo05_eng + kopo05_mat)); // 각점수들을 더해준 값 출력
			System.out.println("평균 : " + (int)((kopo05_kor + kopo05_eng + kopo05_mat )/ 3.0));  // 각 점수들을 평균을 구한 값 출력
			System.out.println("****************************************"); // 구분 설정

		}

	}

}
