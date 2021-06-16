package fin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class aaaaa {

   public static void main666(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\김범주\\Desktop\\지진.csv"));
      String line;
      String line_data[];
      int count = 0;
      double sum = 0;
      double avg = 0;
      double max = 0;
      double min = 10;
      double num;
      
      while ((line = reader.readLine()) != null) {
         if (count > 2) {
        	line_data = line.split(",");
            num = Double.parseDouble(line_data[2]);
            sum = sum + num;
            if (num > max) {
               max = num;
            } else if (num < min) {
               min = num;
            }
         }
         count = count + 1;
         
      }
      System.out.println("합 - " + sum);
      System.out.println("Max - " + max);
      System.out.println("Min - " + min);
      
   }

}