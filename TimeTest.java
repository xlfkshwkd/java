public class TimeTest {

	public static void main(String[] args) {
		Time time=new Time();
		System.out.println("�⺻ ������ ȣ���� �ð�:"+time.toString());

		Time time2=new Time(13,27,6);
		System.out.println("�⺻ ������ ȣ���� �ð�:"+time2.toString());
		
		Time time3=new Time(99,66,77);
		System.out.println("�ùٸ��� �ʴ� ȣ�� �ð�:"+time3.toString());
	}

}
