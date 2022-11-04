import java.util.*;


public class A0428 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//            Math.random();

    	double m2,k,m1;
    	
		Scanner input=new Scanner(System.in);
		System.out.print("마일을 입력");
		m2=input.nextDouble();
		k=1.609;
		m1=m2*k;
	
		System.out.println(m2+"마일은 "+m1+"킬로미터입니다");

    }

}