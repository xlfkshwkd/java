package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("data2.dat");
            DataInputStream dis =new DataInputStream(fis)) {
            int total=0,count =0;
            try{
            while (true) {
                int score = dis.readInt();
                total +=score;
                count++;
             //   System.out.println(score);
            }
        }catch (EOFException e){
            double avg =Math.round(total/count *10)/10;
            System.out.println("total = "+total +", avg = "+avg);
        }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
