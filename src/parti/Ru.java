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
		
		do {
		
	
		
		inclass runclass = new inclass();
		
	
		a = runclass.inputType(); 
		
		
		a1 = runclass.inputNum();
		
		a2 = runclass.inputTh();
		
		a3 = runclass.inputWu();
		
			
		
		int cb = (int) inputclass.age(Integer.parseInt(a1));
		int price = inputclass.agePay(cb, a2, a);
		
		
		
		
		System.out.println("������ " + price + "�� �Դϴ�");
		System.out.println("�����մϴ�\n");
		
		
		runclass.inputFin();
		
		
		}
		while (true); 
		
	}	
}
