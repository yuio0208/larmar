package project;

public class pro {

	public static void main5555(String[] args) {
		// TODO Auto-generated method stub
		
		
		int kopo05_i = 17/3;
		System.out.printf("%d\n",kopo05_i); // 17을 3으로 나눈 나머지 값을 정수로 표현

		
		double kopo05_who = 17/3; // double이어서 소수점도 표현
		
		System.out.printf( "%f\n", kopo05_who);
		
		double kopo05_why = 17/3.0; // 정수를 실수로 나눠주기 때문에 실수로 나온다 (한개라도 실수 형태가 있어서)
		
		System.out.printf("%f\n", kopo05_why); 
		
		double kopo05_where = 17.0/3;//실수를 정수으로 나눠주기 때문에 실수로 나온다 (한개라도 실수 형태가 있어서)
		
		System.out.printf("%f\n", kopo05_where);
		
		double kopo05_how = (17.0)/3+0.5;//실수를 정수으로 나눠주기 때문에 실수로 나온다 + 0.5
		
		System.out.printf("%f\n",kopo05_how); 
	
		double kopo05_when = (int)((17.0)/3+0.5);  
		
		System.out.printf("%f\n",kopo05_when); // 다계산한 값은 kopo05_how이고 정수형으로 변환하면 소수점이하로는 다버려진다
		
		
	}
}
