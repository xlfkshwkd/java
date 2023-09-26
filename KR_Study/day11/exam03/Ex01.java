package exam03;

import exam04.Apple;
//import exam04.Mellon;

public class Ex01 {
    public static void main(String[] args) {
        Box applebox = new Box();
        applebox.setItem(new Apple()); //오브젝트 아이템 = 에플과 동일
     //   Apple apple=(Apple)applebox.getItem();

        Box melonBox =new Box();
   //     melonBox.setItem(new Mellon()); //오브젝트 아이템 = 멜론과 동일
     //   Mellon mellon=(Mellon)melonBox.getItem();
        Object obj=melonBox.getItem();
        if(obj instanceof Apple) {
            Apple mellon = (Apple) obj;
        }



    }
}
