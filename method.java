import java.util.*;
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymeth obj =new Mymeth();
		System.out.println(obj.square(10));
		System.out.println(obj.square(2.35));
		
		String proverb="A barking dog";
		
		String s1,s2,s3,s4;
		System.out.println(" ���ڿ��� ���̴� = " + proverb.length());
		
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
			System.out.print("���ڿ��� �Է��Ͻÿ� >");
			str =sc.next();
			if(str.equals("quit")==true)
				break;
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + "�� 'www '�� �����մϴ�.");
			}else {
				System.out.println(str + " �� 'www' �� ���������ʽ��ϴ�. �ϴ�");
			}
		}
		
		
		
		
		
		
		
	}

}
