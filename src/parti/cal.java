package parti;

public class cal {
	
	

	 public void input() {
		 
		 int[][] b = {{56000, 47000, 44000, 44000},{46000, 40000, 37000, 37000}};
		 double[] c = {0.4, 0.5, 0.2, 0.15};
		 
		 
		 Ru input = new Ru();
		 
		 
		 inclass inpuclass = new inclass();
		 
		 
		 
		 int choice = inclass.inputType();
		 String choice1 = inclass.inputNum();
		 int choi = Integer.parseInt(choice1);
		 ree(choi);
		 int choice2 = inclass.inputTh();
		 int choice3 = inclass.inputWu();
	 }
		 
	 public static int ree(int choi) {
			 
		 int tr = 1000000;
		 int c1 = choi + tr;
		 int calcIdf = c1 % 10000;
		 int calcIdb = c1 / 10000;
		 int calc = 0;
		 
		 if (calcIdf>100) {
			 calc = (2021 - (1800 + calcIdf));
			 System.out.println(calc);
		 } else {
			 calc = (2021 - (1900 + calcIdf));
			 System.out.println(calc);
		 } 
		 return calc;
		 } 
		
		 
		public static int lee(int calc) {
		
		if (calc <= 64 && calc >= 19) {
			 System.out.println("대인");
		 } else if (calc <= 18 && calc >= 13) {
			 System.out.println("청소년");
		 } else if (calc <= 12 && calc >= 3) {
			 System.out.println("소인");
		 } else if (calc >= 65) {
			 System.out.println("경로");
		 } else {
			 System.out.println("유아");
		 }
		return calc;
	 
		}
		 
		 
		
	
	
	 
}
