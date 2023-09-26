package exam01;

import java.awt.*;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true)
        {
            System.out.println("두수를 입력하시오 ");
            String line =scan.nextLine();
            if(line.equals("q")) break;

            String[] lines =line.split("\\s+");
            System.out.printf("두수는  %d \n",
                    Integer.parseInt(lines[0])+
                    Integer.parseInt(lines[1]));

        }
    }
}
