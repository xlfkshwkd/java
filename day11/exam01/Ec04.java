package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ec04 {
    public static void main(String[] args) {
        try{
            FileInputStream fis =new FileInputStream("a.txt");
            }
        catch (IOException e){

        } // Auto 클로즈업을 인터페이스 구현체인 경우 정의된 클래스 메소드를 자동호출

    }
}
