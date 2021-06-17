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

		JSONParser kopo05_parser = new JSONParser();  // kopo05_parser��ü ���� 

		Object kopo05_obj = kopo05_parser.parse(new FileReader("C:\\Users\\�����\\Desktop\\test.json")); // test.json�� ������ FileReader�� �а�  kopo05_obj�� �Է� 

		JSONArray kopo05_array = (JSONArray)kopo05_obj; // kopo05_array�� �迭 ���� 

		System.out.println("****************************************");  // ���� ���� 
		for (int kopo05_i = 0; kopo05_i < kopo05_array.size(); kopo05_i++) { // �迭�ȿ� �ִ¸�ŭ �ݺ�
			JSONObject kopo05_result = (JSONObject) kopo05_array.get(kopo05_i); // Array���� ������ �ڷḦ  kopo05_result�� �Է�  
			System.out.println("�̸� :" + kopo05_result.get("name")); // �̸��� �����ͼ� ��� 
			System.out.println("�й� :" + kopo05_result.get("studentid"));  // �й��� �����ͼ� ��� 

			JSONArray kopo05_score = (JSONArray) kopo05_result.get("score"); // ������ �迭�� �����ͼ� kopo05_score�� �Է� 
			long kopo05_kor = (long) kopo05_score.get(0); //kopo05_score�� 0��°�ִ� ���� kopo05_kor�� �Է� 
			long kopo05_eng = (long) kopo05_score.get(1);  //kopo05_score�� 1��°�ִ� ���� kopo05_eng�� �Է�
			long kopo05_mat = (long) kopo05_score.get(2);  //kopo05_score�� 2��°�ִ� ���� kopo05_mat�� �Է�
			System.out.println("���� : " + kopo05_kor); // kopo05_kor�� ���
			System.out.println("���� : " + kopo05_eng); // kopo05_eng�� ���
			System.out.println("���� : " + kopo05_mat); // kopo05_mat�� ���
			System.out.println("���� : " + (kopo05_kor + kopo05_eng + kopo05_mat)); // ���������� ������ �� ���
			System.out.println("��� : " + (int)((kopo05_kor + kopo05_eng + kopo05_mat )/ 3.0));  // �� �������� ����� ���� �� ���
			System.out.println("****************************************"); // ���� ����

		}

	}

}
