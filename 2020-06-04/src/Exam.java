
import java.util.*;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sa = new Scanner(System.in);
		System.out.println("�Ƶ� �� : ");
		a = sa.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("���� �� : ");
		b = sb.nextInt();
		c = a+b;
		System.out.println("�Ѽ��� : " +c);
		
		d = (6000*a)+(8000*b);
	
		System.out.println("�ݾ� : " +d);

	}

}
