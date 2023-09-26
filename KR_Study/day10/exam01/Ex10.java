package exam01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        Scanner scan =new Scanner(new File("scores.txt"));
        int total =0,cnt =0;
        while(scan.hasNext())
        {
            int score =scan.nextInt();
            System.out.println("파일 불러왔다.");
            System.out.println(score + "--");
            total +=score;
            cnt++;
        }
        System.out.printf("합계 : %d , 평균 : %.2f \n ",
                total, total/Double.valueOf(cnt)); //언박싱 됨

    }
}
