package exam02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream na =new FileInputStream("data1.txt")){
            int ch =na.read();
            System.out.println((char)ch);

            ch =na.read();
            System.out.println((char)ch);

            ch =na.read();
            System.out.println((char)ch);

            ch =na.read();
            System.out.println((char)ch);
            ch =na.read();
            System.out.println((char)ch);
            ch =na.read();
            System.out.println((char)ch);
            ch =na.read();
            System.out.println((char)ch);

        }
        catch (IOException e)
        {
            //int read () 문자는 모두 양의 정수이기 때문
            //-1파일의 위치가 끝에 도달

        //바이트 있늗건 효율성
             //버퍼를 많이 쓴다 .

        }
    }
}
