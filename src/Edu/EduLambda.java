package Edu;

import java.util.function.*;

// 아래 인터페이스를 함수형인터페이스로 인식하게함 하지만 사용시 추상메소드가 한개여야함
@FunctionalInterface
interface InterfacePlus{
    // 밑에가 추상메소드
    int plus(int x, int y);
}

//class Plus implements InterfacePlus{
//    public int plus(int x, int y){
//        return x + y;
//    }
//}

public class EduLambda {
    public static void main(String[] args) {
        // 인터페이스 및 오버라이딩 이용
//        Plus p = new Plus();
//        System.out.println(p.plus(1, 2));

        // 익명 클래스 : 한번만 쓰고 버리는 클래스
//        InterfacePlus obj = new InterfacePlus(){
//            public int plus(int x, int y) {
//                return x + y;
//            }
//        };
//        System.out.println(obj.plus(1, 2));
//
//        // 람다식
//        InterfacePlus lambda = (x, y) -> x + y;
//        System.out.println(lambda.plus(1, 2));

        // 표준 함수형 인터페이스 API
        // <파라미터의 타입, 받는 값의 타입>
        Function<Integer, Integer> funLambda = x -> x + 2;
        System.out.println(funLambda.apply(5));

        // 파라미터 두개로 하고싶을 경우
        // <첫번째 파라미터 타입, 두번째 파라미터 타입, 받는 값의 타입>
        BiFunction<Integer, Integer, Integer> funBiLambda = (x, y) -> x + y;
        System.out.println(funBiLambda.apply(5, 7));

        // 파라미터가 없고, 리턴값이 있는 경우
        Supplier<Integer> funSupplierLambda = () -> 5;
        System.out.println(funSupplierLambda.get());

        // 파라미터랑 리턴값이 있지만 조건식을 boolean으로 표현하는데 사용하는 경우
        Predicate<Integer> funPredicateLambda = x -> x % 2 == 0;
        System.out.println(funPredicateLambda.test(5));

        // 파라미터는 있지만 리턴 값이 없을 경우
//        Consumer<Integer> funConsumerLambda = x -> System.out.println(x);
//        funConsumerLambda.accept("안녕자바");

        // Function 합성
        // andThen
        BiFunction<Integer, Integer, Integer> biFuncPlusLambda = Integer::sum;

        Function<Integer, Integer> biFncMinusLambda = x -> x - 4;

        // andThen 사용시 앞에 biFuncPlusLambda가 먼저 실행되고 그다음 andThen(biFncMinusLambda)가 실행됨
        int result1 = biFuncPlusLambda.andThen(biFncMinusLambda).apply(6,4);
        System.out.println(result1);
        // compose (잘 사용하지 않음)

        // compose 사용시 뒤에 compose(biFncPlusLambda)가 먼저 실행되고 그 다음 앞에 biFncPlusLambda가 실행됨
        Function<Integer, Integer> biFncPlusLambda = x -> x * 2;
        int result2 = biFncPlusLambda.compose(biFncPlusLambda).apply(6);

        // identity (잘 사용하지 않음)
        // 보내준 값을 그대로 리턴함
        Function<Integer, Integer> identityLambda = Function.identity();
        System.out.println(identityLambda.apply(5));



        // Predicate 결합
        Predicate<Integer> greater = x -> x > 0;
        Predicate<Integer> lesser = x -> x < 10;

        // && 결합
        // 둘 다 참이여야 true 반환
        Predicate<Integer> andPredicate = greater.and(lesser);
        System.out.println(andPredicate.test(5));

        // || 결합
        // 둘 중 하나만 참이여도 true 반환
        Predicate<Integer> orPredicate = greater.or(lesser);
        System.out.println(orPredicate.test(100));

        // ! 결합
        // true 일 경우 false로 false일 경우 true 로 반환
        Predicate<Integer> notPredicate = greater.negate();
        System.out.println(notPredicate.test(5));
    }
}
