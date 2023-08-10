package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> box=new Box<Apple>();
        box.setItem(new Apple());

    //    Apple apple =box.getItem();
        //프레임워크 자료 구조
        //collection 인터페이스 리스트 셋



        //list 인터페이스 순차 자료 구조 값의 중복을 허용 순서가 유지
        //- 인덱스 index
        // 값을 중복은 허용
        //값의 집합 자료 구조


        //set 인터페이스
        //A 3,4,1,2
        //B 3,4,5,6 중복이 허용되지않는 자료형


        //4.  Map 인터페이스 사전 쟈료구조
        //   키는 값을 찾기 위한 키워드
        //중복이 없는 자료형
        //값은 중복 허용 ㅇ
        //키은 중복 X
        // Array lis t liked.list

        //3) 구현 클래스
        //Arraylist;
        //Linkedlist
        //stack
        //Vector

        //set 인터페이스 :집합 자료구조
        //1) 사전 자료구조
        //2) 구현 클래스
        //- hashmap
        //- TreeMap
        //추가
        //boolean add(E e)
        //boolean addd(int index, E e)
        //boolean addAll(int index ,Collcetion

        //E get(int index)
        //indexOf (Object d)
        //boolean contains(Object o):요소의 존재 유부
        //int indexOf (Object o):요소의 위치번호 (index )

        //E remove 순서 번호대로 삭제 -반환값은 삭제된요소 (스택 구조와 관련)
        //boolean remove(Object o)
        //boolean removeAll(Coollection<...> o)
        //순차적
        //특정위치 값 변경
        //추가 조회 삭제 변경
        //int Size
        //추가
        //Set
        //boolean add (E e);


        //조회메서드 순서 유지  x
        //삭제
        //remove
        //boolean 순서 기타
        //contains
        //int Size():요소의 갯수
        //Arraylist
















        box.printInfo();


        //
        //객체가 될떼 타입 힌트 -> 형변환
   //     Box<Apple> appleBox =new Box<Apple>();
   //      Box<Grape> grapeBox=new Box<Grape>();

    }
}
