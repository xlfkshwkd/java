import java.util.*;


public class SAME {
	// private static float[] f = new float[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int [] myScores;    o
	//	 char [] myChars;   o
	//	int [6] myScores;   
	//	Dog myDogs [];  
	//	Dog myDogs [7];  
		
		
	//	float[ ] f = new float(3);
	//	float f2[ ] = new float[ ];  
	//	float[ ]f1 = new float[3];   o
	//	float f3[ ] = new float[3];   o
	//	float f5[ ] = {1.0f, 2.0f, 2.0f};  o
		
	//	int[ ] scores = {1, 2, 3};  
	//	int[ ][ ] scores = {1, 2, 3}, {4, 5, 6};  
	//	String cats[ ] = {"abc", "def", "hij"};  
	//	boolean results[ ] = new boolean [] {true, false, true};  
	
	
	//int[] studentNumbers=new int[30];
		
	//double values []= {1.2,3.3,6.7}	;
		
	//double[] rainfalls= new double[100];	
		
	//	 System.out.println("f[0] = " + f[0]); 
	// int[] employees = new int[5];
		
	
		/*
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[5];
		
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
		}
		*/
		/*
		double[] a= {1.0,2.0,3.0,4.0};
		double sum=0;
		double k= a[0];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("값" +a[i]);
			sum=sum+ a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(k<a[i])
		{k=a[i];}
		}
		System.out.println(" ");
		System.out.println("합은" +sum);
		System.out.println("최대값은?" +k);
		*/
		
		
		/*
		double[] a= {1.0,2.0,3.0,4.0}; 
		
		
		for(double number: a) {
		    System.out.println(number);
		}*/
		
		/*
		int a[]= {9,8,7,6,5,4,3,2,1};
		
		 Arrays.sort(a);
	        
	        for (int i : a) {
	            System.out.print(i+" ");
	        }
	        System.out.println(" ");
	       
	        int idx = Arrays.binarySearch(a, 3); // 배열 ar에서 33을 찾아라.
			System.out.println("INdex : 3의 위치 " + idx);
		*/
		
		/*
		String[]  a= {"Hello","java","World"};
		
		for(String number:a)
		{
			System.out.println(number);
		}
		*/
		
		/*
		int[] a= {1};
		int[] b=a;
		
		
		System.out.print(a.equals(b));
		*/
		
		double[] a= {0,0,0};
		double[] b= {0,0,0};
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Math.random();
			b[i]=Math.random();
		}
		sum=a[0]*b[0]+a[1]*b[1]+a[2]*b[2];
		
		System.out.println(sum);  //17번
		
		/*
		String[] a={ "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] b={ "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", 
				"King", "Ace" };
		
		int k,m;
		
		k=(int)(Math.random()*4);
		m=(int)(Math.random()*13);
	
		System.out.println(a[k]+"의"+b[m]+"임");
	*/
		
		
		/*
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;
		
		int z;
		for(int y=0;y<10;y++)
		{
			z=(int)(Math.random()*100+1);
			if(z<100 &&z >=90)
			{
				a++;
			}
			else if(z<=89 &&z >=80)
			{
				b++;
			}
			else if(z<=79 &&z >=70)
			{
				c++;
			}
			else if(z<=69 &&z >=60)
			{
				d++;
			}
			else if(z<=59 &&z >=50)
			{
				e++;
			}
			else if(z<=49 &&z >=40)
			{
				f++;
			}
			else if(z<=39 &&z >=30)
			{
			g++;
			}
			else if(z<=29 &&z >=20)
			{
				h++;
			}
			else if(z<=19 &&z >=10)
			{
				i++;
			}
			else
			{
				j++;
			}
			
		}
		System.out.print("100-90: ");
		for(int y=0;y<a;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("90-80: ");
		for(int y=0;y<b;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("80-70: ");
		for(int y=0;y<c;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("70-60: ");
		for(int y=0;y<d;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("60-50: ");
		for(int y=0;y<e;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("50-40: ");
		for(int y=0;y<f;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("40-30: ");
		for(int y=0;y<g;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("30-20: ");
		for(int y=0;y<h;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("20-10: ");
		for(int y=0;y<i;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		System.out.print("10-0: ");
		for(int y=0;y<j;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		*/
		
		/*
		Scanner scan =new Scanner(System.in);
		int i=0,k;
		int a,sum=0,b;
	
		System.out.print("학생수을 입력해주세요");
		a=scan.nextInt();
	
		for(int j=0;j<a;j++)
		{
			System.out.print("학생"+ (j+1) +"의성적입력해주세요");
			b=scan.nextInt();
			if(b>100)
			{
				System.out.print("잘못입력함 다시입력해주세요\n");
				continue;
			}
			sum=sum+b;
		}
		k=sum/a;
		System.out.print("성적 평균은" + k +"입니다");
	*/
		/*
			String[] hexa = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
					"1011", "1100", "1101", "1110", "1111" };

			String num;
			System.out.print("16진수 문자열을 입력하시오 : ");
			num = new Scanner(System.in).nextLine();
			System.out.print(num + "에 대한 이진수는 ");

			for (int i = 0; i < num.length(); i++) {
				switch (num.charAt(i)) {
				case '0':
					System.out.print(hexa[0]);
					System.out.print(" ");
					break;
				case '1':
					System.out.print(hexa[1]);
					System.out.print(" ");
					break;
				case '2':
					System.out.print(hexa[2]);
					System.out.print(" ");
					break;
				case '3':
					System.out.print(hexa[3]);
					System.out.print(" ");
					break;
				case '4':
					System.out.print(hexa[4]);
					System.out.print(" ");
					break;
				case '5':
					System.out.print(hexa[5]);
					System.out.print(" ");
					break;
				case '6':
					System.out.print(hexa[6]);
					System.out.print(" ");
					break;
				case '7':
					System.out.print(hexa[7]);
					System.out.print(" ");
					break;
				case '8':
					System.out.print(hexa[8]);
					System.out.print(" ");
					break;
				case '9':
					System.out.print(hexa[9]);
					System.out.print(" ");
					break;
				case 'a':
					System.out.print(hexa[10]);
					System.out.print(" ");
					break;
				case 'b':
					System.out.print(hexa[11]);
					System.out.print(" ");
					break;
				case 'c':
					System.out.print(hexa[12]);
					System.out.print(" ");
					break;
				case 'd':
					System.out.print(hexa[13]);
					System.out.print(" ");
					break;
				case 'e':
					System.out.print(hexa[14]);
					System.out.print(" ");
					break;
				case 'f':
					System.out.print(hexa[15]);
					System.out.print(" ");
					break;
				default:
					System.out.print("잘못된 값");
		
				}
				}
				*/
		
				}
	}
	/*
	void init(double[] values){
		values = new double[5]; 
	}*/	

