package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Thread_EX02 th1=new Thread_EX02();
        //스타드 start ->run 메서드를 실행해주는 함수
        th1.start();
        for (int i =1;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            System.out.println("메인 쓰레드 : "+i);
        }
    }
}
class Thread_EX02 extends Thread{
    public void run(){
        for (int i =1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("쓰레드 : "+i);
        }
    }
}
