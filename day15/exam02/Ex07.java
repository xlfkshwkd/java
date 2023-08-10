package exam02;

import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileWriter fs =new FileWriter("data4.txt")){
            fs.write("안");
            fs.write("녕");
            fs.write("하");
            fs.write("세");
            fs.write("용ㅋ ");
            fs.append("하하");
            String a ="gk gk";
            fs.append(a);
            fs.append(" 멍청한 ");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
