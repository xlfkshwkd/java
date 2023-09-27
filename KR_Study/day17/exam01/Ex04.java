package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args)  throws IOException
    {System.out.print("아 무 문자 입력 : ");
        InputStreamReader isr =new InputStreamReader(System.in);
     //   char ch =(char)System.in.read();
      // System.out.println(ch);
        BufferedReader br =new BufferedReader(isr);
        String Line = br.readLine();
        System.out.println(Line);





    }
}
