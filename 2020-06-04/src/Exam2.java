import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		int a,b,c,d,e;
		int j = 0;
		
		Scanner sa = new Scanner(System.in);
		System.out.println("1�� �Է� : ");
		a = sa.nextInt();
		
		Scanner sb = new Scanner(System.in);
		System.out.println("2�� �Է� : ");
		b = sb.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3�� �Է� : ");
		c = sc.nextInt();
		
		Scanner sd = new Scanner(System.in);
		System.out.println("4�� �Է� : ");
		d = sd.nextInt();
		
		Scanner se = new Scanner(System.in);
		System.out.println("5�� �Է� : ");
		e = se.nextInt();
		
		int[] mNum = new int[] {a,b,c,d,e};
		
		int max = mNum[0];
		
		for(int i=0; i < 5; i++) {
			if(mNum[i] >= max) {
				max = mNum[i];
				j=i+1;
			}
		}
		
		System.out.println("���� ū���� "+j+"��° ������"+max+"�̴�");
		
	}

}
