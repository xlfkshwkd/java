import java.util.*;

public class grade {

	public static void main(String[] args) {
		
		int a;
		Scanner input=new Scanner(System.in);
		
		System.out.print("성적을 입력하시오");
		a=input.nextInt();
		
		if(a>=90)
			System.out.print("A");
		else if(a>=80)
			System.out.print("B");
		else if(a>=70)
		System.out.print("C");
		else if(a>=60)
		System.out.print("D");
		else if(a>=50)
		System.out.print("F");
		
	}

}
