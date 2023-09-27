package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileOutputStream fos =new FileOutputStream("score.txt");
        DataOutputStream dos =new DataOutputStream(fos)){
            int[] scores ={100,90,80,70,60,50,40};
            for (int score :scores){
                dos.writeInt(score);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
