public class Ex02 {
    public static void main(String[] args) {
        String str ="오랜지,망고,바나나,바나나,last";

        int pos =str.indexOf("오랜지");
        System.out.println(pos);

        int pos2 =str.indexOf("바나나");
        System.out.println(pos2);

        int pos3 =str.lastIndexOf("바나나");
        System.out.println(pos3);

        str = str.replace("망고","케로로");
        System.out.println(str);


    }
}
