package exam01;


import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
       Book book =new Book(1,"책1","저자1","출판사");


       System.out.println(book);
       System.out.printf("id : %d ,title : %s author : %s , publiser : %s%n"
               ,book.id(),book.title(),book.author(),book.publiser());

       // 생각 해
        //size 키 -> 키값은 중복이 안됌
        // 집합 . set 중복
        //흐음
        // 추가 put
        // 수정 putifAbserit( k k v v) : k 값이 없을때만 v 값을 추가
        // replace(K k ,V old , V new )
        // 삭제 remove (Object k)
        // 조회
        // V get(Object k)
        // getOrDefault(Object ,k,V,v);

        //Set<K> KeySet() : 전체 키값
        //Collection <V> values: 전체 키값
        //boolean containsValue(Object v)

        // 기타 int size 요소
        //
        //구현된 클래스
        //HashMap
        //Tree Map




    }
}
