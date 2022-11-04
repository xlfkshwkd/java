import java.util.*;

public class Four {
	public static void main(String[] args) {
		
	/*
		int n,count=0,b;
	int max=0,min=0;
	System.out.printf("원하는 숫자 n입혁 ");
	Scanner scan =new Scanner(System.in);
	n=scan.nextInt();
	System.out.printf("원하는 숫자 b입혁 ");
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
	System.out.printf("카운트가 증가됨 "+max+min);
	*/
		
	/*
	  if(n >= 20 && n<60)
	{
		count++;
		System.out.print("카운트가 증가됨 " +count);
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
				System.out.println("1번 그룹");
			else 
				System.out.println("2번 그룹");
		
		System.out.println("3번 그룹");
*/
		/*
		int  grade = 3;
		switch(grade) 
		{
			case 3:
				System.out.println("만점");
				break;
			case 0:
				System.out.println("영점");
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
		System.out.println("숫 자를 입력해 ");
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
		
		/*     9번 문제 
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
		System.out.print("정수를 입혁하시오");
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
		//사용자로부터 3개의 숫자를 입력받아서 가장 큰 숫자를 출력하는 프로그램 작성
       /*
		int num1,num2,num3;//숫자 3개 입력받을 변수 선언
        int big,middle,small;//숫자 두개의 비교 값을 저장할 변수 선언
        
        Scanner input = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        num1 = input.nextInt();//숫자 1 입력
        System.out.print("숫자 입력 : ");
        num2 = input.nextInt();//숫자 2 입력
        System.out.print("숫자 입력 : ");
        num3 = input.nextInt();//숫자 3 입력
        
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
		System.out.println("입력해주세용"); 
		n=scan.next();
		
		switch(n)
		{
		case "a":
			System.out.print("모음");
		break;
		case "e":
			System.out.print("모음");
		case "o":
			System.out.print("모음");
		case "u":
			System.out.print("모음");
		break;
		default:
		System.out.print("자음");
		break;
		
		}
		*/
		/*
		double n,k,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("키입력해주세용"); 
		n=scan.nextDouble();
		
		k= (n-100)*0.9;
		
		System.out.println("당신의 체중을 내놔"); 
		j=scan.nextFloat();
		if(j>k)
		{
			System.out.println("과체중"); 
		}
		else if(k==j)
		{
			System.out.println("표준체중"); 
		}
		else
		{
			System.out.println("저체중"); 
		}
		*/
		
		/*
		int x,y,z;
		int min=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("키입력해주세용"); 
		x=scan.nextInt();
		System.out.println("키입력해주세용"); 
		y=scan.nextInt();
		System.out.println("키입력해주세용"); 
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
		System.out.println("키입력해주세용"); 
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
		System.out.println("숫자입력해주세용"); 
		a=scan.nextFloat();
		
		System.out.println("숫자입력해주세용"); 
		b=scan.nextFloat();
		
		System.out.println("기호입력해주세용"); 
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
			{System.out.println("분모가 0임 ");
			}
			k=a/b;
			System.out.println(a + "/" + b +"=" + k);
		}
		else
		{
			System.out.println("아몰라 기호적으라고");
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
		System.out.println("합은"+ a );
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
		System.out.println("몇항까지 입력해주세용"); 
		k=scan.nextInt();
		
		long a = 0, b = 1, c;      
        int i;
        
        for(i = 2; i <= k+1; i++)
        {
        
           c=a+b;// 변수 a와 b를 더하여 변수 c에 대입한다.
           a=b;// 변수 b의 값을 변수 a로 옮긴다. 
           b=c;// 변수 c의 값을 변수 b로 옮긴다. 
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
		System.out.println("숫자입력해주세용"); 
		n=scan.nextDouble();
		
		for(int i=1;i<=n;i++)
		{
			sum+=(1.0/i);
		}
		
		 System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
}
}
