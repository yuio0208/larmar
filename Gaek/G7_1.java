package Gaek;

public class G7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		G7 kopo05_cal = new G7(); // G7 Ŭ������ ��ü�� ������
		
		System.out.printf("3�� ����ǥ\n");  // ��� ���� 
		System.out.printf("=====================================================\n");  // ���� ���� 
		System.out.println("�̸�   ����   ����   ����   ����   ���");		// �׸� ���� 
		System.out.printf("=====================================================\n");
		System.out.printf("������  %3d    %3d   %3d    %3d    %3d\n\n", 100, 100, 100, kopo05_cal.koppo05_sum1(100, 100, 100), kopo05_cal.koppo05_avg1(100, 100, 100) );  // 3���� �μ��� ������ �޼ҵ� ������ 
		
		
		System.out.printf("4�� ����ǥ\n");
		System.out.printf("=====================================================\n");
		System.out.println("�̸�   ����   ����   ����   ����   ����   ���");		
		System.out.printf("=====================================================\n");
		System.out.printf("������  %3d    %3d   %3d    %3d    %3d    %3d\n\n", 100, 100, 100, 100,  kopo05_cal.koppo05_sum2(100, 100, 100, 100), kopo05_cal.koppo05_avg2(100, 100, 100, 100));
		 // 4���� �μ��� ������ �޼ҵ� ������ 
		
		System.out.printf("5�� ����ǥ\n");
		System.out.printf("=====================================================\n");
		System.out.println("�̸�   ����   ����   ����   ����   ��ȸ   ����   ���");		
		System.out.printf("=====================================================\n");
		System.out.printf("������  %3d    %3d   %3d    %3d     %3d    %3d    %3d\n", 100, 100, 100, 100, 100, kopo05_cal.koppo05_sum3(100, 100, 100, 100, 100), kopo05_cal.koppo05_avg3(100, 100, 100, 100, 100) );
		 // 5���� �μ��� ������ �޼ҵ� ������ 
		
		
	}

}
