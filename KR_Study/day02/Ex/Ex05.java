package Ex;

public class Ex05 {
    public static void main(String[] args) {

        for(int i=2 ;i<10;i++){
            System.out.printf(" %d단 ____________\n", i);
            for (int j=1;j<10;j++)
            {
                if(i<=j) {
                    System.out.printf("%d  *  %d  =  %d \n", i, j, (i * j));
                }
                }
        }


    }
}
