package exam01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores ={90,80,98,100,75,60};

        try(FileOutputStream fos =new FileOutputStream("data2.dat");
            DataOutputStream dos =new DataOutputStream(fos)){
            for (int score : scores) {
                dos.writeUTF(Arrays.toString(scores));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
