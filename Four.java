import java.util.*;

public class Four {
	public static void main(String[] args) {
		
	/*
		int n,count=0,b;
	int max=0,min=0;
	System.out.printf("���ϴ� ���� n���� ");
	Scanner scan =new Scanner(System.in);
	n=scan.nextInt();
	System.out.printf("���ϴ� ���� b���� ");
	b=scan.nextInt();
	if(n>b)
	{
		max=n;
		min=b;
	}
	else
	{
		max=b;
		min=n;
	}
	System.out.printf("ī��Ʈ�� ������ "+max+min);
	*/
		
	/*
	  if(n >= 20 && n<60)
	{
		count++;
		System.out.print("ī��Ʈ�� ������ " +count);
	}
	else
	{
		System.out.print("zzzz");
	}*/
	/*
		int n=1,y=0;
	if(1 <= n &&n <= 20)
	{
		y=n;
		
	}*/
	/*	int i;
		for(i=0;;i++)
		{
			System.out.println("zzzz");
		}
		*/
	/*	
	int n=0;	
	
	while(n !=1)
	{
		System.out.println("zzzz");
	}*/
		/*
		int age = 19;
		
		if( age > 20 )
			if( age < 65 )
				System.out.println("1�� �׷�");
			else 
				System.out.println("2�� �׷�");
		
		System.out.println("3�� �׷�");
*/
		/*
		int  grade = 3;
		switch(grade) 
		{
			case 3:
				System.out.println("����");
				break;
			case 0:
				System.out.println("����");
				break;
		}
		
*/
		/*
		int i = 0;
		while(i < 10)
		{
			System.out.println("i="+i);
			i += 3;
		}
*/
		/*
		int i = 0, sum = 0;
		while(i < 10 )
		{
			sum += i++;
			if( i % 3 == 0 ) continue;
			System.out.println("i="+i);
			if( sum > 10 ) break;
		}*/
		
	/*	int x=3;
	 * Scanner scan=new Scanner(System.in);
		System.out.println("�� �ڸ� �Է��� ");
		x=scan.nextInt();
*/
		/*
		if (x >= 0)
		{	{if (x == 0)
				{System.out.println("first");}
			else
			{System.out.println("second");}
			}
		}
		System.out.println("third");
		
		*/
		/*
		int x,sum=0,k=0,j=0;
		for(int i=10;i <= 30;i++)
		{
			for(j=0;j<=5;j++)
				{
				k=i*j;
				}
			sum=sum+k;
		}
		System.out.println(sum);*/
		
		/*     9�� ���� 
		int sum=0,k=0,sum2=0;
		
		for(int i=0;i<100;i++)
		{
			k=i%3; 
			if(k==0)
			{
				sum=sum+i;
			}
			k=i%4;
			if(k==0)
			{
				sum=sum+i;
			}
			
			sum2=sum2+i;
		}
		
		System.out.print(sum2-sum);
		*/
		/*
		int n;
		System.out.print("������ �����Ͻÿ�");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		if(n==1)
		{
			System.out.print("one");
		}
		else if(n==2)
		{System.out.print("two");
		}	
		else if(n==3)
		{System.out.print("third");
		}	
		else if(n==4)
		{System.out.print("Four");
		}	
		else if(n==5)
		{System.out.print("five");
		}	
		else if(n==6)
		{System.out.print("six");
		}	
		else if(n==7)
		{System.out.print("SEVEN");
		}	
		else if(n==8)
		{System.out.print("Eight");
		}	
		else if(n==9)
		{System.out.print("nine");
		}	
		else
			System.out.print("Other");
*/
		
		/*
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			
			for(i=1;i<=100;i++)
			{	sum=sum+i;
			
			}
		}System.out.print(sum);
		*/
		//����ڷκ��� 3���� ���ڸ� �Է¹޾Ƽ� ���� ū ���ڸ� ����ϴ� ���α׷� �ۼ�
       /*
		int num1,num2,num3;//���� 3�� �Է¹��� ���� ����
        int big,middle,small;//���� �ΰ��� �� ���� ������ ���� ����
        
        Scanner input = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        num1 = input.nextInt();//���� 1 �Է�
        System.out.print("���� �Է� : ");
        num2 = input.nextInt();//���� 2 �Է�
        System.out.print("���� �Է� : ");
        num3 = input.nextInt();//���� 3 �Է�
        
        big = (num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
        small = (num2>num1)&&(num3>num1)?num1:(num2>num3?num3:num2);
        middle = (num1>num2)?((num1>num3)?((num2>num3)?num2:num3):num1):
        	((num2>num3)?((num1>num3)?num1:num3):num2);
        System.out.println(big);
        System.out.println(middle);
        System.out.println(small); 
*/
		/*
		String n;
		Scanner scan=new Scanner(System.in);
		System.out.println("�Է����ּ���"); 
		n=scan.next();
		
		switch(n)
		{
		case "a":
			System.out.print("����");
		break;
		case "e":
			System.out.print("����");
		case "o":
			System.out.print("����");
		case "u":
			System.out.print("����");
		break;
		default:
		System.out.print("����");
		break;
		
		}
		*/
		/*
		double n,k,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ű�Է����ּ���"); 
		n=scan.nextDouble();
		
		k= (n-100)*0.9;
		
		System.out.println("����� ü���� ����"); 
		j=scan.nextFloat();
		if(j>k)
		{
			System.out.println("��ü��"); 
		}
		else if(k==j)
		{
			System.out.println("ǥ��ü��"); 
		}
		else
		{
			System.out.println("��ü��"); 
		}
		*/
		
		/*
		int x,y,z;
		int min=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ű�Է����ּ���"); 
		x=scan.nextInt();
		System.out.println("Ű�Է����ּ���"); 
		y=scan.nextInt();
		System.out.println("Ű�Է����ּ���"); 
		z=scan.nextInt();
		
		
		if(x>y)
		{
			if(y>z)
			{
				min=z;
			}
			else
			{
				min=y;
			}
		}
		else
		{	if(x>z)
		{
			min=z;
		}
		else
		{
			min=x;
		}
		}
		System.out.println("" + min); 
		*/
		/*
		float x,s;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ű�Է����ּ���"); 
		x=scan.nextFloat();
		
		if(x <= 0)
		{
			s=(x*x*x)-9*x+2;
			System.out.println("f(x)=" + s); 
		}
		else
		{
			s=(7*x)+2;
			System.out.println("f(x)=" + s); 
		}*/
		
		/*
		int i, j;
		for (i = 2; i <= 100; i++){
			for (j = 2; j <= i; j++){

				if (i % j == 0)

	                break;

			}
			if (i == j)

				System.out.println(""+ i); 

		}*/
		/*
		int i,j;
		
		for(i=1;i<=9;i++)
		{
			
			for(j=1;j<=9;j++)
			{
				System.out.print("	"+ j*i); 
			}
			System.out.println();
		}*/
		/*
		int i,j,k;
		
		for(i=1;i<=100;i++)
		{
			for(j=1;j<=100;j++)
			{
				for(k=1;k<=100;k++)
				{
					if(i*i + j*j==k*k)
					{
						System.out.println(i +" "+ j + " "+ k);
					}
				}
					
			}
		}*/
		
		/*
		float a,b,k;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է����ּ���"); 
		a=scan.nextFloat();
		
		System.out.println("�����Է����ּ���"); 
		b=scan.nextFloat();
		
		System.out.println("��ȣ�Է����ּ���"); 
		String operator = scan.next();

		if(operator.equals("+"))
		{
			k=a+b;
			System.out.println(a + "+" + b +"=" + k);
		}
		else if(operator.equals("-"))
		{
			k=a-b;
			System.out.println(a + "-" + b +"=" + k);
		}
		else if(operator.equals("*"))
		{
			k=a*b;
			System.out.println(a + "*" + b +"=" + k);
		}
		
		else if(operator.equals("/"))
		{
			if(a==0)
			{System.out.println("�и� 0�� ");
			}
			k=a/b;
			System.out.println(a + "/" + b +"=" + k);
		}
		else
		{
			System.out.println("�Ƹ��� ��ȣ�������");
		}*/
		/*
		int sum=0,k=0;
		int a;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			else if(i%4==0)
			{
				sum=sum+i;
			}
			
			if(i%12==0)
			{
				k=k+i;
			}
			
		}
		
		a=5500-sum-k;
		System.out.println("����"+ a );
		*/
		
		/*
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(6==i+j)
				{
					System.out.println("("+ i + "," + j +")");
				}
			}
		}
		*/
		/*
		for(int x=0;x<=10;x++)
		{
			for(int y =0;y<=10;y++)
			{
				if(100==3*x+10*y)
				{
					System.out.println("("+ x + "," + y +")");
				}
			}
		}*/
		/*
		for(int i=0;i<=10;i++)
		{for(int j=0;j<=10;j++)
		{
			for(int k=0;k<=10;k++)
		ny	{
				if(i+j+k==10)
				{
					System.out.println("("+ i + "," + j + "," + k +")");
				}
			}
		}
			
		}*/
		/*
		int k;
		Scanner scan=new Scanner(System.in);
		System.out.println("���ױ��� �Է����ּ���"); 
		k=scan.nextInt();
		
		long a = 0, b = 1, c;      
        int i;
        
        for(i = 2; i <= k+1; i++)
        {
        
           c=a+b;// ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
           a=b;// ���� b�� ���� ���� a�� �ű��. 
           b=c;// ���� c�� ���� ���� b�� �ű��. 
           System.out.print(" "+ a);
        }
		*//*
		int sum=0;
		 for(int i=1;i<=100;i++) {
	            for(int j=1;j<=i;j++) {
	                sum+=j;}
		 }
		System.out.print(" "+ sum);
		*/
		
		
		double n;
		
		double sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է����ּ���"); 
		n=scan.nextDouble();
		
		for(int i=1;i<=n;i++)
		{
			sum+=(1.0/i);
		}
		
		 System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
}
}
