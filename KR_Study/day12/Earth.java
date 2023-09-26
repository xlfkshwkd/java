import java.awt.*;

public class Earth {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod","eocd","qixm","adio","soo","pos","ppooss"};

            for (int j = 0; j < dic.length; j++) {
                if (dic[j].indexOf(spell[0]) != -1 &&
                        dic[j].indexOf(spell[1]) != -1 &&
                        dic[j].indexOf(spell[2]) != -1
                ) {
                    System.out.println(dic[j] + " 단어에는 ");
                    System.out.println( " 문자가 포함되어 있습니다. 1반환");

                    // spell[] 이라는 값이 있다면
                } else {
                    System.out.println(dic[j] + " 단어에는 ");
                    System.out.println(" 포함되어 있지 않습니다. 2 반환 ");

                    // spell[] 이라는 값이 없다면
                }
        }


    }
}
