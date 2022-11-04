
public class Plane {

	private int ap;
	private String model;
	private String company;
	int count=0;
	
	 void plane(int a,String b,String c)
	{
		ap=a;
		model=b;
		company=c;
		++count;
	}
	 void plane() {
		ap=0;
		model="NULL";
		company="NULL";
		++count;
	}
	void getPlanes()
	{
		System.out.print(count);
	}
}
