package exam;

public class exam02 {

    public static void main(String[] args) {

        exam01.student s1 =new exam01.student(4110,"학쌩","과목");

        s1.id =4110;
        s1.name="학쌩";
        s1.subject ="과목";
        s1.showInfo();

       //객체를 생성하는 기능 수행하는 메서드 (함수ㅡ)
        // 클래스에 정의된 생성자 메서드가 없는 경우 컴파일러가 자동 추가

        //public 클래스 함수 () {}




    }
}
