package exam01;

import exam02.Apple;
import exam02.Box;

public class Ex01 {
    public static void main(String[] args) {
        Box Box =new Box();
        Box.setItem(new Apple());  //으아

        Apple apple=(Apple)Box.getItem();  //형변환 번거로움이 있다.
        apple.printInfo();


    }
}
