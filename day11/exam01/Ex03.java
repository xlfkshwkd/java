package exam01;

import javax.imageio.IIOException;
import javax.sound.midi.SysexMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
             fis= new FileInputStream("a.txt"); //에외처리를 해야 컴파일 됨
            //에외 발생형 코드

        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //return 명령어가 있어도 실행된다.
            // 에외가 발생하든안하든 실행
            if(fis != null){
                try{
                    fis.close();

                }
                catch (IOException e){

                }
                System.out.println("자원 해제");

                //try -with resources 문
                //자원 헤제가 필요한 객체 자원해제가 필요한 객체


            }


        }

    }
}
