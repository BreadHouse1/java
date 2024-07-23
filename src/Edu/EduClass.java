//package Edu;

//public class EduClass {
//    public static void main(String[] args) {
//        // java의 참조클래스는 클래스명이 타입으로 사용가능함
//        Whale whale = new Whale(); // 인스턴스화
//
//        System.out.println(whale.age);
//        System.out.println(whale.info());
//        System.out.println(whale.info(32));
//
//        // 다른 폴더의 class에 접근
//        // 위에 import로 php의 use처럼 사용 선언 후 객체 생성
//        Test test = new Test();
//        System.out.println(test.j);
//    }
//}
//
//class Whale {
//    public int age = 32; // 클래스안의 변수는 필드라고함 / 인스턴스 변수 : 인스턴스가 소멸할 때 소멸
//    public static String name = "향유"; // 클래스 변수 : 프로그램이 종료될 때 소멸, 인스턴스화 안하고도 사용이 가능
//
//    public String info() { // 메소드라고함
//        int i = 3; // 지역변수 : 메소드가 종료되면 소멸
//        return name + "고래입니다.";
//    }
//
//    // 오버로딩
//    // 메소드가 같은 이름이여도 시그니처(받는변수)가 다르다면 같은이름으로 사용이 가능함
//    public String info(int age) { // 메소드라고함
//        return age + "살 고래입니다.";
//    }
//} // class 외곽은 멤버필드라고함

//class Whale {
//    String name;
//    int age;
//
//    public Whale() {
//        this("고래", 18);
//    }
//
//    public Whale(String name) {
//        this(name, 18);
//    }
//
//    public Whale(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
