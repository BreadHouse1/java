package Edu;

public class HelloJava {
    public static void main(String[] args) {
//        .은 접근할때 사용 php의 ->와 동일
//        System.out.println("Hello World");

//         변수설정 (타입 이름 = 값;) 다른 타입을 넣을시 오류가 남
        int num  = 1;

//         상수설정 (final 타입 이름 = 값;) 상수라 값 재할당 불가능
        final int num2 = 200_000; // 숫자 표시시 _를 넣으면 숫자단위로 표시해준다

//        스왑
        int swap1 = 10;
        int swap2 = 30;
        int swap3 = 0;
        swap3 = swap1;
        swap1 = swap2;
        swap2 = swap3;

//        System.out.println(swap1);
//        System.out.println(swap2);

//        printf (받을 값 "%d %d %d", 삽입할 값 1, 2, 3)
//        이렇게하면 첫번째 값 1이 처음 쓴 %d 두번째 %d에는 2 세번째 %d에는 3이 들억나다
        System.out.printf("swap1 = %d, swap2 = %d",swap1, swap2);
    }
}
