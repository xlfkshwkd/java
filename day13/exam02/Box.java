package exam02;

public class Box<T> extends Fruit{ //  프루트 사과 포도
    private T item; //T = Object

    //private static T item
    // 사용 불가 정적변수는 객체형성과 관련없이 처음부터 데이터 영역에 변수로 공간 0
    //공간이 있을만한 명확한 자료형이 필요 ->T는 객체가 되는 시점에 결정 x


    //배열의 뉴 연산자는 공간을 생성하는 연산자
    // 공간의 크기가 명확하게 결정 되어 있어야 가능 T -> 객체형성의 시점에 변환
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public void printInfo(){
        // 정적인 변수 <T>

       // item.

    }



}
