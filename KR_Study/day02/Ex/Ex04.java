package Ex;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("ABC");
        System.out.println();
        System.out.println("DEF");

        for(int i=2 ;i<10;i++){
            if (i%2==1) {
                System.out.printf(" %d단 ____________\n", i);
            }
            for (int j=1;j<10;j++)
            {
                if(i%2==1) {
                    System.out.printf("%d  *  %d  =  %d \n", i, j, (i * j));
                }
                }
        }


    }
}
