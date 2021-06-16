package Ch1_re;

import java.util.Scanner;

public class react12 {

	public static void main1231(String[] args) {
		// TODO Auto-generated method stub

			
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();  // 나눠줄 값 설정 
			int b = sc.nextInt();  // 나눌값 설정  10진수 변환위해 
			int ret1 = 0;   // ret1은 몫 
			int ret2 = 0;  // ret2는 나머지 
			String ret ="";   // 나눠준 몫을 ret에 넣어줌
			while(true) {
				ret1 = a/b;  // 나눠준 몫을 ret1에 저장 후 
				ret2 = a%b;
				a = ret1;  // 다시 나눠줘야 하기때문에 a에 저장 
				String ret1s = Integer.toString(ret1);  
				String ret2s = Integer.toString(ret2);
				ret = ret+ret2s;  //ret에 나머지를 누적해서 넣어줌 
				if(ret1 == 1 && ret2 == 0) {  // if문으로 몫과 나머지가 더이상 나눠 줄 값이 없으면 
					ret = ret+ret1s; // 몫을 누적, 이값은 반대로 출력해야 함 
					break;
				}
				
			}
			for (int i = ret.length()-1; i>=0; i--) {  // ret을 반대로 출력 
				System.out.print(ret.charAt(i));
		}
	}		
}


