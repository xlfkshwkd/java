import java.util.*;

public class bous {

	public static void main(String[] args) {
		final int asdf=1000;
		int asd; //����
		int zxc;  //���ʽ�
		String zxcv;  //�Ѱ�

		Scanner input =new Scanner(System.in);
		System.out.print(" ������ ���� ");
		asd=input.nextInt();
		
		if(asdf<asd) {
			zxcv="���� �޼�";
			zxc=(asd-asdf)/10;
		}
		else {
			zxcv="���� ����";
			zxc=0;
		}
		System.out.println(zxcv+"\n"+"���ʽ�"+ zxc);
		
		
	}

}
