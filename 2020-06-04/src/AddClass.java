
import java.util.*;

public class AddClass {

	public static void main(String[] args) {
		
		int a,b;
		
		System.out.println("���� ���� : ");
		Scanner a1 = new Scanner(System.in);
		a = a1.nextInt();

		System.out.println("������ ���� : ");
		Scanner b1 = new Scanner(System.in);
		b = b1.nextInt();
		
		int ab = 0;
		int i2 = 0;
		
		for(int i = a; i <= b; i++) {
			ab = i+i2;
			i2 = ab;
		}
		
		System.out.println(a+"����"+b+"������ ���� "+ab);
	}

}
