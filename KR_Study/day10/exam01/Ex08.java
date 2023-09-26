package exam01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.util.Objects.deepEquals;

public class Ex08 {
    public static void main(String[] args) throws IOException {

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                System.out.println("두 수를 입력하시오 ");
                String line =br.readLine();
                if(line.equals("q"))
                {
                    break;
                }
                String lines[] =line.split("\\s+");
                int num1 =Integer.parseInt(lines[0]);
                int num2 =Integer.parseInt(lines[1]);
                System.out.printf("두수의 합 %d",num1+num2);

            }


    }
}
