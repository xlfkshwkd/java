package exam01;

public class joinservice {
        //생성자를 기본생성자에 접근제어자 private
    private  joinservice(){};
    //클래스 내부에서 객체를 생성
    private static joinservice instance;

 //  private static joinservice instance =new joinservice();  //static 붙혀야함
    //외부에서 내부에있는 (생성된 객체)를 접근할수 있는 메서드를 정의 해야한다 .


    public static joinservice getInstance(){
        if(instance == null) {
            instance = new joinservice();
        }
        return instance;
    }

    //정적변수에 객체를 생성 객체생성 막혀있고

    /*
        private으로 선언한 유일한 인스턴스를 외부에서도 사용할 수 있도록 설정해야 합니다.
        이를 위해 public 메서드를 생성합니다. 그리고 유일하게 생성한 인스턴스를 반환해 줍니다.
        이 때 인스턴스를 반환하는 메서드는 반드시 static으로 선언해야 합니다.
        왜냐하면 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문입니다.
    *
    * */




}
