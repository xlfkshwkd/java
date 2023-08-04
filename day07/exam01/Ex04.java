package exam01;

public class Ex04 {

    public static void main(String[] args) {
        int result = add(1,2);
        System.out.println(result);

        result= add(30,40);
        System.out.println(result);
    }
    static int add(int num ,int num2) //메서드 정의도 안바뀜
    {
        return  num+ num2;
    }
    //데이터영역 메모리

}
