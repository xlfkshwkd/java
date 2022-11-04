public class TimeTest {

	public static void main(String[] args) {
		Time time=new Time();
		System.out.println("기본 생성자 호출후 시간:"+time.toString());

		Time time2=new Time(13,27,6);
		System.out.println("기본 생성자 호출후 시간:"+time2.toString());
		
		Time time3=new Time(99,66,77);
		System.out.println("올바르지 않는 호출 시간:"+time3.toString());
	}

}
