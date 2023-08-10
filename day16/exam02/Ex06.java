package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Thread th =new Thread(new Thread_Ex06());
        th.setDaemon(true); //메인 쓰레드가 종료되면 함께 종료
        th.start();

        for(int i =1;i<=10;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("쓰레드 "+ i);
        }
    }
}
class Thread_Ex06 implements Runnable{

    @Override
    public void run() {
        while(true){
            try{
            Thread.sleep(3000);
            }catch (InterruptedException e){}
            System.out.println("문서 저장 !");
        }
    }
}
