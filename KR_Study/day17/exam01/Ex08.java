package exam01;

import java.io.*;

public class Ex08 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("score.txt");
            DataInputStream dis =new DataInputStream(fis)) {

            //끝까지 다읽으면 EOFException 발생
            //EOF(End OF File)
           int total=0, cnt =0;
            try{

            while (true) {
                int score = dis.readInt();
                total += score;
                cnt++;
                System.out.println(score);
            }

        }
        catch (EOFException e2) {
                double avg =total/(double)cnt;
                System.out.printf("총합계 %d . 평군 : %.2f\n",total,avg );
        }
        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
