
public class ClassExam_2 {

	public static void main(String[] args) {
		
		Student_2 st1 = new Student_2();
		Student_2 st2 = new Student_2();
		
		st1.name = "������";
		st1.grade = 3;
		
		st2.name = "�̹ο�";
		st2.grade = 2;
		
		st1.floor();
		st2.floor();
		
	}

}

class Student_2{
	
	String name;
	int grade;
	
	public void floor() {
		if(grade == 3) {
			System.out.println("3�г��� 4���Դϴ�.");
		}
		
		if(grade == 2) {
			System.out.println("2�г��� 5���Դϴ�.");
		}
		
		if(grade == 1) {
			System.out.println("1�г��� 6���Դϴ�.");
		}
	}
	
}