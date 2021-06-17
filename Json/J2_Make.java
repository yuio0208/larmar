package Json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class J2_Make {

	public static JSONObject kopo05_oneRec(String kopo05_name, int kopo05_studentid, int kopo05_kor, int kopo05_eng, int kopo05_mat) {  //  JSONObject함수 설정 인수로 학생들의 나이 학번 국어점수 영어점수 수학점수를 각각 받음 
		JSONObject kopo05_dataObject = new JSONObject();  // kopo05_dataObject객체 생성 
		kopo05_dataObject.put("name", kopo05_name);   // kopo05_dataObject에 이름 입력 
		kopo05_dataObject.put("studentid", kopo05_studentid);  // kopo05_dataObject에 학번 입력 

		JSONArray kopo05_score = new JSONArray();   // kopo05_score객체 생성 
		kopo05_score.add(kopo05_kor);  // kopo05_score에 국어 점수 추가 
		kopo05_score.add(kopo05_eng);  // kopo05_score에 영어 점수 추가
		kopo05_score.add(kopo05_mat);  // kopo05_score에 수학 점수 추가
		kopo05_dataObject.put("score", kopo05_score); // dataObject에 객체에 넣어준 것을 입력  

		return kopo05_dataObject;  // kopo05_dataObject을 리턴받아 나이 학번 각 점수들 출력 받음  

	}

	public static void main14(String[] args) {
		// TODO Auto-generated method stub

		JSONObject kopo05_JsonObject = new JSONObject();  // kopo05_jsonObject 객체 생성 

		JSONArray kopo05_datasArray = new JSONArray();    
		// kopo05_datasArray 객체 생성 한명 성적의 정보를 담을  Array 선언 

		JSONObject kopo05_dataObject = new JSONObject();  // 한명 정보가 들어갈 JSONObject 선언, kopo05_dataObject객체 생성 
		kopo05_dataObject.put("name", "나경"); // kopo05_dataObject에 이름 정보 입력
		kopo05_dataObject.put("studentid", 209901); // kopo05_dataObject에 학번 정보 입력

		JSONArray kopo05_score = new JSONArray();  // kopo05_score객체 생성 이제 배열로 입력 가능 
		kopo05_score.add(90);kopo05_score.add(100);kopo05_score.add(95); // 각점수를 추가 
		kopo05_dataObject.put("score", kopo05_score);  // kopo05_dataObject에 kopo05_score에 넣어준 점수들 입력
		kopo05_datasArray.add(kopo05_dataObject);  // 이제 kopo05_dataObject를 kopo05_datasArray에 추가 

		kopo05_datasArray.add(kopo05_oneRec("새롬", 209902, 95, 95, 95));  // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("하영", 209903, 100, 100, 100)); //  kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("지원", 209904, 95, 95, 90)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("서연", 209905, 80, 100, 70)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("지헌", 209906, 100, 100, 70)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("규리", 209907, 70, 70, 70)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("지선", 209908, 80, 75, 72)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력
		kopo05_datasArray.add(kopo05_oneRec("채영", 209909, 78, 79, 82)); // kopo05_oneRec함수를 사용해 각학생들 정보를 kopo05_datasArray에 입력

		
		try {
			FileWriter kopo05_file = new FileWriter("C:\\Users\\김범주\\Desktop\\test.json"); // test.json파일을  kopo05_file에 입력
			kopo05_file.write(kopo05_datasArray.toJSONString()); // kopo05_datasArray자료들을 kopo05_file에 입력
			kopo05_file.flush(); // flush로 전송이 남은 데이터를 모두 보내줌
			kopo05_file.close();  // close로 종료 
		} catch(IOException e) {  // 예외처리 
			e.printStackTrace();   // 예외처리
		}
		System.out.println("JSON 만든거 :" + kopo05_datasArray);  // kopo05_datasArray 출력  
		
		
		
		
		
	}

}
