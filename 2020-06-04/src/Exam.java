
import java.util.*;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sa = new Scanner(System.in);
		System.out.println("아동 수 : ");
		a = sa.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("성인 수 : ");
		b = sb.nextInt();
		c = a+b;
		System.out.println("총수량 : " +c);
		
		d = (6000*a)+(8000*b);
	
		System.out.println("금액 : " +d);

	}

}
