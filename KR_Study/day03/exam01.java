import java.lang.module.FindException;

public class exam01 {
    public static void main(String[] args) {
        int[] student =new int[51];

        int n =0;
        while(n<50)
        {
            student[n] =n + 2023;
            System.out.printf("학생 : %d 번 \n",n);
            n++;
        }
      //동일한자료형 물리적으로 붙어있음 순서!
        student[0]=10;
        student[1]=20;
        student[2]=30;



        System.out.println(student[0]);
        System.out.println(student[1]);
        System.out.println(student[2]);
//자바스크립트 배열은 배열이 아님 그냥 객체 덩어리지




    }
}
