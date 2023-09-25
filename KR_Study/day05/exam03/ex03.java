package exam03;

import java.net.http.HttpResponse;

public class ex03 {
    public static void main(String[] args) {
      Animal[] animals =new Animal[3];
      animals[0]=new Human();
      animals[1]=new brid();
      animals[2]=new tiger();

        for (Animal animal : animals)
        {
            animal.move();
            /*
            Human human =(Human) animal;
            human.read();            instance of    */
            if(animal instanceof Human)
            {
                Human human =(Human) animal;
                human.read();
            }

            else if (animal instanceof tiger)
            {
                tiger tiger=(tiger) animal;
                tiger.hunting();
            }
            // 오마이갓
        }

        //상의 클래스의 메서드명과 동일 한 메서드명


    }
}
