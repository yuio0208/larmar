package Ch6_re;

public class react1 {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //numbers �迭�� ���� 0���� 10���� 11�� �־��� 
		// �迭�� 0���� ������ 
		
		String[] name = {"kim", "lee", "park","lee"};  // name�迭�� "kim", "lee", "park","lee" �־���
		
		for (int i = 0; i < numbers.length; i++) {   //.length�� �迭�ȿ� ũ�⿡ ���� �ݺ����ش� 
			System.out.println(numbers[10]);   // 0���� �����ؼ� ������ ���, 11��° �ִ� ���� �ݺ��ؼ� ��� 
		}
		
		for (int i = 0; i < name.length; i++) { //0���� �����ؼ� name�迭�� �ִ� ��� �ܾ��� ����ŭ ���
			System.out.println(name[3]);  // 4��° �ִ� �ܾ� ���
		}
		
	}

}
