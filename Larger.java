import java.util.*;


public class Larger {
	public static void main(String args[]) {
		int x,y,max;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("ù��° ������ �����Ͻÿ� ");
		x=input.nextInt();
		
		System.out.printf("�ι�° ������ �����Ͻÿ� ");
		y=input.nextInt();
		
		if (x>y)
			max=x;
		else
		max=y;
		
		System.out.println("ū����"+max);
		
	}

}
