package Edu;

import java.util.ArrayList;
import java.util.List;

public class EduGenerics {
    public static void main(String[] args) {
        // 여기서 <>안에 들어가는 타입이 밑의 T에 들어간다
        Box<String> box = new Box<String>();
        Box<Integer> box2 = new Box<Integer>();

        box.add("떡볶이");
        box.add("텐동");
        box.add("샌드위치");
        System.out.println(box.toString());

        box2.add(123);
        box2.add(456);
        box2.add(789);
        System.out.println(box2.toString());

        Box2<String, Integer> box3 = new Box2<>();

        box3.add("떡볶이", 4000);
        box3.add("순대", 3000);
        box3.add("튀김", 5000);
        System.out.println(box3.toString());
    }
}

// 클래스에서 여러타입의 값을 사용하고 싶을때
// T로 타입값을 받아서 사용 T를 타입 파라미터라고 한다
// 이런식으로 Generics로 만들었을경우 class Box가 아니라 원시타입이라고 부름
class Box<T> {
    List<T> items = new ArrayList<>();

    // 외부 패키지 접근용
    public void add(T item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}

// 받는 타입이 여러개면 ,를 이용해 적어주면된다
class Box2<T, E> {
    List<T> items = new ArrayList<>();
    List<E> items2 = new ArrayList<>();
    public void add(T item, E item2) {
        this.items.add(item);
        this.items2.add(item2);
    }

    @Override
    public String toString() {
        return items.toString() + " : " + items2.toString();
    }
}
