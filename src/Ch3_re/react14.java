package Ch3_re;

import java.util.Scanner;

public class react14 {



	public static void main565(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();   // �Է��� ������
		String [] words = sentence.split(" ");     // " "�� ������ �������� ������ words�迭�� �ִ´� 
		char [] aeiou = {'a','e','o','u','i'};    // ������ aeiou�� �迭�� ����
				for (int i = 0; i < words.length; i++) {  // words�� ���� �ܾ�� �߿� 
					if(words[i].equals("a") || words[i].equals("an")){   // a �̰ų� an�̶�� 
						String target = words[i+1];   // target�� �����ܾ� 
						char D =target.charAt(0);    // D�� �����ܾ��� ù���ڸ� Ȯ���ϴ� �� 
						
						
						if (D =='a' || D =='e'|| D =='o'|| D =='i'|| D =='u') {  //���� D(�����ܾ��� ù����)�� a,e,o,i,u�̶�� 
							String newsentence = sentence.replace(words[i], "an"); // ���ܾ an���� �ٲ� ������ newsentence�� �Է�
									System.out.printf("%s",newsentence); 
						} else {
							String newsentence = sentence.replace(words[i], "a");  // �� �ݴ��� an�� a�� �ٲ� 
							System.out.printf("%s",newsentence);
						}
					}
				} 

	}
}