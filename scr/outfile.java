package scr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class outfile {

	Date now = new Date();
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdt = new SimpleDateFormat("yy.MM.dd HH:mm:ss");

	public void changeToUSD(int moneyKOR, int changeToUSD, int change_USD) {

	}

	public void outfile1(String temp) throws IOException {
		try {
			FileWriter FileWriter = new FileWriter("C:\\Users\\�����\\Desktop\\exchange.csv", true);

			FileWriter.write("  ��¥ \t  �ð� \t ȯ����û�ݾ� \t Ÿ�� \t �Ž����� \t �����ݾ� \n");
			FileWriter.write(sdt.format(cal.getTime()) + "\t  ");
			FileWriter.write(temp);
			FileWriter.flush();

			FileWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}