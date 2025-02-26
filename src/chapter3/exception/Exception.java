package chapter3.exception;

public class Exception extends Throwable {

    //1. 언체크 예외 호출
//    public void callUncheckedException(){
//        try {
//            if (true){
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        }
//        catch (RuntimeException e){
//            System.out.println("언체크 예외 처리");
//        }
//    }
    //2 .체크 예외 호출
    public void callcheckedException() {
        try {
            if (true) {
                System.out.println("체크 예외 발생");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }

    }
}
