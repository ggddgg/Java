
public class Triangle {

	public static void main(String[] args) {
		
		TriangleExam t1 = new TriangleExam();
		TriangleExam t2 = new TriangleExam();
		
		t1.h1 = 10.2;
		t1.h2 = 17.3;
		
		t2.h1 = 7.5;
		t2.h2 = 9.2;
		
		System.out.println("삼각형1 : 가로-"+t1.h1+" 세로-"+t1.h2);
		t1.h3();
		System.out.println("삼각형2 : 가로-"+t2.h1+" 세로-"+t2.h2);
		t2.h3();
		
	}

}

class TriangleExam{
	
	double h1;
	double h2;
	
	public void h3() {
		System.out.println("넓이는 "+h1*h2/2);
	}
}