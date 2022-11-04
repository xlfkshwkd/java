import java.util.*;

public class switchddd {

	public static void main(String[] args) {
		int score,nunber;
		char grade;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입혁해 ");
		score=scan.nextInt();
		
		nunber=score/10;
		
		switch(nunber) {
		case 10:
		case 9:
			grade='A';
			break;
		case 7:
			grade='B';
			break;
		case 6:
			grade='C';
			break;
			
		default:
			grade='F';
			break;
		}
		
		
		System.out.print("점수"+ grade);
	}
	

}
