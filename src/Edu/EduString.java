package Edu;

import java.util.Scanner;

public class EduString {
    public static void main(String[] args) {
//        String str1 = "안녕";
//        String str2 = "안녕";
//
//        // String의 경우 같은 값이 있다면 처음 만들어진 값을 참조해서 가져온다
//        // 1과 2 같은 주소값을 출력함
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str2));
//
//        // 자바 공간에 "자바"라는 데이터는 남겨두고 php 데이터를 만들어서 해당 값을 참조함
//        // 그리고 남은 "자바"라는 단어를 사용하지않으면 gc가 자동으로 삭제처리함
//        // 하지만 저런 처리가 쌓일경우 처리속도가 느려짐 (+연산자도 같음 concat권장)
//        String str3 = "자바";
//        str3 = "PHP";
//
//        String str4 = "안녕하세요. 자바입니다.";
//
//        // charAt(index) : 해당 인덱스번호의 글자를 가져옴
//        System.out.println(str4.charAt(3));
//
//        // format() : %s에 두번째 값(E10)이 들어감
//        System.out.println(String.format("%s : 비밀번호 오류", "E10"));
//
//        // 문자 비교 연산 equals : 기준문자.equals(비교할문자);
//        System.out.println(str1.equals(str2));
//
//        // 문자열 길이 length()
//        System.out.println(str4.length());
//
//        // 특정 문자열을 새로운 문자열로 변환 replace(기존 바꿀 문자열, 새로 바꿀 문자열)
//        String tmp = str4.replace("자바", "PHP");
//        System.out.println(tmp);
//
//        // 배열사이에 문자를 넣고싶을때 join(넣을 문자, 배열변수)
//        char t = 'a'; // ' 홑따옴표 사용
//        String s = "a"; // " 쌍따옴표 사용
//
//        String[] stringArr = {"자바", "PHP", "C#"};
//        System.out.println(String.join("/", stringArr));
//
//        // toLowerCase() : 영문자를 소문자로 변환, toUpperCase() : 영문자를 대문자로 변환
//        String caseStr = "ASDwdd";
//        System.out.println(caseStr.toUpperCase());
//        System.out.println(caseStr.toLowerCase());
//
//        // 양사이드의 띄어쓰기를 없애줌 trim()
//        String trimStr = "    asdasdasd    ";
//        System.out.println(trimStr.trim());
//
//        // ----------------------------------------
//        // StringBuffer Class (스레드 세이프) / StringBuilder Class (스레드 언세이프)
//        // Buffer와 Builder의 경우 기존 문자열을 바꿔서 사용하기 때문에
//        // 기존문자열을 저장하고 새로운 문자열을 생성하는 String보다 효율이 좋다
//        // 문자열을 바꾸는 수가 작을 경우는 그냥 String을 사용하는게 좋다
//        // ----------------------------------------
//
//        // 멀티 스레드 : 여러 처리가 있으면 동시 처리
//        // 싱글 스레드 : 하나의 처리만
//
//        // 스레드 세이프 : 멀티 스레드를 사용할때 a, b, c 처리가 있으면
//        // c가 b를 참조할때 c보다 b처리가 늦게 끝나면 오류가 나는 경우르 막아줌
//
//        // ()안에 문자를 넣으면 해당 문자가 저장된 버퍼 생성
//        // 기본적으로 길이가 16인 버퍼를 생성 ()안에 숫자를 넣어서 길이 조정가능
//        // 길이 이상의 문자를 넣어도 자동으로 길이가 늘어나긴 하지만 그것도 처리가 추가 되기 때문에
//        // 속도 저하가 돼서 여유롭게 설정하는 편이다
//        StringBuffer sb = new StringBuffer("안녕 자바!");
//
//        // toString은 원래 object를 출력하면 주소값이 출력되는데
//        // toString을 사용해서 값을 출력한다 toString은 사용안해도 자동으로 변환해주지만
//        // 사용하는것이 좋다.
//        System.out.println(sb.toString());
//
//        sb.append(" 안녕 PHP!");
//        System.out.println(sb.toString());
//
//        // ----------
//        // Math 메소드
//        // ----------
//
//        // 절대값 구하기 Math.abs
//        int num1 = -5;
//        System.out.println(Math.abs(num1));
//
//        // 올림 Math.ceil
//        System.out.println(Math.ceil(2.56));
//
//        // 내림 Math.floor
//        System.out.println(Math.floor(2.56));
//
//        // 반올림 Math.round
//        System.out.println(Math.round(2.56));
//
//        // 랜덤 Math.random(0~1 소수점 까지 출력) 으로 1~10까지 출력하기
//        System.out.println((int)Math.ceil(Math.random() * 10));
//        System.out.println((int)Math.floor((Math.random() * 10) + 1));
//        for (int i = 0; i < 10000000; i++) {
//            if((int)Math.ceil(Math.random() * 10) == 0) {
//                i = 0;
//                continue;
//            } else {
//                System.out.println((int)Math.ceil(Math.random() * 10));
//                break;
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요.");
        String input = sc.nextLine();
        System.out.printf("입력하신 값은 %s입니다.", input);


    }
}
