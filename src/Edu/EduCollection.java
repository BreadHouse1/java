package Edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EduCollection {
    public static void main(String[] args) {
        // 배열은 하나의 데이터 타입이고
        // 여러 요소를 한 변수에 담기위해 사용

        // 각 자료 구조(Data Structure)들을 자바 클래스로 구현한 모음
        // 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 둔 것

        // ArrayList Class
        // 앞에 <String>을 입력했으면 new에도 <>안에 자동으로 String으로 자바가 인식함
        // ()안에는 배열길이가 들어감 안넣으면 자동으로 늘려줌
        // 배열을 순차적으로 확인하기 때문에 순차적은 체크는 빠르지만 임의의 배열을 확인하는 처리는 느림
        ArrayList<String> list = new ArrayList<>();

        list.add("D");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.toString());

        // 해당 index의 값만 출력
        System.out.println(list.get(3));

        // 삭제
        list.remove(2);

        // 오름차순 정렬
        Collections.sort(list);
        System.out.println(list.toString());

        // ----------------
        // LinkedList Class
        // ----------------

        // 배열을 순차적으로 확인하기 때문에 순차적은 체크는 빠르지만 임의의 배열을 확인하는 처리는 느림
        // 메소드는 ArrayList와 동일함
        // LinkedList가 List를 상속받고 있기 때문에 아래와 같이 사용해도 된다
        List<String> linkedList = new LinkedList<>();

        linkedList.add("D");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList.toString());
    }
}
