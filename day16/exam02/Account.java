package exam02;

public class Account {
    private  static int balance =1000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int money){
        if(balance >=money){
            try{
            Thread.sleep(1000);

        }catch (InterruptedException e){}
            balance -=money;
        }
    }
}
