package burn;

import java.util.ArrayList;

public class StudentProjectClass {

	public static void main32(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentInfo> stuInfoArr = new ArrayList<StudentInfo>();
		
		StudentInfo stuInfo = null;
		
		for (int i = 0; i < 10; i++) {
			stuInfo = new StudentInfo();
			stuInfo.setName("김범주" + i);
			stuInfo.setId(20210415 + i);
			stuInfo.setBirth(19960208 + i);
			stuInfo.setAddress("경기도 성남시 분당구" + i);
			stuInfo.setScore(4.5 + i);
			stuInfo.setBloodType((char)(65 + i));
			stuInfoArr.add(stuInfo);
		}
		
		System.out.println("이름    학점\t  생일");
		for (int i =0; i < 10; i++) {
			StudentInfo info = stuInfoArr.get(i);
			System.out.println(info.getName() + "\t" + info.getScore() + "\t" + info.getBirth());
		}
		
	}

}
