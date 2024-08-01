package Edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EduRegex {
    public static void main(String[] args) {
        // String Class 이용
        String str = "Hello World";
        String pattern1 = "[0-9]+";
        String pattern2 = "[a-zA-Z ]+";

        System.out.println(str.matches(pattern1));
        System.out.println(str.matches(pattern2));

        // Regex Package 이용
        // 위의 처리는 str.matches안에 compile이 있어서 매처리마다 compile을 해야하지만
        // Package를 사용하면 컴파일해둔건 계속 사용가능하기 때문에 리소스를 덜 잡아 먹는다
        // 그리고 단순히 boolean형태로 확인하는게 아니라 패턴에 해당하는 문자열을 따로 찾을수도 있다.
        Pattern pattern3 = Pattern.compile("[0-9]+");
        Pattern pattern4 = Pattern.compile("[a-zA-Z ]+");

        Matcher matcher3 = pattern3.matcher(str);
        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
    }
}
