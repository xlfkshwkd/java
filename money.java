package money;

public class money {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		long Emoney;
		long Kmoney;
		Emoney =50000;
		Kmoney=Emoney*1134;
		System.out.println(" �ѱ��� :"+ Kmoney+"��.");
		
		int a = 0x0fff;
		int b = 0xfff0;
		
		

		System.out.println("3�� ");
		System.out.printf("%a",(a&b));
		System.out.printf("%a",(a|b));
		System.out.printf("%a",(a^b));
		System.out.printf("%a",~a);
		System.out.printf("%a",(a<<4));
		System.out.printf("%a",(a>>4));
		System.out.printf("%a",(-1>>>4));
		
	}
}
