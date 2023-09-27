package exam02;

import javax.swing.text.Style;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("test01.txt")){
            byte[] buffer =new byte[5];
            while(fis.available()>0){
                int ch =fis.read(buffer);

                /*
                for (byte b :buffer){
                    System.out.print((char)(b));
                }
                System.out.println();
            */
            for(int i =0 ;i<ch;i++){
                System.out.println((char)buffer[i]);
            }

            //FilterinputStream : 보조 스트림의 상위 클래스
                //BuffertheINputStream
            //다른 스트림에 기본자료형으로 데이터를 읽어올수 있는 추가 기능
            //보조 스트림 다
                //버퍼아웃풋 스트림 다른 스트림에 버퍼 기능 추가
                //DataOutputStream 다른스트림에 기본 자료형으로 데이터를 쓸수 있는 추가 기능
                //오브젝트 아웃풋 스트림 객체 형태롤 쓸수 있도록 변환 기능 추가

            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
