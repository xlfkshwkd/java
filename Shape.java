
public class Shape {

	private int x,y;
	private double size;
	public int getX() {return x;}
	public int getY() {return y;}
	public double getSize() {return size;}
	public void SetX(int x) {this.x=x;}
	public void SetY(int y) {this.y=y;}
	public void SetSize(int size) {this.size=size;}
	public double area()
	{
		return size;
	}
	public double Csize()
	{
		return size;
	}
	class Triangle extends Shape
	{
		private double h,base;
		public double geth() {return h;}
		public double getbase() {return base;}
		
		public void seth(double h) {this.h=h;}
		public void setbase(double base) {this.base=base;}
		
		Triangle(double h, double base)
		{
			this.h=h;
			this.base=base;
		}
		public double area(double h, double base)
		{
			super.SetSize(h*base/2);
			return super.getSize();
		}
		public double Csize(double h,double base)
		{
			h=Math.pow(h, 2);
			base=Math.pow(h, 2);
			super.SetSize(geth()+getbase()+Math.pow(h+base));
			return super.getSize();
		}
		public String toString()
		{
			return "πÿ∫Ø:"+ getbase() + "≥Ù¿Ã: " + geth()+ "≥–¿Ã "+ area(geth(),getbase())+
					"µ—∑°: " +Csize(geth(),getbase()); 
		}
			
	}
}
