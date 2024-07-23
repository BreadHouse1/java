package Edu;

public class DataType {
    public static void main(String[] args) {
//        Jave 데이터 타입
        boolean flg = true;

        byte numByte = 127;
        int numInt = 1;
        long numLong = 5L;

        double numDouble = 5.0;
        float numFloat = 5.0f;

        char enChar = 'A';
        String str = "asd";

        // 연산자
        int num1 = 1;
        int num2 = 2;

//        System.out.println(num1 != num2);

        // 문자열 비교
        String str2 = "asd";
        String str3 = "asd";

        // string에 equals를 사용하면 서로 비교가능
        System.out.println(str2.equals(str3));
    }
}
