package Ch6_re;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class react5 {

	public static void main444(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

				
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\김범주\\Desktop\\지진 데이터.csv"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
			try {
			File file = new File("C:\\Users\\김범주\\Desktop\\지진 데이터.csv");
			FileOutputStream out = new FileOutputStream("C:\\Users\\김범주\\Desktop\\지진 데이터.csv");
							
			} catch(Exception e) {
				e.printStackTrace();
			}
		} 	
}




