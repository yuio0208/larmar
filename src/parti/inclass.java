package parti;

import java.util.Scanner;

public class inclass {
	
	
				public static int inputType() {   // inputType �Լ��� �ƹ��͵� �ȳ־ return���� int�� ���� 
					System.out.printf("������ �����ϼ���.\n1. �ְ��� \n2. �߰���\n"); 
					Scanner sc = new Scanner(System.in);
					int a = sc.nextInt();
				
					while (true) {
					if(a != 1 && a != 2) { 
						System.out.printf("�ٽ�\n");	
						a = sc.nextInt();
					} else {
						break;
					}   
					     
				}  return a;   // return a�� inputType�̶� ���� , void�� ������ return�� ��� ��
				}
				
				
				public static String inputNum() {
					System.out.printf("�ֹι�ȣ ���ڸ��� �Է��ϼ���. \n");
					Scanner sc1 = new Scanner(System.in);
					String a1 = sc1.next();
					
					while (true) {
					if (a1.length() != 6) {
						System.out.printf("���ڸ����̶��\n");
						a1 = sc1.next();
					} else {
						break;
					}
					} return a1;
				
				}
				
				
				public static int inputTh() { 
			
					System.out.printf("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��) \n");
					Scanner sc2 = new Scanner(System.in);
					int a2 = sc2.nextInt();
					
					while (true) {
					if(a2 > 10) {
						System.out.printf("�ִ� 10�����\n");
						a2 = sc2.nextInt();
					} else if (a2 <= 10) {
						break;
					}
					} 
						return a2;	
				}
				
						
				public static int inputWu() { 
					System.out.printf("�������� �����ϼ���.\n"
							+ "1. ���� (���� ���� �ڵ�ó��)\n"
							+ "2. �����\n"
							+ "3. ����������\n"
							+ "4. ���ڳ�\n"
							+ "5. �ӻ��\n");
					Scanner sc3 = new Scanner(System.in);
					int a3 = sc3.nextInt();
					
					while (true) {
						if(a3 == 1) {
							System.out.println("�ڵ�ó��");
							break;
						} else if (a3 == 2 || a3 == 3 || a3 == 4 || a3 == 5) {
							break;
						} else { 
							System.out.println("����\n");
							a3 = sc3.nextInt();  // �� ���⼭ break�� �Ȱɾ� ����?
							
						}
					}
					
					return a3; 
				}
				
				
				public static int inputFin() {
					System.out.printf("��� �߱� �Ͻðڽ��ϱ�?\n"
							+ "1. Ƽ�� �߱�\n"
							+ "2. ����\n");
					Scanner sc4 = new Scanner(System.in);
					int a4 = sc4.nextInt();
					
					while (true) { 
						if(a4 == 1 || a4 ==2) {
							System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
							break;
							
						} else { 
							System.out.println("���ư�");
							break;
							
						}
					}
					return a4;
					 
					
				}
				
				public static int pricePrint() {
					System.out.printf("\n");
					System.out.printf("==============��������=============\n");
					return 0;
					
					
				}
			
			} 

		
		
		

		
		
		
	
	
