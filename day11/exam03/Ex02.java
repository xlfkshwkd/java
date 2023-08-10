package exam03;

public class Ex02 {
    public static void main(String[] args) {
         Object human=new Human();
        //오부ㅡ잭트 안에 담김 다양성
        Tiger tiger=new Tiger();
        Dog dog =new Dog();

        Object animals[] =new Object[3];
        animals[0] =human;
        animals[1] =tiger;
        animals[2] =dog;


    }
}
