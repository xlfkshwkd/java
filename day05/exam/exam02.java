package exam;

public class exam02 {
    public static void main(String[] args) {
        student s1 =new student(); //힙 영역 메모리
        //스택영역메모리 쪽의 주소값을 가지고 있다.

        s1.id=1000;
        s1.grade=4;
        s1.name="심현수";
        s1.subject="과학";



        s1.showInfo();


        student s2=new student();
        s2.id=1001;
        s2.grade=4;
        s2.name="김래건";
        s2.subject="과학";

        s2.showInfo();

        System.out.println("s1 : "+s1+"s2 : "+s2); //인스턴스의 주소
        System.out.println("s1 : "+s1+"힙 메모리의 주소 : " + System.identityHashCode(s1));
        System.out.println("s1 : "+s2+"힙 메모리의 주소 : " + System.identityHashCode(s2));


    }
}
