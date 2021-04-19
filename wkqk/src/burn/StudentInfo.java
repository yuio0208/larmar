package burn;

public class StudentInfo {
	
	private String name;
	private int id; 
	private int birth;          //private�� ������ �ȵ� �׷��� getter setter ���� 
	private String address;
	private double score;
	private char bloodType;
	
	
	
	public String getName() {      // getter�� ������ ���°� 
		return name;
	}
	public void setName(String name) {   // setter�� ���� ���ִ°�
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if (score < 0 || score >5) {
			this.score = 0;
		} else {
			this.score = score;
		}
	}
	public char getBloodType() {
		return bloodType;
	}
	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	} 


}














