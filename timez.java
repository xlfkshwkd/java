import java.util.Date;

public class timez {

	public static void main(String[] args) {
		
		Date time1=new Date();
		int currentHour=time1.getHours();
		
		System.out.println("���� �ð��� "+time1);
		if(currentHour<11) {
			System.out.println("����� ");
		}
		
	}

}
