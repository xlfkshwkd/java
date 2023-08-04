package exam;

public class exam04 {
    public static void main(String[] args) {
        int total =0;
        for(int i=0;i<=100;i++)
        {
            System.out.println(i +" 아이시치 반복이요");
            System.out.println(total +" 이요");
            total +=i;
            if(i==50)
            {
                break;
            }
        }
        System.out.println(total +" 이요");



    }
}
