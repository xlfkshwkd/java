
public class Dog {

	private String name;
	public String breed;
	private int age;
	
	void Dog(String name,int age)
	{
		this.name=name;
		this.age=age;
		breed="NULL";
		System.out.print(name+age+breed);
	}
	void Dog(String name,int age,String breed)
	{
		this.name=name;
		this.age=age;
		this.breed=breed;
		System.out.print(name+age+breed);
	}
	
}
