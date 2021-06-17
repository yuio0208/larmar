package Json;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class J1 {

	public static void main485(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		DocumentBuilder kopo05_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); 
		// �Ľ��� �ϱ� ���� kopo05_docBuilder��ü ����, ���丮 ����

		Document kopo05_doc = kopo05_docBuilder.parse(new File("C:\\Users\\�����\\Desktop\\score.xml"));
		// score.xml�� ���ο� �ڷḦ kopo05_doc�� ����, xml�Ľ�ó��  
		// �Ľ��� ������ �̷�� �ִ� ���� ������ �����ϰ� ���ص� ������ ���� ���踦 �м��Ͽ� ������ �����ϴ� ��
		
		Element kopo05_root = kopo05_doc.getDocumentElement();
		// kopo05_doc�� kopo05_root�� ���� 
		
		NodeList kopo05_tag_name = kopo05_doc.getElementsByTagName("name"); // kopo05_doc�� name ��� kopo05_tag_name�� list�� ���� 
		NodeList kopo05_tag_studentid = kopo05_doc.getElementsByTagName("studentid"); // kopo05_doc�� studentid ��� kopo05_tag_studentid�� list�� ���� 
		NodeList kopo05_tag_kor = kopo05_doc.getElementsByTagName("kor");  // kopo05_doc�� kor ��� kopo05_tag_kor�� list�� ���� 
		NodeList kopo05_tag_eng = kopo05_doc.getElementsByTagName("eng");  // kopo05_doc�� eng ��� kopo05_tag_eng�� list�� ���� 
		NodeList kopo05_tag_mat = kopo05_doc.getElementsByTagName("mat");  // kopo05_doc�� mat ��� kopo05_tag_mat�� list�� ���� 

		System.out.printf("**************************************************\n");  // ���� ���� 
		for (int kopo05_i = 0; kopo05_i < kopo05_tag_name.getLength(); kopo05_i++) {  // kopo05_i�� �ʱⰪ 0, kopo05_tag_name�ȿ� ����ִ� �ڷ���� �������� 1�� �þ���� 
			System.out.printf("�̸�: %s\n", kopo05_tag_name.item(kopo05_i).getFirstChild().getNodeValue());   // �̸����� kopo05_tag_name���� ���� ��µǰ� 0���� for���� ���ư�
			System.out.printf("�й�: %s\n", kopo05_tag_studentid.item(kopo05_i).getFirstChild().getNodeValue());  // �й��� kopo05_tag_studentid���� ���� ��µǰ� 0���� for���� ���ư�
			System.out.printf("����: %s\n", kopo05_tag_kor.item(kopo05_i).getFirstChild().getNodeValue());  // ���� ������ kopo05_tag_kor���� ���� ��µǰ� 0���� for���� ���ư�
			System.out.printf("����: %s\n", kopo05_tag_eng.item(kopo05_i).getFirstChild().getNodeValue());   // ���� ������ kopo05_tag_kor���� ���� ��µǰ� 0���� for���� ���ư�
			System.out.printf("����: %s\n", kopo05_tag_mat.item(kopo05_i).getFirstChild().getNodeValue());    // ���� ������ kopo05_tag_kor���� ���� ��µǰ� 0���� for���� ���ư�
			System.out.printf("**************************************************\n");   // ���� ����
			
			
			
		}

	}

}
