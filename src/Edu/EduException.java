package Edu;

public class EduException {
    public static void main(String[] args) {
        // 예외 처리
        // 예외는 코드로 수습가능한 처리 에러는 서버와 정전같은 수습이 불가능한 처리

        try {
            // 강제 예외 발생 시키기
            throw new Exception("강제 에러");

//            System.out.println("트라이 블럭");

            // 모든 언어에서 나누기 0 은 에러가 뜬다
//            double result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 캐치 블럭");
        } catch (Exception e) {
            System.out.println("캐치 블럭");

            // 보낸 에러 메세지 확인 가능
            System.out.println(e.getMessage());
        }finally {
            System.out.println("파이널 블럭");
        }
    }
}