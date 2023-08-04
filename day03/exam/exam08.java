package exam;

public class exam08 {
    public static void main(String[] args) {
        int total=0;
        int i =0;
        int num=1;
        while (i<=100)
        {
            if(i%2==0) //짝수=
            {
                continue;
            }
            total +=num;
            i++;

        }
        System.out.println("what the hell;");
        System.out.println(total);

    }
}
