import java.util.*;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,k=1;
		int n;
		int sum=0;
		//while(i<5)
	//	{
	//		System.out.println("ȯ��");
	//		i++;
	//	}
	
		/*
		while(i<10)
		{
			n=9*i;
			System.out.println(n+ "="+ i+ "*" +i);
			i++;
		}
	*/
		
	/*		while(i<11)
			{
				sum=sum+i;
				i++;
				
				System.out.println(sum);
			}
			
		*/	
			
		Scanner input=new Scanner(System.in);
		int mounth;
	
		
		do {
			System.out.println("���� �Է��Ͻÿ�");
			mounth =input.nextInt();
			
		}
		
		while(mounth<1 || mounth >12);
		
		
		System.out.println("�ÿ��� ��" +mounth);
	}

}
