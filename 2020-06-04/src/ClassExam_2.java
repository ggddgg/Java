
public class ClassExam_2 {

	public static void main(String[] args) {
		
		Student_2 st1 = new Student_2();
		Student_2 st2 = new Student_2();
		
		st1.name = "김현우";
		st1.grade = 3;
		
		st2.name = "이민우";
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
			System.out.println("3학년은 4층입니다.");
		}
		
		if(grade == 2) {
			System.out.println("2학년은 5층입니다.");
		}
		
		if(grade == 1) {
			System.out.println("1학년은 6층입니다.");
		}
	}
	
}