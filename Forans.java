import java.util.*;

public class Forans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int n;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		*/
	/*	
		int   i;
		
		for(i=0;i<5;i++)
		{
			System.out.println(i);
		}
		*/
		
/*		int i;
		int sum =0;
		for(i=0;i <= 10;i++);
		{
			sum += i;
		}
		System.out.printf("1부터 10까지의 합"+ sum);
	*/
		
		long fact =1;
		int i=0;
		int n;
		System.out.printf("정수를 입");
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		
		for(i=0;i <= n;i++)
		{
			fact= fact *i;
		}
		
		
		System.out.printf("값은" + n,fact);
		
		
		
		
	}

	
}
