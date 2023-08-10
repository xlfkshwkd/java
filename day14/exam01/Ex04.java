package exam01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {
        Map<String,String> members =new HashMap<>();
        members.put("user01","사용자01");
        members.put("user02","사용자02");
        members.put("user03","사용자03");

        members.put("user02","(수정)사용자02");

        String name =members.get("user02");
        System.out.println(name);

        Set<String> Keys=members.keySet();
        Collection<String> values =members.values();
        System.out.println("Keys : "+ Keys);
        System.out.println("value : "+ values);

//interface





        //Map
        //v
        // put(K k,V v):K가 존재하면 수정 없으면 추가
        //void putAll
        //V putIfAbsent(K k ,V v): k 가 없을때만 v값추가 //기존값 대체 x


        //조호ㅣ
        // V get(Object k)
        // V getIfAbsent(Object k, v defualtValue): K 가 없을때만 기본값 대체

        //V remove(Object k)
        //void remove(Object k ......../.. )

        //replaceAll

        //기타 size () : 요소의 갯수
        //boolean containsKey
        //Set<K> KeySet()
        //Collection values















    }
}
