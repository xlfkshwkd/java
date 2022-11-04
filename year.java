
public class year {

		public static void main(String[] arg) {
	
			int x=3;
			int y=4;
			int a = 0x0fff;
			int b = 0xfff0;
			
			System.out.println("1¹ø ");
			System.out.println((x==y)+" ");
			System.out.println((x<y)+" ");
			System.out.println((x>y)+" ");
			System.out.println((x<=y)+" ");
			System.out.println((x!=y)+" ");
			
			System.out.println("2¹ø ");
			System.out.println((x==3)&&(y==7));
			System.out.println((x==3)||y==4);
			
			System.out.println("3¹ø ");
			System.out.printf("%a",(a&b));
			System.out.printf("%a",(a|b));
			System.out.printf("%a",(a^b));
			System.out.printf("%a",~a);
			System.out.printf("%a",(a<<4));
			System.out.printf("%a",(a>>4));
			System.out.printf("%a",(-1>>>4));
			
		}


}
