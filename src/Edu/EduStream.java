package Edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EduStream {
    public static void main(String[] args) {
        // stream : 배열과 콜렉션의 사용을 쉽게 하기위해 사용
        // 가독성이 좋고 사용하기 편함
        // 하지만 for문보다 속도 처리가 많이 느려서 추천하지는 않음
        // 1회성으로 사용함
        // 기존 배열이나 콜렉션을 stream으로 바꿔서 사용 원본 데이터는 건드리지 않음

        List<String> list = new ArrayList<String>();
        list.add("김밥");
        list.add("소고기");
        list.add("백반");
        list.add("소고기불고기");

        // 기존 출력 법
//        for (String str : list) {
//            System.out.println(str);
//        }

        // stream 생성
        Stream<String> stream = list.stream();
        stream.filter(str -> str.startsWith("소고기")) // 소고기로 시작하는 값 찾기
                .forEach(System.out::println);

        // 배열
        int[] arr = {5, 4, 7, 1, 2, 3, 3, 1, 5, 6, 8};
        // 인트 배열로 스트림 생성
        IntStream intStream = Arrays.stream(arr);
        intStream.sorted() // 오름차순 정렬
                .distinct() // 중복제거
                .forEach(System.out::println);


    }
}
