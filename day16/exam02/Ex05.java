package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Thread th =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1;i<=10;i++){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){}
                    System.out.println("쓰레드 "+ i);
                }
            }
        });
        //싱클 쓰레드와 멀티 스레드
        //시분할 방식
        th.start();
        //작업을 빠르게 번갈아가면서 진행 -> 동시에 진행되는 것 처럼 보인다.
        //작업 전환 시간이 필요함으로 싱글 쓰레드 환경에서는 작업 총량이 많아진다.
        //데몬쓰레드 (daemon thread)
        //다른쓰레드에 종속적인 쓰레드
        //다른 쓰레드가 종료 되면 데몬쓰레드도 함께 종료
        //예 시스템 스레드중 가비지 콜렉터
    }
}
