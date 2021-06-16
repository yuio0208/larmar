package Akira;

public class Nuck1 {  // class 선언 

	public static void main5(String[] args) {
		// TODO Auto-generated method stub

	
		int kopo05_iA, kopo05_iB;   // kopo05_iA, kopo05_iB 변수 각각 설정 
		
		kopo05_iA =0;    // kopo05_iA 초기값 설정 
		while(true) {     //while문의 조건문 설정 
			
			kopo05_iB=0;    // kopo05_iB 초기값 설정 
			while(true) {        //while문 조건문 설정 이중 while문 설정 
				System.out.printf("*");   //별 찍게 설정
				
				if(kopo05_iA == kopo05_iB) break;   // // kopo05_iA와 kopo05_iB가 같으면 멈추게 if문 설정 
				kopo05_iB++;  // kopo05_iB의 값 1씩 더해가며 별찍음  
			}
			
			System.out.printf("\n");  // 줄 한줄씩 찍게 출력
			kopo05_iA++;  // kopo05_iA의 값 1씩 더해가며 줄 띄어 씀
			if(kopo05_iA ==30)break;  // kopo05_iA가 30 줄이되면 멈추게 설정 
		}
		
		
		
		
		
	}

}
