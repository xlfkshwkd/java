package exam02;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        File dir =new File("D:/uploads/folder1/folder2/../../folder3/folder4");
        File file =new File(dir,"test.txt");
      //  file.createNewFile();

        if(!dir.exists()){
            dir.mkdirs();  // s 붙히면 자동 충첩 폴더도 만들어줌
        }
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());






    }
}
