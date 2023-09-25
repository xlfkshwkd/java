package exam02;

public class ex02
{
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();
        //        C c1 =ad; 안됌 형 이다름
    //    C c1 =(C)ad;

        if(ad instanceof  C)
        {
            C c1 =(C) ad;
        }
        System.out.println(ac instanceof C);


    }
}
