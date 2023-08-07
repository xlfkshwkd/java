package exam01;

public abstract class CASIO {

    int num=10;

    final public void commonMethod(){
        System.out.println("공통 메서드 ");
    }
    public abstract int add(int num1,int num2);

    public abstract int minus(int num1,int num2);


}
