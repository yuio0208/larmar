package parti;

import java.util.Scanner;

public class Ru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cal inputclass = new cal();
		
		
		int a = 0;
		String a1 = "";
		int a2 = 0;
		int a3 = 0;
		
		

		//a = inputclass.inputType();
		//a1 = inputclass.inputNum();
		
		
		do {

		
		inclass runclass = new inclass();
		
	
		a = runclass.inputType(); // inputType�Լ��� ����� �Ͱ� return a���� ����Ѵ� 
	
		
		a1 = runclass.inputNum();
		
		a2 = runclass.inputTh();
		
		a3 =runclass.inputWu();
		
		
		
		System.out.println("������ " + "�� �Դϴ�");
		System.out.println("�����մϴ�\n");
		
		
		System.out.println(runclass.inputFin());
		
		
		
		
		}
		while (true); 
		
	}	
}
