package chapter3.exception;

public class Main {
    public static void main(String[] args) {
//        //1. 의도적이지 않은 예외
//        int ret =10/0;
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");

        //2. 의도적인 예외 -throw
//        int age=10;
//        if(age<18){
//            throw new IllegalArgumentException("미성년자 구매할 없습니다");
//        }
//        System.out.println("프로그램 종료");
        //3. 언체크 예외 처리
        Exception exception = new Exception();
        exception.callcheckedException();
        System.out.println("프로그램 종료");
    }
}
