
import java.util.*;

public class GradeExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Grade me = new Grade();
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� >>");
		me.math = in.nextInt();
		me.science = in.nextInt();
		me.english = in.nextInt();
		System.out.println("����� "+ me.average());
		

	}

}

class Grade{
	int math;
	int science;
	int english;
	
	public int average() {
		return (math+science+english)/3;
	}
}