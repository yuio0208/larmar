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
		// �Ľ��� �ϱ� ���� kopo05_docBuilder��ü ����, ���丮 ����

		Document kopo05_doc = kopo05_docBuilder.parse(new File("C:\\Users\\�����\\Desktop\\weather.xml")); // weather.xml������ ������ kopo05_doc�� ���
		

		String kopo05_seq = "";   // 48�ð� �� ���° ����
		String kopo05_hour = "";   // ���׿��� 3�ð� ����
		String kopo05_day = "";   // 1��° �� ( 0 : ���� , 1 : ���� , 2 : ��)
		String kopo05_temp = "";  // ���� �ð��µ�
		String kopo05_tmx = "";   // �ְ� �µ�
		String kopo05_tmn = "";     // ���� �µ�
		String kopo05_sky = "";   // �ϴ� �����ڵ� (1: ����, 2 : �������� , 3: �������� , 4 : �帲)
		String kopo05_pty = "";    // ���� �����ڵ� (0 : ����, 1 : �� , 2 : ��/��, 3 : ��/��, 4 : ��)
		String kopo05_wfkor = "";   // ���� �ѱ���
		String kopo05_wfEn = "";     // ���� ����
		String kopo05_pop = "";      // ���� Ȯ��
		String kopo05_r12 = "";     // 12�ð� ���� ������
		String kopo05_s12 = "";    // 12�ð� ���� ������
		String kopo05_ws = "";      // ǳ��
		String kopo05_wd = "";     // ǳ�� (0~7) �� , �ϵ�, �� , ���� , �� , ���� , �� , �ϼ�
		String kopo05_wdKor = "";    // ǳ�� �ѱ���
		String kopo05_wdEn = "";    // ǳ�� ����
		String kopo05_reh = "";    // ����
		String kopo05_r06 = "";    // 6�ð� ���� ������
		String kopo05_s06 = "";    // 6�ð� ���� ������

		Element kopo05_root = kopo05_doc.getDocumentElement();  
		NodeList kopo05_tag_001 = ((Document) kopo05_doc).getElementsByTagName("data");  // data �±� ������ kopo05_tag_001�� ����


		for (int kopo05_i = 0; kopo05_i < kopo05_tag_001.getLength(); kopo05_i++) {  // kopo05_tag_001�� ���̸�ŭ ����
			Element kopo05_elmt = (Element) kopo05_tag_001.item(kopo05_i);  // kopo05_elmt�� kopo05_i��° �������� 


			kopo05_seq = kopo05_tag_001.item(kopo05_i).getAttributes().getNamedItem("seq").getNodeValue(); // kopo05_tag_001�κ��� kopo05_i��° kopo05_seq �� ����
			kopo05_hour = kopo05_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001�κ��� kopo05_i��° kopo05_hour �� ���� kopo05_elmt�� kopo05_tag_001.item(kopo05_i)�� ������ ���� ����
			kopo05_day = kopo05_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_day �� ����

			String[] kopo05_day_arr = { "����", "����", "��" };  // �迭�� kopo05_day_arr�� ����� �� ���� 

			kopo05_temp = kopo05_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001�κ��� kopo05_i��° kopo05_temp �� ����
			kopo05_tmx = kopo05_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();       // kopo05_tag_001�κ��� kopo05_i��° kopo05_tmx �� ����
			kopo05_tmn = kopo05_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_tmn �� ����
			kopo05_sky = kopo05_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_sky �� ����

			String[] kopo05_sky_arr = { "����", "��������", "��������", "�帲" };   // �迭�� kopo05_sky_arr�� ����� �� ���� 

			kopo05_pty = kopo05_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_pty �� ����
			String[] kopo05_pty_arr = { "����", "��", "��/��", "��/��", "��" };    // �迭�� kopo05_pty_arr�� ����� �� ���� 

			kopo05_wfkor = kopo05_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001�κ��� kopo05_i��° kopo05_wfkor �� ����
			kopo05_wfEn = kopo05_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001�κ��� kopo05_i��° kopo05_wfEn �� ����
			kopo05_pop = kopo05_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001�κ��� kopo05_i��° kopo05_pop �� ����
			kopo05_r12 = kopo05_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_r12 �� ����
			kopo05_s12 = kopo05_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_s12 �� ����
			kopo05_ws = kopo05_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001�κ��� kopo05_i��° kopo05_ws �� ����

			kopo05_wd = kopo05_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();     // kopo05_tag_001�κ��� kopo05_i��° kopo05_wd �� ����
			String[] kopo05_wd_arr = { "��", "�ϵ�", "��", "����", "��", "����", "��", "�ϼ�" };  // �迭�� kopo05_wd_arr�� ����� �� ���� 

			kopo05_wdKor = kopo05_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();  // kopo05_tag_001�κ��� kopo05_i��° kopo05_wdKor �� ����
			kopo05_wdEn = kopo05_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();   // kopo05_tag_001�κ��� kopo05_i��° kopo05_wdEn �� ����
			kopo05_reh = kopo05_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_reh �� ����
			kopo05_r06 = kopo05_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();	// kopo05_tag_001�κ��� kopo05_i��° kopo05_r06 �� ����
			kopo05_s06 = kopo05_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();    // kopo05_tag_001�κ��� kopo05_i��° kopo05_s06 �� ����

			System.out.println("**********************************"); // kopo05_seq��� ���й�
			System.out.printf("seq             : %s ��\n", Integer.parseInt(kopo05_seq) + 1); // kopo05_seq ���
			System.out.printf("hour(��)        : %s ��\n", kopo05_hour); // kopo05_hour ���
			System.out.printf("day(��))        : %s\n", kopo05_day_arr[Integer.parseInt(kopo05_day)]); // kopo05_day ���
			System.out.printf("temp(����µ�)  : %s ��\n", kopo05_temp); // kopo05_temp ���
			System.out.printf("tmx(�ְ�µ�)   : %s ��\n", kopo05_tmx); // kopo05_tmx ���
			System.out.printf("tmn(�����µ�)   : %s ��\n", kopo05_tmn); // kopo05_tmn ���
			System.out.printf("sky(�ϴû���)   : %s\n", kopo05_sky_arr[Integer.parseInt(kopo05_sky) - 1]); // kopo05_sky ���
			System.out.printf("pty(��������)   : %s\n", kopo05_pty_arr[Integer.parseInt(kopo05_pty)]); // kopo05_pty ���
			System.out.printf("wfKor(����)     : %s\n", kopo05_wfkor); // kopo05_wfKor ���
			System.out.printf("wfEn(����)      : %s\n", kopo05_wfEn); // kopo05_wfEn ���
			System.out.printf("pop(����Ȯ��)   : %s\n", kopo05_pop); // kopo05_pop ���
			System.out.printf("r12(12�ð� ���󰭼���)   : %s\n", kopo05_r12); // kopo05_r12 ���
			System.out.printf("s12(12�ð� ����������)   : %s\n", kopo05_s12); // kopo05_s12 ���
			System.out.printf("ws(ǳ��)        : %s\n", kopo05_ws); // kopo05_ws ���
			System.out.printf("wd(ǳ��)        : %s\n", kopo05_wd_arr[Integer.parseInt(kopo05_wd)]); // kopo05_wd ���
			System.out.printf("wdKor(ǳ��)     : %s\n", kopo05_wdKor); // kopo05_wdKor ���
			System.out.printf("wdEn(ǳ��)      : %s\n", kopo05_wdEn); // kopo05_wdEn ���
			System.out.printf("reh(����)       : %s\n", kopo05_reh); // kopo05_reh ���
			System.out.printf("r06(6�ð� ���󰭼���)    : %s\n", kopo05_r06); // kopo05_r06 ���
			System.out.printf("s06(6�ð� ����������)    : %s\n", kopo05_s06); // kopo05_s06 ���
			System.out.println("**********************************"); // kopo05_seq��� ���й�
		}

	}

}
