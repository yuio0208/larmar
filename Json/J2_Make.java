package Json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class J2_Make {

	public static JSONObject kopo05_oneRec(String kopo05_name, int kopo05_studentid, int kopo05_kor, int kopo05_eng, int kopo05_mat) {  //  JSONObject�Լ� ���� �μ��� �л����� ���� �й� �������� �������� ���������� ���� ���� 
		JSONObject kopo05_dataObject = new JSONObject();  // kopo05_dataObject��ü ���� 
		kopo05_dataObject.put("name", kopo05_name);   // kopo05_dataObject�� �̸� �Է� 
		kopo05_dataObject.put("studentid", kopo05_studentid);  // kopo05_dataObject�� �й� �Է� 

		JSONArray kopo05_score = new JSONArray();   // kopo05_score��ü ���� 
		kopo05_score.add(kopo05_kor);  // kopo05_score�� ���� ���� �߰� 
		kopo05_score.add(kopo05_eng);  // kopo05_score�� ���� ���� �߰�
		kopo05_score.add(kopo05_mat);  // kopo05_score�� ���� ���� �߰�
		kopo05_dataObject.put("score", kopo05_score); // dataObject�� ��ü�� �־��� ���� �Է�  

		return kopo05_dataObject;  // kopo05_dataObject�� ���Ϲ޾� ���� �й� �� ������ ��� ����  

	}

	public static void main14(String[] args) {
		// TODO Auto-generated method stub

		JSONObject kopo05_JsonObject = new JSONObject();  // kopo05_jsonObject ��ü ���� 

		JSONArray kopo05_datasArray = new JSONArray();    
		// kopo05_datasArray ��ü ���� �Ѹ� ������ ������ ����  Array ���� 

		JSONObject kopo05_dataObject = new JSONObject();  // �Ѹ� ������ �� JSONObject ����, kopo05_dataObject��ü ���� 
		kopo05_dataObject.put("name", "����"); // kopo05_dataObject�� �̸� ���� �Է�
		kopo05_dataObject.put("studentid", 209901); // kopo05_dataObject�� �й� ���� �Է�

		JSONArray kopo05_score = new JSONArray();  // kopo05_score��ü ���� ���� �迭�� �Է� ���� 
		kopo05_score.add(90);kopo05_score.add(100);kopo05_score.add(95); // �������� �߰� 
		kopo05_dataObject.put("score", kopo05_score);  // kopo05_dataObject�� kopo05_score�� �־��� ������ �Է�
		kopo05_datasArray.add(kopo05_dataObject);  // ���� kopo05_dataObject�� kopo05_datasArray�� �߰� 

		kopo05_datasArray.add(kopo05_oneRec("����", 209902, 95, 95, 95));  // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("�Ͽ�", 209903, 100, 100, 100)); //  kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("����", 209904, 95, 95, 90)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("����", 209905, 80, 100, 70)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("����", 209906, 100, 100, 70)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("�Ը�", 209907, 70, 70, 70)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("����", 209908, 80, 75, 72)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�
		kopo05_datasArray.add(kopo05_oneRec("ä��", 209909, 78, 79, 82)); // kopo05_oneRec�Լ��� ����� ���л��� ������ kopo05_datasArray�� �Է�

		
		try {
			FileWriter kopo05_file = new FileWriter("C:\\Users\\�����\\Desktop\\test.json"); // test.json������  kopo05_file�� �Է�
			kopo05_file.write(kopo05_datasArray.toJSONString()); // kopo05_datasArray�ڷ���� kopo05_file�� �Է�
			kopo05_file.flush(); // flush�� ������ ���� �����͸� ��� ������
			kopo05_file.close();  // close�� ���� 
		} catch(IOException e) {  // ����ó�� 
			e.printStackTrace();   // ����ó��
		}
		System.out.println("JSON ����� :" + kopo05_datasArray);  // kopo05_datasArray ���  
		
		
		
		
		
	}

}
