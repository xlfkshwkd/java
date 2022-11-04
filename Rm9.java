import java.util.*;

public class Rm9 {

	public static void main(String[] args) {
		double r,l;
	
		Scanner input=new Scanner(System.in);
		System.out.print("반지름 ");
		r=input.nextDouble();
		l=4.0/3.0*(r*r*r);
		
		System.out.print("구의부피"+l);
	}

}