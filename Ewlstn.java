import java.util.Scanner;

public class Ewlstn {

	public static void main(String[] args) {
		int i,l,k;
	
		Scanner input=new Scanner(System.in);
		System.out.print("정수입력 ");
		k=input.nextInt();
		i=k;
		l=i%2;
		System.out.print(k+":는");
		System.out.print(l);
		i=i/2;
		l=i%2;
		System.out.print(l);
		i=i/2;
		l=i%2;
		System.out.print(l);
		i=i/2;
		l=i%2;
		System.out.print(l);
		i=i/2;
		l=i%2;
		System.out.print(l);
		i=i/2;
		l=i%2;
		System.out.print(l);
	}

}