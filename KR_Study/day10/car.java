
public class car {

    public static void main(String[] args) {
        int a =60;
        int b=40;
        int time=0;
        int meter=0,meter2=0;
        boolean counter =true;
        while (counter) {
            meter += a + (10 * time);
            meter2 += b + (15 * time);
            if(meter2==meter)

            {
                counter =false;
            }
            time++;
        }
        time++;
        System.out.println("몇 시간후 :"+time);
        System.out.println("거리는 :"+ meter +"km");
    }
}
