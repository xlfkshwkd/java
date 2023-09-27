package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class Ex09 {
    public static void main(String[] args) throws IOException {
     //   System.err.println("에러 ");
       PrintStream ps =
               new PrintStream(new FileOutputStream("log.txt",true));
        System.setErr(ps);
        int result= 10/0;

        //File
        //파일 디렉토리
        //파일.디렉토리 정보 편의 기능
        //File 자바.File
        //separator ,pathSeparator
        //리눅스 맥
        // /home / Project
        // 윈도우즈
        // C:\Users\

        //pathSeparator 환경 변수 구분 문자
        //리눅스 맥 -:
        // 윈도우즈 -:
        //create





    }
}
