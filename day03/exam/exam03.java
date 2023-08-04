package exam;


public class exam03 {
    public static void main(String[] args) {
        int total=0;
        int num=1;

        do{
            total+=num;
            num++;
            System.out.println(total + " 반복 오젓구");

        }
        while(num<=100);

        //do while 은 무조건 위에서 한번은 실행이 되는코드 다


        total=0;
        for (int j=0;j<=100;j++)
        {
            total+=j;
            System.out.println(total +"입니다.");
        }


      //순서 인데스 0부터
      //관례 초기화식 변수명으로 i로한다 중첩 포문에서는 jkl.....순서대로



    }
}
