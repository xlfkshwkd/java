public class Ex03 {
    public static void main(String[] args) {
      //subString( 시작위치, 끝) 위치 미만
        //lastIndexOf
        //SubString(s) s 부터 끝까지


        String fileName ="abc.def.txt";
        String extension =
                fileName.substring
                        (fileName.lastIndexOf(".")+1);

        System.out.println(extension);

        String str =" ";
        System.out.println("str.isEmpty():" + str.isEmpty());

        System.out.println("str.trim().isEmpty:" + str.trim().isEmpty());

        System.out.println("str.trim().isEmpty:" + str.isBlank());
        // 11버전 이후 가능

        //기본 자료형 값을 감싼 형태의 클래스
        //Wrapper 클래스의 종류 float -> float
                    //double ->double
        //char -> Character

        class integer{
            //변수 메소드
            //private final ,int ,value
        }







    }
}
