package exam01;

import java.io.DataInput;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        //FilterInputStream
        // 버퍼 인풋 스트림
        //객체를 저장 하는 기능

        //문자 단위 스트림
        //(2~3) 바이트
        //  입력 스트림 : reader
        //  출력 스트림 : writer

        //String reader
        //Print
      //  FileterReader
            //버퍼 리더

        // String readLine() - 문장 단위로 읽어 오는 매서드

        //출력 스트림 : Writer
        //기반 스트림
        //CharArrayWriter
        //String~
        //바이트 단위 스트림 -> 문자 단위 스트림

        //PrintStream

        try(FileOutputStream fos =
                    new FileOutputStream("text1.txt")){
            fos.write('안');
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('안');



        }catch (IOException e){
            e.printStackTrace();
        }











    }
}
