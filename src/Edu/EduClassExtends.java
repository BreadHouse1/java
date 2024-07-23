package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String Kinds;
    protected String name;

    public Mammal() {
        this.Kinds = "포유류";
    }

    public void printInfo() {
        System.out.println("Kinds : " + this.Kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super(); // 자식 클래스에서 super()를 쓰면 부모 클래스의 생성자를 호출함 사용안해도 자동으로 호출함
        this.name = "고래";
        // concat을 사용하면 +연산자보다 처리속도가 더 빠름
        System.out.println(this.Kinds.concat(this.name));
    }

    // 오버라이드 : 부모에서 정한 요소를 자식클래스에서 재 정의 하는 것
    @Override
    public void printInfo() {
        super.printInfo(); // 부모의 클래스도 같이 처리하고 싶을 때 super사용 super를 쓰면 부모class에 접근이 가능
        System.out.println("Name : " + this.name);
    }
}