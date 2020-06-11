
import java.util.*;

public class GradeExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Grade me = new Grade();
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		me.math = in.nextInt();
		me.science = in.nextInt();
		me.english = in.nextInt();
		System.out.println("평균은 "+ me.average());
		

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