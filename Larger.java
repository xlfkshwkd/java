import java.util.*;


public class Larger {
	public static void main(String args[]) {
		int x,y,max;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("첫번째 정수를 입혁하시오 ");
		x=input.nextInt();
		
		System.out.printf("두번째 정수를 입혁하시오 ");
		y=input.nextInt();
		
		if (x>y)
			max=x;
		else
		max=y;
		
		System.out.println("큰수는"+max);
		
	}

}
