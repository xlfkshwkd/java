package exam;

import java.awt.*;

public class exam01 {
    public static void main(String[] args) {

        int a =1;
        int rank =5;

        switch (rank)
        {
            case 1:
                System.out.println("1등 골랏구나");
                break;
            case 2:
                System.out.println("2등 골랏구나");
                break;
            case 3:
                System.out.println("3등 골랏구나");
                break;
            default://모두 아닐경우 실행
                System.out.println("허접컷");
                break;
        }
        //JDK7 값은 정수만 특징 안바뀜



    }
}
