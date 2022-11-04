import java.util.*;

public class Test {
	public static void main(String[] args) {
	/*  3qjs
		double k=4000;
		double k1=4000;
		
		for(int i=1;i<=40;i++)
		{
			k = k+(k/100)*(25/12);
			k=k-100;
	
			
		}
		
		System.out.print(k1-k);
	*/
		/*
		int [][] score= {{100,98,97,100},{30,45,67,80},
				{89,98,78,67},{78,56,76,87}
		,{0,15,37,9}};
		
		for(int i=0;i < score.length;i++)
		{
			for(int j=0;j < score[i].length;j++)
			{
				System.out.println(1+i+"번쨰학생은"+ (1+j) +"과목의" +score[i][j]  +"점수입니다");
			}
		}
		*/
		
		int a[][]=new int[100][];
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[100].length;j++)
			{	a[i][j]=i*j;
				System.out.println(i * j +"="+  a[i][j]);
		
			}
		
		}
		
		
		
		
		
		
		
		
		
	}
}