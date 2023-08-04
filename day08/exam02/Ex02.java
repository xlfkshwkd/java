package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals =new Animal[3];

        animals[0]=new Human();
        animals[1]=new Tiger();

        animals[2]=new Bird();  //동일함
        Bird brid =new Bird();
        animals[2]=brid;


        for (Animal animal : animals){
            animal.move();
            if (animal instanceof  Human)
            {
                Human human =(Human)animal;
                human.readBook();
            }
            else if (animal instanceof  Tiger)
            {
                Tiger tiger =(Tiger)animal;
                tiger.hunting();
            }
            else {
                Bird bird =(Bird)animal;
                bird.light();
            }
            //추상클래스 -> ㅋㅋ 추상적 구체적







        }
            //기본 자료형
        //참조 자료형
        //정수 실수 논리값 문자
        //참조자료형
        //주소를 가지고 다른자료를 참조하는 자료
        //객체를 참조하는 참조 변수
        //클래스 형태으 자료형
        // 다향성

        //default ->protected -> public





       //매소드 오버 라이딩 -> 가상매서드를 재정의
       //하위클래스에 호출항 메서드의 주소가 가상 매서드의 테이블에 기록
       //하위 클래스에 매서드가 정의 -> 해당주소가 우선순위를 가지고 기록


        //컴파일러에게 재정의 된 메서드임을 알려주는것 @Override
        //재정의형식을 채크 상위클래스를 동일한 메서드가 정의되어있는지

        //기능추가 사람 뛰어다님 호랑이 사냥함

        /*
        *
        * 메서드가 정해지지않은 클래스
        * 추상클래스 문법
        * final 예약어
        * 변수
        * 매서드 클래스
        *
        *
        *
        *
        * */





    }
}
