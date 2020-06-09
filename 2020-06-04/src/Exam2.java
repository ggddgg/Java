import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		int a,b,c,d,e;
		int j = 0;
		
		Scanner sa = new Scanner(System.in);
		System.out.println("1번 입력 : ");
		a = sa.nextInt();
		
		Scanner sb = new Scanner(System.in);
		System.out.println("2번 입력 : ");
		b = sb.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3번 입력 : ");
		c = sc.nextInt();
		
		Scanner sd = new Scanner(System.in);
		System.out.println("4번 입력 : ");
		d = sd.nextInt();
		
		Scanner se = new Scanner(System.in);
		System.out.println("5번 입력 : ");
		e = se.nextInt();
		
		int[] mNum = new int[] {a,b,c,d,e};
		
		int max = mNum[0];
		
		for(int i=0; i < 5; i++) {
			if(mNum[i] >= max) {
				max = mNum[i];
				j=i+1;
			}
		}
		
		System.out.println("가장 큰수는 "+j+"번째 숫자인"+max+"이다");
		
	}

}
