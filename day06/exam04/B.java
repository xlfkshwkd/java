package exam04;

import exam03.A;

public class B extends A {

   public void printNum(){
       num =20;
   //    num2 =30; 접근안됔 ㅋ

     //  num3 =30 ; 접근안됌 내부에서만됨
       num4=50; //

       A b=new A();  //.아오 public >protected >default >private 점점 좁아짐
       /*

       public same anywhere
       protected  상속이면 ㅇㅋ
       default 동일 패키지만 쌉가능
       private 클래스 내부만 가능 이요
       */


   }


}
