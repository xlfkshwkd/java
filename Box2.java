import java.util.*;

public class Box2 {

	public static void main(String[] args) {
		int boxa;
		int og;
		int ogbox;
		Scanner input=new Scanner(System.in);
		System.out.print("오랜지의 개수를 입력");
		ogbox=input.nextInt();
		boxa=ogbox/10;
		og=ogbox%10;
		System.out.println(boxa+"개의 박스가 필요하고 "+og+"남습니다");

	}

}