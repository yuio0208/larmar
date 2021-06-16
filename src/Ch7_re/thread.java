package Ch7_re;

import java.util.Scanner;

public class thread {

	public static void main22222(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			int second = sc.nextInt();

			try {
				System.out.println("start");
				Thread.sleep(1000 * second);
				System.out.println("finish");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}


