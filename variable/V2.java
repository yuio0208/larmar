package variable;

public class V2 {

	public static void main23(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_x = 0;  // kopo05_x ������ 0 �Է�
		int kopo05_y = 20;  // kopo05_y  ������ 20 �Է� 
		int kopo05_tmp = 0; // kopo05_tmp ������ 0 �Է� 
		// �̷��� �ʱ�ȭ�� ���ִ� ������ �޼ҵ峻������ ���� �ڵ����� �Ҵ��� �ȵǱ� ������
		
		System.out.println("kopo05_x:" + kopo05_x + " kopo05_y:" + kopo05_y); // kopo05_x ��� kopo05_y ���
		
		kopo05_tmp = kopo05_x;  // kopo05_tmp�� kopo05_x ���� 
		kopo05_x = kopo05_y;   // kopo05_x�� kopo05_y ����
		kopo05_y = kopo05_tmp;  // kopo05_y�� kopo05_tmp ���� 
		
		System.out.println("kopo05_x" + kopo05_x + " kopo05_y:"+ kopo05_y);  // kopo05_x�� kopo05_y���� �־���� ������ 20, kopo05_y�� kopo05_tmp���� �־���� ������ 0
		
		
		
	}

}
