package exam01;

public class MyResoures implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("자원해제");
    }
    //직접 정의 하느 예외



}
