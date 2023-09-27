package exam04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileOutputStream fos =new FileOutputStream("test03.txt")){
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('살');
            fos.write('법');
            fos.write('.');
            //입력 스트림 - Reader
            //CharArrayReader : 메모리 기반
            //StringReader : 메모리기반
            //Filereader : 메모리기반
            //기반 스트림 보조 스트림
            //File리더
            // BufferdReader
            
            //InputStreamReader 바이트 깁나 승트림 인풋스트림

            //출력 스트림 - Writer


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
