
public class Person {
	private String name,adress,phone;
	
	 void Setabc(String a,String b,String c)
	 {
		name=a; 
		adress=b;
		phone=c;
		
	 }
	 
	 public String getname()
	 {
		 return name;
	 }
	 public String getadress()
	 {
		 return adress;
	 }
	 public String getnumber()
	 {
		 return phone;
	 }
	 
}
class Customer extends Person{
	
	int cumstmern;
	int ma;
	public Customer()
	{
		super();
	}
	
	public Customer(String a,String b, String c)
	{
		super(a,b,c);
	}
	public Customer(int c,int k)
	{
		cumstmern=c;
		ma=k;
	}
	public int getCustomerN() {
		return cumstmern;
	}
	public int getm()
	{
		return ma;
	}
	
}
