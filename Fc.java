import java.util.Scanner;

public class Fc {

	public static void main(String[] args) {
		double f,c;
	
		Scanner input=new Scanner(System.in);
		System.out.print("ȭ�ÿµ� �Է� ");
		f=input.nextDouble();
		c=5.0/9.0*(f-32);
		
		System.out.print("�����µ� "+c);
	}

}