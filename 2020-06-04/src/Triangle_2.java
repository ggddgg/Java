
public class Triangle_2 {

	public static void main(String[] args) {
		TriangleExam2 t1 = new TriangleExam2();
		TriangleExam2 t2 = new TriangleExam2();
		
		t1.h1 = 10.2;
		t1.h2 = 17.3;
		
		t2.h1 = 7.5;
		t2.h2 = 9.2;
		
		System.out.println("»ï°¢Çü1 : °¡·Î-"+t1.h1+" ¼¼·Î-"+t1.h2+" ³ÐÀÌ´Â-"+t1.h3());
		System.out.println("»ï°¢Çü2 : °¡·Î-"+t2.h1+" ¼¼·Î-"+t2.h2+" ³ÐÀÌ´Â-"+t2.h3());

	}

}

class TriangleExam2{
	
	double h1;
	double h2;
	
	public double h3() {
		return (h1*h2)/2;
	}
}