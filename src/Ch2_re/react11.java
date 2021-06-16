package Ch2_re;

public class react11 {

	public static void main777(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while (true) {  // 전체 큰 while문 설정 
			int j = 2;
 			while (true) {  // 작은 while문 설정 
			
				switch (j) {  
				 	case 2:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;     
				 	case 3:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 4:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 5:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 6:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 7:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 8:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
				 	case 9:
				 		System.out.println(i + "x" + j + "=" + i*j);
				 		break;
			 		
				}
			
			j++;   // 전체 돌고나면 j에 +1한후 다시 반복  
			if (j == 10) 
				break;  // 10에서 멈추게 설정 
			}
			i++;   // 전체 돌고나면 i에 +1 
			if (i == 10)
				break; // 전체 큰 while에서 10에서 멈추게 설정 
		}
		
		
	}

}
