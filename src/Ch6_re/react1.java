package Ch6_re;

public class react1 {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //numbers 배열에 숫자 0부터 10까지 11개 넣어줌 
		// 배열은 0부터 시작함 
		
		String[] name = {"kim", "lee", "park","lee"};  // name배열에 "kim", "lee", "park","lee" 넣어줌
		
		for (int i = 0; i < numbers.length; i++) {   //.length로 배열안에 크기에 대해 반복해준다 
			System.out.println(numbers[10]);   // 0부터 시작해서 끝까지 출력, 11번째 있는 수를 반복해서 출력 
		}
		
		for (int i = 0; i < name.length; i++) { //0부터 시작해서 name배열에 있는 모든 단어의 수만큼 출력
			System.out.println(name[3]);  // 4번째 있는 단어 출력
		}
		
	}

}
