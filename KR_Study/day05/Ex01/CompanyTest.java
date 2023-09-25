package Ex01;

public class CompanyTest {
    public static void main(String[] args) {
        // 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();

        System.out.println(myCompany1 == myCompany1); // 두 변수가 같은 주소인지 확인
    }

    //지역변수 메서드 내무에 정의된 변수 : 스택에서 생성되고 소멸
    //맴버변수 객체가 생성되면 존재하는 변수 : 힙에서 생성 가비지 콜랙터에 의해 제거
    //static 변수 this 생성 X




}