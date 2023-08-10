package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Thread_Ex03 th =new Thread_Ex03();
        //th.run 메인에서 런 호출
        th.start(); //새로운 호출에서 메서드 호출
    }
}

class Thread_Ex03 extends Thread{
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName());
            // 상위 클래스인 Thread의 getName()을 호출
        }
    }
    public void throwException(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}