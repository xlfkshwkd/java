import java.util.*;
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymeth obj =new Mymeth();
		System.out.println(obj.square(10));
		System.out.println(obj.square(2.35));
		
		String proverb="A barking dog";
		
		String s1,s2,s3,s4;
		System.out.println(" 문자열의 길이는 = " + proverb.length());
		
		s1=proverb.concat("never Bites!");
		s2=proverb.replace('B', 'b');
		s3=proverb.substring(2,5);
		s4=proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String str;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("문자열을 입력하시오 >");
			str =sc.next();
			if(str.equals("quit")==true)
				break;
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + "은 'www '로 시작합니다.");
			}else {
				System.out.println(str + " 은 'www' 로 시작하지않습니다. 니다");
			}
		}
		
		
		
		
		
		
		
	}

}
