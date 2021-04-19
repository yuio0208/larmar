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
		
	
		a = runclass.inputType(); // inputType함수를 사용한 것과 return a값을 출력한다 
	
		
		a1 = runclass.inputNum();
		
		a2 = runclass.inputTh();
		
		a3 =runclass.inputWu();
		
		
		
		System.out.println("가격은 " + "원 입니다");
		System.out.println("감사합니다\n");
		
		
		System.out.println(runclass.inputFin());
		
		
		
		
		}
		while (true); 
		
	}	
}
