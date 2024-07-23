package Edu;

public class ControlStatement {
    public static void main(String[] args) {
//        if (조건1) {
//            // 처리 코드
//        } else if (조건2) {
//            // 처리 코드
//        } else {
//            // 처리 코드
//        }

        // switch 문
//        String food = "뚝배기";
//        switch (food) {
//            case "김밥" :
//                System.out.println("분식");
//                break;
//            case "뚝배기" :
//                System.out.println("한식");
//                break;
//            default :
//                System.out.println("기타");
//                break;
//        }

        // for 문
//        for(int i = 0; i< 3; i++) {
//            if (i == 1) {
//                // continue : 건너뛰고 다음처리로 넘어감
//                continue;
//            }
//            System.out.println(i);
//        }

        // 구구단 출력
//        for(int i = 2; i < 10; i++) {
//                System.out.printf("**** %d단 ****%n", i);
//            for (int j = 2; j < 10; j++) {
//                int num = i * j;
//                System.out.printf( "%d x %d = %d%n", i, j, num);
//            }
//        }

        // 별찍기
        int cnt = 5;
        for(int i = 0; i < cnt; i++) {
            for (int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
