package Edu.InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        // 내부 클래스 사용시
        Mammal mammal = new Mammal(); // 외부 클래스 인스턴스화

        // 외부클래스 안의 내부클래스 인스턴스화 타입은 Mammal.Whale이 됨
        Mammal.Whale whale = mammal.new Whale();
        whale.info();

        // 줄여서 인스턴스화 가능
        Mammal.Whale whale2 = new Mammal().new Whale();
        whale2.info();
    }
}

class Mammal {

    String birth = "출산";

    // 내부 클래스(거의 사용하지않음)
    // 클래스를 논리적으로 그룹화하여 패키지 간소화, 가독성 및 유지보수 편리 등의 이점이 있다.
    class Whale {
        String name = "고래";
        String color = "회색";

        // 자바 언어 사양상 컴파일 에러 발생
        // 컴파일러(intelige, vscode, ...)에 따라서 특정 설정하에 동작 할 수도 있으니 안쓰는게 맞음
//        static int age = 18;

        public void info() {
            // 내부클래스는 접근지시자(this나 super 등) 없이 사용가능
            System.out.println(birth);
            System.out.println(name);
            System.out.println(color);
        }
    }
}