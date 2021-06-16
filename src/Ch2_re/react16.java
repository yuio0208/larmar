package Ch2_re;

import java.util.Scanner;

public class react16 {

	public static void main456(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		int big, small;
		int a, b; int m, n;  //a를 최대공약수로 설정, b를 최소공배수로 설정 m은 몫, n은 나머지로 설정 
		System.out.print("첫번째 수 입력 > ");
		int first = input.nextInt();
		System.out.print("두번째 수 입력 > ");
		
		int second = input.nextInt();
		if (first >= second) { 
			big = first;  // 첫번째로 입력한 숫자가 두번째로 입력한 숫자보다 
			small = second;    // 크거나같다면 first를 big에 대입, second를 small에 대입 
		} else { 
			big = second;    //나머지 경우는 반대로 
			small = first;
		}
		
		while(true) {
			m = big/small;     //if를 써서 큰 숫자는 작은 숫자로 어떻게든 나눠지게 됨 그게 몫
			n = big-m*small;  // 나머지는 큰 숫자에서 몫과 작은 숫자를 곱한값을 빼면 나옴
			if (n == 0) {      
				a = small; 
				b = (first * second)/a; // 첫번째 입력값과 두번째 입력값을 곱합갓을 최대공약수로 나눠주면 최소공배수가 나옴 
					
				System.out.println("최소공배수: " + b);
				break;
			}
			big = small;
			small = n;
		}
	}
}

		
		
		
		
		
	


