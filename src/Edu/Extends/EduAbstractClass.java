package Edu.Extends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
        // 다형성
        // 타입 클래스를 부모 클래스로 지정해도 사용이가능함
        // 단 부모 클래스로 타입을 지정했을경우 자식에만있는 메소드는 호출 불가
        // Mammal whale = new Whale();
        Whale whale = new Whale();
        System.out.println(whale.birth());

        // 다형성을 사용했을 때 다른 타입의 값도 함수로 넣을 수 있다
        // 단 부모요소를 타입으로 지정했기 때문에 자식요소에만 있는 메소드는 사용하지 못한다.
        Mammal[] arr = new Mammal[2];
        arr[0] = new Whale();
        arr[1] = new FlyingSquirrel();

        // 다운 캐스팅 : 업캐스팅한 객체를 다시 자식 타입으로 변경
        // 원래부터 부모 타입을 사용했으면 다운캐스팅 X
        Whale whale2 = (Whale)arr[0];

        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        System.out.println(flyingSquirrel.residence());

        // 업 캐스팅
        Mammal mammal;
//        Whale whale2 = new Whale();
        // 객체화한 whale을 Mammal타입으로 바꿔서 변수 mammal에 담음
        mammal = (Mammal)whale;

//        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();

        // 타입 다형성
        // 배열이 늘어나면 자동으로 길이가 늘어남
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(flyingSquirrel);
        mammals.add(whale);

        // 파라미터의 다형성
//        PrintTest printTest = new PrintTest();
//        printTest.instancePrint(whale);
//        printTest.instancePrint(flyingSquirrel);
    }
}

// 인터 페이스
// 추상메소드만 사용가능, public만 사용가능
// 관계가없는 클래스 끼리도 상속이 가능함
// 사용시 class에 implements 로 Swimm을 호출하고 메소드사용 미사용시 에러뜸
// 오버라이드시 오버라이드한 메소드가 출력됨
interface Swimm {
    public String swimming();
}

class PrintTest {
//    final pulic void instancePrint(Whale whale) {
//        // 모든 객체에 toString이라는 객체가 있음
//        System.out.println(whale.toString());
//    }

//    final pulic void instancePrint(FlyingSquirrel flyingSquirrel) {
//        // 모든 객체에 toString이라는 객체가 있음
//        System.out.println(flyingSquirrel.toString());
//    }

    // 위의 처리를 하나의 메소드로 처리할수있다
//    final pulic void instancePrint(Mammal mammal) {
//        System.out.println(mammal.toString());
//    }
}

abstract class Mammal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    final public String birth() {
        return this.name + " 출산합니다.";
    };

    // 자식요소에서 사용하는게 없을 시 경고를 띄워줌
    abstract public String residence();

    // 오버라이드용
    public void test() {
        System.out.println("부모테스트");
    }
}

class Whale extends Mammal implements Swimm {
//    protected String name;

    // 생성자
    public Whale() {
//        this.name = "고래";
        super("고래");
    }

    public String residence() {
        return this.name + " 바다에 삽니다.";
    }

    public String swimming() {
        return this.name + "헤엄칩니다.";
    }

//    public String birth() {
//        return this.name + " 출산합니다.";
//    }

    @Override
    public void test() {
        System.out.println("자식테스트");
    }
}

class FlyingSquirrel extends Mammal {
//    protected String name;

    // 생성자
    public FlyingSquirrel() {
//        this.name = "날다람쥐";
        super("날다람쥐");
    }

    public String residence() {
        return this.name + " 산에 삽니다.";
    }

//    public String birth() {
//        return this.name + "출산합니다.";
//    }
}

class FlyingFish implements Swimm {
    protected String name;

    public FlyingFish() {
        this.name = "날치";
    }

    public String swimming() {
        return this.name + " 헤엄칩니다.";
    }
}