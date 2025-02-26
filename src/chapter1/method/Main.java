package chapter1.method;

public class Main {
    public static void main(String[] args) {
        //1. 객체를 객체화(소환)
        calculator cal = new calculator();

        //[계산기]  계산기 =계산기
        //2. 메서드(함수)를 호출
        int result= cal.sum(5,5);
        System.out.println("result = " + result);
        cal.sum2(7,7);
    }
}

