package Edu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // java는 배열을 만들 때 길이를 정해주고 해당 길이만큼만 사용가능 수정도 안됨
        // 배열을 만들 때 자바는 객체로 사용해서 new로 생성해야함 int안의 숫자는 길이임
        int[] arr = new int[100000];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

        System.out.println(arr); // [I@4c873330 이 출력 됨 ([I 는 배열 타입이 int라는 뜻)
                                // 위에 값은 배열의 주소값

        // 배열 10만개 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // 배열 출력 하기
//        System.out.println(Arrays.toString(arr));

        // char배열
        char[] chars = {'a', 'b', 'c'};

        System.out.println(Arrays.toString(chars));

        // 배열 사용 주의 사항
        int[] arr2 = {1, 2, 3};

        // arr4 를 복사하고 싶어서 사용
        int[] arr3 = arr2;
        arr3[1] = 43;
        // 위와 같이 바꾸면 java 배열은 참조기 때문에 arr5를 바꾸면 arr4도 바뀐다
        // 위에 배열을 프린트하면 배열의 주소값을 가져오는 것처럼 arr5는 주소값을 가져오기 때문에 그렇다.
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // 기존 배열을 참조하지않고 복사하고 싶을경우
        int[] arr4 = {1, 2, 3};
        int[] arr5 = new int[arr4.length];

        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = arr4[i];
        }
        arr5[1] = 43;

        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        // 보통 위와 같은 방법은 쓰지 않음

        // 현업에서 사용하는 법

        // 배열의 copyOf메소드를 사용 첫번째값은 원본배열, 두번째는 어디까지 복사할지를 정함
        // int[] arr5 = Arrays.copyOf(arr4, arr4.length);

        // 다차원 배열
        int[][] arr6 = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };

        System.out.println(arr6[1][1]);

        int[] arr7 = {5, 76, 2, 4, 1, 6, 33};
//        Arrays.sort(arr7); // 배열의 값을 순차적으로 정렬함

        // sort를 for문을 사용해서 만듦

        // for문 2번 사용
//        for (int i = 0; i < arr7.length; i++) {
//            for (int j = 0; j < arr7.length - 1; j++) {
//                if(arr7[j] > arr7[(j+1)]) {
//                    int num = arr7[(j + 1)];
//                    arr7[j + 1] = arr7[j];
//                    arr7[j] = num;
//                }
//            }
//        }


//        if문으로 플래그를 사용해 for문의 사용을 최대한 줄임
        for (int i = 0; i < arr7.length; i++) {
            boolean completeFlg = true;
            for (int j = 0; j < arr7.length - 1 - i; j++) {
                if(arr7[j] > arr7[j+1]) {
                    int num = arr7[j + 1];
                    arr7[j + 1] = arr7[j];
                    arr7[j] = num;
                    completeFlg = false;
              }
            }
            if(completeFlg) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr7));
    }
}
