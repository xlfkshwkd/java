
public class Exeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExealTset myTv = new ExealTset();
		
		myTv.channel=7;
		myTv.volume=9;
		myTv.onOff=true;
		myTv.print();
		
		ExealTset yourTv=new ExealTset();
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onOff=true;
		yourTv.print();
	}

}
