import java.util.Scanner;

public class Fc {

	public static void main(String[] args) {
		double f,c;
	
		Scanner input=new Scanner(System.in);
		System.out.print("È­½Ã¿Âµµ ÀÔ·Â ");
		f=input.nextDouble();
		c=5.0/9.0*(f-32);
		
		System.out.print("¼·¾¾¿Âµµ "+c);
	}

}