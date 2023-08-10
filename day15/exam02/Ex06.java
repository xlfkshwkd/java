package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06
{
    public static void main(String[] args) {
        try(FileOutputStream fos =new FileOutputStream("data3.txt")){
            fos.write("안".getBytes());
            fos.write("녕".getBytes());
            fos.write("하".getBytes());
            fos.write("셈".getBytes());

            //1.입력 스트림 :Reader
            //1.기반스트림 데이터에 직접 접근 할수 있는 스트림
            //2.보조스트림 다른 스트림에 추가기능

            //2.출력 스트림 :Writer
            //1.기반스트림 데이터에 직접 접근 할수 있는 스트림
            //2.보조스트림 다른 스트림에 추가기능

            //charArrayReader :메모리기반 스트림
            //BufferedReader
            //CharArrayWrite :메모리기반 스트림
            //FileWriter 파일 기반 스트림

            //BufferWriter


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
