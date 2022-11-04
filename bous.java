import java.util.*;

public class bous {

	public static void main(String[] args) {
		final int asdf=1000;
		int asd; //월급
		int zxc;  //보너스
		String zxcv;  //총값

		Scanner input =new Scanner(System.in);
		System.out.print(" 실적을 입혁 ");
		asd=input.nextInt();
		
		if(asdf<asd) {
			zxcv="실적 달성";
			zxc=(asd-asdf)/10;
		}
		else {
			zxcv="실적 실패";
			zxc=0;
		}
		System.out.println(zxcv+"\n"+"보너스"+ zxc);
		
		
	}

}
