
public class ClassExam {

	public static void main(String[] args) {
		
		
		Student kim = new Student();
		Student lee = new Student();
		kim.name = "������";
		kim.grade = 3;
		System.out.println("�л��� �̸���"+kim.name+"�̰�, "+kim.grade+"�г��Դϴ�.");
		
		lee.name = "�̹ο�";
		lee.grade = 2;
		System.out.println("�л��� �̸���"+lee.name+"�̰�, "+lee.grade+"�г��Դϴ�.");

	}

}

class Student{
	
	String name;
	int grade;
	
	
}