package exam01;

import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {
    public static void main(String[] args) {
        try(PrintStream ps =new PrintStream("test3.txt")){
            ps.println("안녕");
            ps.println("하세요");
            ps.printf("%s 님 안녕하세요 \n","이이름");
            //Outer Stream  -> 문자 단위 스트림 (Writer)

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
