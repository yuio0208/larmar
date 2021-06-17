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
		// 파싱을 하기 위해 kopo05_docBuilder객체 생성, 팩토리 패턴

		Document kopo05_doc = kopo05_docBuilder.parse(new File("C:\\Users\\김범주\\Desktop\\score.xml"));
		// score.xml의 새로운 자료를 kopo05_doc에 저장, xml파싱처리  
		// 파싱은 문장이 이루고 있는 구성 성분을 분해하고 분해된 성분의 위계 관계를 분석하여 구조를 결정하는 것
		
		Element kopo05_root = kopo05_doc.getDocumentElement();
		// kopo05_doc을 kopo05_root에 저장 
		
		NodeList kopo05_tag_name = kopo05_doc.getElementsByTagName("name"); // kopo05_doc의 name 모두 kopo05_tag_name에 list로 저장 
		NodeList kopo05_tag_studentid = kopo05_doc.getElementsByTagName("studentid"); // kopo05_doc의 studentid 모두 kopo05_tag_studentid에 list로 저장 
		NodeList kopo05_tag_kor = kopo05_doc.getElementsByTagName("kor");  // kopo05_doc의 kor 모두 kopo05_tag_kor에 list로 저장 
		NodeList kopo05_tag_eng = kopo05_doc.getElementsByTagName("eng");  // kopo05_doc의 eng 모두 kopo05_tag_eng에 list로 저장 
		NodeList kopo05_tag_mat = kopo05_doc.getElementsByTagName("mat");  // kopo05_doc의 mat 모두 kopo05_tag_mat에 list로 저장 

		System.out.printf("**************************************************\n");  // 구분 설정 
		for (int kopo05_i = 0; kopo05_i < kopo05_tag_name.getLength(); kopo05_i++) {  // kopo05_i의 초기값 0, kopo05_tag_name안에 들어있는 자료들의 개수까지 1씩 늘어가도록 
			System.out.printf("이름: %s\n", kopo05_tag_name.item(kopo05_i).getFirstChild().getNodeValue());   // 이름부터 kopo05_tag_name으로 부터 출력되게 0부터 for문이 돌아감
			System.out.printf("학번: %s\n", kopo05_tag_studentid.item(kopo05_i).getFirstChild().getNodeValue());  // 학번을 kopo05_tag_studentid에서 부터 출력되게 0부터 for문이 돌아감
			System.out.printf("국어: %s\n", kopo05_tag_kor.item(kopo05_i).getFirstChild().getNodeValue());  // 국어 점수를 kopo05_tag_kor에서 부터 출력되게 0부터 for문이 돌아감
			System.out.printf("영어: %s\n", kopo05_tag_eng.item(kopo05_i).getFirstChild().getNodeValue());   // 영어 점수를 kopo05_tag_kor에서 부터 출력되게 0부터 for문이 돌아감
			System.out.printf("수학: %s\n", kopo05_tag_mat.item(kopo05_i).getFirstChild().getNodeValue());    // 수학 점수를 kopo05_tag_kor에서 부터 출력되게 0부터 for문이 돌아감
			System.out.printf("**************************************************\n");   // 구분 설정
			
			
			
		}

	}

}
