package exam01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex11 {
    public static void main(String[] args) throws IOException {
       String str ="Apple,Banana,Mango#mellon+Jado";
        StringTokenizer st =new StringTokenizer(str,"#,+");

        while(st.hasMoreTokens()){
            String fruit =st.nextToken();
            System.out.println(fruit);

        }
        //
        enum Direction { EAST, SOUTH, WEST, NORTH }
            //{상수 ,상수 ... }
        class Unit {
            int x, y; // 유닛의 위치
            Direction dir; // 열거형을 인스턴스 변수로 선언

            void init() {
                dir = Direction.EAST; // 유닛의 방향을 EAST로 초기화
            }
        }

    }
}
