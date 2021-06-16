package Ch2_re;

import java.util.Scanner;

public class react15 {

	public static void main789(String[] args) {
		// TODO Auto-generated method stub



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(1);  // 모든수의 소인수는 1을 포함하기에 무조건 나오게 해준다
        
        for (int i = 2; i < N; i++) {  // 그래서 2부터 입력한 수까지 모든 수를 
        	if (N % i == 0) {   //나눈 몫이 0일때 그 수를 출력하게 한다
        		System.out.println(i);     
           }
       }
   }
}