package Json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NalSSi {

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, ParseException {
		// TODO Auto-generated method stub


		DocumentBuilder kopo05_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// 파싱을 하기 위해 kopo05_docBuilder객체 생성, 팩토리 패턴

		Document kopo05_doc = kopo05_docBuilder.parse(new File("C:\\Users\\김범주\\Desktop\\weather.xml")); // weather.xml파일을 가져와 kopo05_doc에 사용
		

		String kopo05_seq = "";   // 48시간 중 몇번째 인지
		String kopo05_hour = "";   // 동네예보 3시간 단위
		String kopo05_day = "";   // 1번째 날 ( 0 : 오늘 , 1 : 내일 , 2 : 모레)
		String kopo05_temp = "";  // 현재 시간온도
		String kopo05_tmx = "";   // 최고 온도
		String kopo05_tmn = "";     // 최저 온도
		String kopo05_sky = "";   // 하늘 상태코드 (1: 맑음, 2 : 구름조금 , 3: 구름많음 , 4 : 흐림)
		String kopo05_pty = "";    // 강수 상태코드 (0 : 없음, 1 : 비 , 2 : 비/눈, 3 : 눈/비, 4 : 눈)
		String kopo05_wfkor = "";   // 날씨 한국어
		String kopo05_wfEn = "";     // 날씨 영어
		String kopo05_pop = "";      // 강수 확률
		String kopo05_r12 = "";     // 12시간 예상 강수량
		String kopo05_s12 = "";    // 12시간 예상 적설량
		String kopo05_ws = "";      // 풍속
		String kopo05_wd = "";     // 풍향 (0~7) 북 , 북동, 동 , 남동 , 남 , 남서 , 서 , 북서
		String kopo05_wdKor = "";    // 풍향 한국어
		String kopo05_wdEn = "";    // 풍향 영어
		String kopo05_reh = "";    // 습도
		String kopo05_r06 = "";    // 6시간 예상 강수량
		String kopo05_s06 = "";    // 6시간 예상 적설량

		Element kopo05_root = kopo05_doc.getDocumentElement();  
		NodeList kopo05_tag_001 = ((Document) kopo05_doc).getElementsByTagName("data");  // data 태그 가져와 kopo05_tag_001에 저장


		for (int kopo05_i = 0; kopo05_i < kopo05_tag_001.getLength(); kopo05_i++) {  // kopo05_tag_001의 길이만큼 돌기
			Element kopo05_elmt = (Element) kopo05_tag_001.item(kopo05_i);  // kopo05_elmt에 kopo05_i번째 가져오기 


			kopo05_seq = kopo05_tag_001.item(kopo05_i).getAttributes().getNamedItem("seq").getNodeValue(); // kopo05_tag_001로부터 kopo05_i번째 kopo05_seq 값 저장
			kopo05_hour = kopo05_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001로부터 kopo05_i번째 kopo05_hour 값 저장 kopo05_elmt에 kopo05_tag_001.item(kopo05_i)를 저장해 놨기 때문
			kopo05_day = kopo05_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_day 값 저장

			String[] kopo05_day_arr = { "오늘", "내일", "모레" };  // 배열로 kopo05_day_arr를 출력할 값 설정 

			kopo05_temp = kopo05_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001로부터 kopo05_i번째 kopo05_temp 값 저장
			kopo05_tmx = kopo05_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();       // kopo05_tag_001로부터 kopo05_i번째 kopo05_tmx 값 저장
			kopo05_tmn = kopo05_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_tmn 값 저장
			kopo05_sky = kopo05_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_sky 값 저장

			String[] kopo05_sky_arr = { "맑음", "구름조금", "구름많음", "흐림" };   // 배열로 kopo05_sky_arr를 출력할 값 설정 

			kopo05_pty = kopo05_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_pty 값 저장
			String[] kopo05_pty_arr = { "없음", "비", "비/눈", "눈/비", "눈" };    // 배열로 kopo05_pty_arr를 출력할 값 설정 

			kopo05_wfkor = kopo05_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001로부터 kopo05_i번째 kopo05_wfkor 값 저장
			kopo05_wfEn = kopo05_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001로부터 kopo05_i번째 kopo05_wfEn 값 저장
			kopo05_pop = kopo05_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001로부터 kopo05_i번째 kopo05_pop 값 저장
			kopo05_r12 = kopo05_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_r12 값 저장
			kopo05_s12 = kopo05_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_s12 값 저장
			kopo05_ws = kopo05_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001로부터 kopo05_i번째 kopo05_ws 값 저장

			kopo05_wd = kopo05_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001로부터 kopo05_i번째 kopo05_wd 값 저장
			String[] kopo05_wd_arr = { "북", "북동", "동", "남동", "남", "남서", "서", "북서" };  // 배열로 kopo05_wd_arr를 출력할 값 설정 

			kopo05_wdKor = kopo05_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001로부터 kopo05_i번째 kopo05_wdKor 값 저장
			kopo05_wdEn = kopo05_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001로부터 kopo05_i번째 kopo05_wdEn 값 저장
			kopo05_reh = kopo05_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_reh 값 저장
			kopo05_r06 = kopo05_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();	// kopo05_tag_001로부터 kopo05_i번째 kopo05_r06 값 저장
			kopo05_s06 = kopo05_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001로부터 kopo05_i번째 kopo05_s06 값 저장

			System.out.println("**********************************"); // kopo05_seq출력 구분문
			System.out.printf("seq             : %s 번\n", Integer.parseInt(kopo05_seq) + 1); // kopo05_seq 출력
			System.out.printf("hour(시)        : %s 시\n", kopo05_hour); // kopo05_hour 출력
			System.out.printf("day(일))        : %s\n", kopo05_day_arr[Integer.parseInt(kopo05_day)]); // kopo05_day 출력
			System.out.printf("temp(현재온도)  : %s 도\n", kopo05_temp); // kopo05_temp 출력
			System.out.printf("tmx(최고온도)   : %s 도\n", kopo05_tmx); // kopo05_tmx 출력
			System.out.printf("tmn(최저온도)   : %s 도\n", kopo05_tmn); // kopo05_tmn 출력
			System.out.printf("sky(하늘상태)   : %s\n", kopo05_sky_arr[Integer.parseInt(kopo05_sky) - 1]); // kopo05_sky 출력
			System.out.printf("pty(강수상태)   : %s\n", kopo05_pty_arr[Integer.parseInt(kopo05_pty)]); // kopo05_pty 출력
			System.out.printf("wfKor(날씨)     : %s\n", kopo05_wfkor); // kopo05_wfKor 출력
			System.out.printf("wfEn(날씨)      : %s\n", kopo05_wfEn); // kopo05_wfEn 출력
			System.out.printf("pop(강수확률)   : %s\n", kopo05_pop); // kopo05_pop 출력
			System.out.printf("r12(12시간 예상강수량)   : %s\n", kopo05_r12); // kopo05_r12 출력
			System.out.printf("s12(12시간 예상적설량)   : %s\n", kopo05_s12); // kopo05_s12 출력
			System.out.printf("ws(풍속)        : %s\n", kopo05_ws); // kopo05_ws 출력
			System.out.printf("wd(풍향)        : %s\n", kopo05_wd_arr[Integer.parseInt(kopo05_wd)]); // kopo05_wd 출력
			System.out.printf("wdKor(풍향)     : %s\n", kopo05_wdKor); // kopo05_wdKor 출력
			System.out.printf("wdEn(풍향)      : %s\n", kopo05_wdEn); // kopo05_wdEn 출력
			System.out.printf("reh(습도)       : %s\n", kopo05_reh); // kopo05_reh 출력
			System.out.printf("r06(6시간 예상강수량)    : %s\n", kopo05_r06); // kopo05_r06 출력
			System.out.printf("s06(6시간 예상적설량)    : %s\n", kopo05_s06); // kopo05_s06 출력
			System.out.println("**********************************"); // kopo05_seq출력 구분문
		}

	}

}
