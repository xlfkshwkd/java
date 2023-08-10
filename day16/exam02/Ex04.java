package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Thread ts =new Thread(new Thread_Ex04());
        ts.start();

        for (int i =1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("메인 쓰레드 "+ i);
        }

    }
}
class Thread_Ex04 implements Runnable{


    @Override
    public void run() {
        for(int i =1;i<=10;i++){
            try{
            Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("쓰레드 "+ i);
        }

    }
}
