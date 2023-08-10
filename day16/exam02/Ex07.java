package exam02;

public class Ex07 {
    public static void main(String[] args) {
        Thread th1=new Thread(new ThreadEX07());
        Thread th2=new Thread(new ThreadEX07());

        th1.start();
        th2.start();


    }
}
class ThreadEX07 implements Runnable{
        private Account account=new Account();
    @Override
    public void run() {
        while (account.getBalance()>0)
        {
             int num =(int)(Math.random() *3+1)*100; // 1,2,3
           account.withdraw(num);
            System.out.println("balance:" + account.getBalance());

        }




    }

}